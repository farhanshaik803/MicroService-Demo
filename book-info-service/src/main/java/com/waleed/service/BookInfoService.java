package com.waleed.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.waleed.dto.Book;

@Service
public class BookInfoService {
	
	
	@Autowired
	RestTemplate template;

	public Book getBookById(Integer id){
		return new Book(56, "Java - Complete Reference");
	}

	
	@HystrixCommand(fallbackMethod = "stillWorks")
	public List<Object> getEntireBookCatalog(Integer userId) {
//		return template.getForObject("http://localhost:8081/catalog/789", String.class);
		
//		OR
		
//Object[] dataFromAnotherService =  template.getForObject("http://localhost:8081/catalog/789", Object[].class);
		
//		Or Better: 
Object[] dataFromAnotherService =  template.getForObject("http://book-catalogue/catalog/789", Object[].class);

return Arrays.asList(dataFromAnotherService);
	}
	
	
	
	public List<Object> stillWorks(Integer id){
		return Arrays.asList(
				new Book(890, "Life of a Programmer"),
				new Book(891, "Java is Fun")
				);
	}
	
	
	
	
	
	
}
