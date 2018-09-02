package com.monotonic.method;

import static com.monotonic.Category.PRINTER;

import java.util.ArrayDeque;
import java.util.Queue;

import com.monotonic.Category;
import com.monotonic.Customer;
import com.monotonic.Enquire;
import com.monotonic.test.CustomerDefaults;

public class CategorisedHelpDesk {

	private final Queue<Enquire> enqueries = new ArrayDeque<>();

	public void enquire(final Customer customer, final Category category) {
		enqueries.offer(new Enquire(customer, category));
	}

	public void processPrinterEnqueries() {
		
		final Enquire enquire = enqueries.peek();

		if (enquire != null && enquire.getCategory() == PRINTER) {
			enqueries.remove();
			enquire.getCustomer().reply("Is it out of paper?");
		} else {
			System.out.println("No work to do, let's have some coffee!");
		}
		
	}

	public void processGeneralEnqueries() {
	
		final Enquire enquire = enqueries.peek();

		if (enquire != null && enquire.getCategory() != PRINTER) {
			enqueries.remove();
			enquire.getCustomer().reply("Have you tried turning it off and on?");
		} else {
			System.out.println("No work to do, let's have some coffee!");
		}
	
	
	}

	public static void main(String[] args) {

		CategorisedHelpDesk helpdesk = new CategorisedHelpDesk();

		helpdesk.enquire(CustomerDefaults.JACK, Category.PHONE);
		helpdesk.enquire(CustomerDefaults.JILL, Category.PRINTER);

		helpdesk.processPrinterEnqueries();
		helpdesk.processGeneralEnqueries();
		helpdesk.processPrinterEnqueries();

	}

}
