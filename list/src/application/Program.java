package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		list.add("Joao");
		list.add("Marcelo");
		list.add("Muniz");
		list.add("Santos");

		list.add(2, "jotaeme");

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------");

		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println(list.size());

		System.out.println("-----------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'j').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		sc.close();

	}

}