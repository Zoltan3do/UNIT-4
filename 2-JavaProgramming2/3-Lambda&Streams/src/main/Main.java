package main;

import java.util.ArrayList;
import java.util.List;
import entities.Product;
import utils.Utils;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Baby Stroller", "Baby", 150.00));
        productList.add(new Product(2, "Toy Car", "Boys", 50.00));
        productList.add(new Product(3, "Book A", "Books", 90.00));
        productList.add(new Product(4, "Book B", "Books", 120.00));
        productList.add(new Product(5, "Baby Crib", "Baby", 200.00));
        productList.add(new Product(6, "Action Figure", "Boys", 60.00));
        productList.add(new Product(7, "Book C", "Books", 80.00));

        System.out.println("Prodotti categoria Baby:");
        List<Product> babyProducts = Utils.babies(productList);
        babyProducts.forEach(System.out::println);

        System.out.println("\nLibri con prezzo inferiore a 100:");
        List<Product> cheapBooks = Utils.booksUnderPrice(productList);
        cheapBooks.forEach(System.out::println);
        
        System.out.println("\nProdotti categoria Boys con sconto del 10%:");
        List<Product> discountedBoys = Utils.boysDiscounted(productList);
        discountedBoys.forEach(System.out::println);
    }
}
