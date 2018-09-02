package com.monotonic.method;

import com.monotonic.Category;
import com.monotonic.Customer;
import com.monotonic.Enquire;
import com.monotonic.test.CustomerDefaults;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import static com.monotonic.Category.PRINTER;

public class CategorisedHelpDeskJava8 {

    private final Queue<Enquire> enqueries = new ArrayDeque<>();

    public static void main(String[] args) {

        CategorisedHelpDeskJava8 helpdesk = new CategorisedHelpDeskJava8();

        helpdesk.enquire(CustomerDefaults.JACK, Category.PHONE);
        helpdesk.enquire(CustomerDefaults.JILL, Category.PRINTER);

        helpdesk.processPrinterEnqueries();
        helpdesk.processGeneralEnqueries();
        helpdesk.processPrinterEnqueries();

    }

    public void enquire(final Customer customer, final Category category) {
        enqueries.offer(new Enquire(customer, category));
    }

    public void processPrinterEnqueries() {

        processEnqueries((enq -> enq.getCategory() == PRINTER), "Is it out of paper?");
    }

    public void processGeneralEnqueries() {

        processEnqueries((enq -> enq.getCategory() != PRINTER), "Have you tried turning it off and on?");
    }

    public void processEnqueries(Predicate<Enquire> predicate, String message) {
        final Enquire enquire = enqueries.peek();

        if (enquire != null && predicate.test(enquire)) {
            enqueries.remove();
            enquire.getCustomer().reply(message);
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

}
