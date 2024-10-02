package utils;

import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import interfaces.BabyInterface;
import interfaces.BooksInterface;

public class Utils {
	
	public static List<Product> babies(List<Product> products){
		
		BabyInterface filteredBabies = (List<Product> productList) -> 
		productList.stream()
		.filter(p -> p.getCategory().equalsIgnoreCase("Baby"))
		.collect(Collectors.toList());
		
		List<Product> babies = filteredBabies.babies(products);
		return babies;
		
	}
	
	public static List<Product> booksUnderPrice(List<Product> products) {
		
		BooksInterface filteredBooks = (List<Product> productList) -> 
		productList.stream()
		.filter(p -> p.getPrice() < 100 && p.getCategory().equalsIgnoreCase("Books"))
		.collect(Collectors.toList());
		
		List<Product> booksUnderPriced = filteredBooks.underUndred(products);
		return booksUnderPriced;
		
	}


}
