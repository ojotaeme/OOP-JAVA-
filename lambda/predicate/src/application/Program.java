package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		double min = 100.0;

//		list.removeIf(p -> p.getPrice() >= 100.0);
//		list.removeIf(new ProductPredicate());
//		list.removeIf(pred);
		list.removeIf(p -> p.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}