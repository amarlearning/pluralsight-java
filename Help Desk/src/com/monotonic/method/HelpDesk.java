package com.monotonic.method;

import com.monotonic.Category;
import com.monotonic.Customer;
import com.monotonic.Enquire;
import com.monotonic.test.CustomerDefaults;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

    private final Queue<Enquire> enqueries = new ArrayDeque<>();

    public static void main(String[] args) {

        HelpDesk helpdesk = new HelpDesk();

        helpdesk.enquire(CustomerDefaults.JACK, Category.PHONE);
        helpdesk.enquire(CustomerDefaults.JILL, Category.PRINTER);
        helpdesk.enquire(CustomerDefaults.JILL, Category.PRINTER);

        helpdesk.processAllEnqueries();

    }

    public void enquire(final Customer customer, final Category category) {
        enqueries.offer(new Enquire(customer, category));
    }

    public void processAllEnqueries() {

        Enquire enquire;

        while ((enquire = enqueries.poll()) != null) {
            if (enquire != null) {
                enqueries.remove();
                enquire.getCustomer().reply("Have you tried turning it off and on?");
            }
        }

    }

}
