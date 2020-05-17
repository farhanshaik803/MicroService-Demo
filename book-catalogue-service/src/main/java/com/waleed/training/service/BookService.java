package com.waleed.training.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.waleed.training.model.BookCatalogueItem;

@Service
public class BookService {

	public List<BookCatalogueItem> getBookCatalogById(Integer id) {
		return Arrays.asList(
				new BookCatalogueItem("Alchemist", "A Book about life", 4),
				new BookCatalogueItem("Who moved my Cheese", "Embracing Change", 5),
				new BookCatalogueItem(".Net Refresher", "A Book about .Net technology", 3)
				);
	}

	
	
}
