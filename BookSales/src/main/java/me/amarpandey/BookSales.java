package me.amarpandey;

import static me.amarpandey.Constants.BOOKS;
import static me.amarpandey.Constants.SALES;
import static me.amarpandey.Constants.SALES_ON_DATE;
import static me.amarpandey.Constants.SKIP;
import static me.amarpandey.Constants.TOP_CUSTOMERS;
import static me.amarpandey.Constants.TOP_SELLING_BOOKS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Stream;

import me.amarpandey.Sales.PaymentMethod;

public class BookSales {

	private List<Sales> salesList = new ArrayList<>();
	private List<Book> bookList = new ArrayList<>();
	private SortedMap<Integer, String> bookSaleCount = new TreeMap<Integer, String>(Collections.reverseOrder());

	public HashMap<String, String> convertKeyValueToMap(String[] args) {

		HashMap<String, String> argumentMap = new HashMap<>();

		for (String arg : args) {

			String[] split = arg.split("\\s*=\\s*");

			String key = split[0].substring(2);
			String value = split[1];

			argumentMap.put(key, value);
		}

		return argumentMap;
	}

	public List<Book> fetchBookList(HashMap<String, String> argumemtMap) {

		if (argumemtMap.containsKey(BOOKS)) {

			String filepath = argumemtMap.get(BOOKS);

			try (Stream<String> stream = Files.lines(Paths.get(filepath))) {

				stream.forEach(line -> {
					String[] bookProperties = line.split("\\s*,\\s*");

					String book_id = bookProperties[0];
					String book_title = bookProperties[1];
					String book_author = bookProperties[2];
					Double book_price = Double.parseDouble(bookProperties[3]);

					Book book = new Book(book_id, book_title, book_author, book_price);

					bookList.add(book);
				});

			} catch (IOException e) {
				System.out.println(e.getClass().getName() + ": " + e.getMessage());
			}
		}

		return bookList;
	}

	public List<Sales> fetchSalesList(HashMap<String, String> argumemtMap) {

		if (argumemtMap.containsKey(SALES)) {

			String filepath = argumemtMap.get(SALES);

			try (Stream<String> stream = Files.lines(Paths.get(filepath))) {

				stream.forEach(line -> {
					String[] saleDetails = line.split("\\s*,\\s*");

					LocalDate date = LocalDate.parse(saleDetails[0]);
					String email = saleDetails[1];
					PaymentMethod paymentMethod = PaymentMethod.valueOf(saleDetails[2]);
					int itemCount = Integer.parseInt(saleDetails[3]);

					for (int itr = 1; itr <= itemCount; itr++) {

						String[] bookIdCountDetails = saleDetails[itr + SKIP].split(";");

						String bookId = bookIdCountDetails[0];
						Integer count = Integer.parseInt(bookIdCountDetails[1]);

						bookSaleCount.put(count, bookId);
					}

					salesList.add(new Sales(date, email, paymentMethod, itemCount));
				});

			} catch (IOException e) {
				System.out.println(e.getClass().getName() + ": " + e.getMessage());
			} catch (DateTimeParseException e) {
				System.out.println(e.getClass().getName() + ": " + e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println(e.getClass().getName() + ": " + e.getMessage());
			}
		}

		return salesList;
	}

	public void doAnalysisOnPassedArgument(HashMap<String, String> argumemtMap) {

		boolean isAnyAnalysisDone = false;

		if (argumemtMap.containsKey(TOP_SELLING_BOOKS)) {
			isAnyAnalysisDone = true;
			int top_selling_books_count = Integer.parseInt(argumemtMap.get(TOP_SELLING_BOOKS));
			this.getTopSellingBooksBasedOnCount(top_selling_books_count);
		}

		if (argumemtMap.containsKey(TOP_CUSTOMERS)) {
			isAnyAnalysisDone = true;
			int top_customers_count = Integer.parseInt(argumemtMap.get(TOP_CUSTOMERS));
			this.getTopCustomerBasedOnCount(top_customers_count);
		}

		if (argumemtMap.containsKey(SALES_ON_DATE)) {
			isAnyAnalysisDone = true;
			LocalDate sales_on_date_count = LocalDate.parse(argumemtMap.get(SALES_ON_DATE));
			this.getSaleBasedOnDate(sales_on_date_count);
		}

		if (!isAnyAnalysisDone) {
			System.out.println("No analysis argument passed, terminating");
		}
	}

	private void getTopSellingBooksBasedOnCount(int top_selling_books_count) {

	}

	private void getTopCustomerBasedOnCount(int top_customers_count) {

	}

	private void getSaleBasedOnDate(LocalDate sales_on_date_count) {

	}

	public List<Sales> getSalesList() {
		return salesList;
	}

	public void setSalesList(List<Sales> salesList) {
		this.salesList = salesList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

}
