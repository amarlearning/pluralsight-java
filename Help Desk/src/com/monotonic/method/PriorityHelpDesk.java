package com.monotonic.method;

import com.monotonic.Category;
import com.monotonic.Customer;
import com.monotonic.Enquire;
import com.monotonic.test.CustomerDefaults;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityHelpDesk {

    private static final Comparator<Enquire> BY_CATEGORY = new Comparator<Enquire>() {

        @Override
        public int compare(Enquire o1, Enquire o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };

    private final PriorityQueue<Enquire> enqueries = new PriorityQueue<>(BY_CATEGORY);

    public static void main(String[] args) {

        PriorityHelpDesk helpdesk = new PriorityHelpDesk();

        helpdesk.enquire(CustomerDefaults.JILL, Category.PRINTER);
        helpdesk.enquire(CustomerDefaults.MARY, Category.MONITOR);
        helpdesk.enquire(CustomerDefaults.JACK, Category.PHONE);

        helpdesk.processAllEnqueries();

    }

    public void enquire(final Customer customer, final Category category) {
        enqueries.offer(new Enquire(customer, category));
    }

    public void processAllEnqueries() {

        Enquire enquire;

        while ((enquire = enqueries.poll()) != null) {
            enquire.getCustomer().reply("Have you tried turning it off and on?");
        }
    }

}
