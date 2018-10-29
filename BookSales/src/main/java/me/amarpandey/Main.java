package me.amarpandey;

import java.util.HashMap;
import java.util.List;

public class Main {

	private static BookSales booksales = new BookSales();

	public static void main(String[] args) {

		List<Book> bookList = null;
		List<Sales> salesList = null;
		HashMap<String, String> argumemtMap = new HashMap<>();

		if (args.length > 0) {

			argumemtMap = booksales.convertKeyValueToMap(args);

			bookList = booksales.fetchBookList(argumemtMap);
			salesList = booksales.fetchSalesList(argumemtMap);

			if (bookList.isEmpty() || salesList.isEmpty()) {
				System.out.println("Insufficient argument passed, terminating");
				System.exit(0);
			}

			booksales.doAnalysisOnPassedArgument(argumemtMap);

		} else {
			System.out.println("No argument passed, terminating");
		}
	}
}
