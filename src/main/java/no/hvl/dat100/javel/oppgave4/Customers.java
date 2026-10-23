package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {

        this.customers = new Customer[size];

    }

    // b) count number of non-null references
    public int countNonNull() {

        int count = 0;

        for (Customer customer : customers) {
            if (customer != null) count++;
        }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;
        int i = 0;

        while (i < this.customers.length && !funnet) {
            c = this.customers[i];

            if (c != null && c.getCustomer_id() == customer_id) {
                funnet = true;
            }
            i++;
        }
        if (funnet) {
            return c;
        } else {
            return null;
        }
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                inserted = true;
                break;
            }
        }
        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        // boolean deleted = false; Ikke nødvendig når jeg bruker denne for-løkken.
        Customer c = null;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getCustomer_id() == customer_id) {
                c = customers[i];
                customers[i] = null;
                break;
            }
        }
        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;

        customers = new Customer[countNonNull()];
        int j = 0;

        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i] != null) {
                customers[j] = this.customers[i];
                j++;
            }
        }
        return customers;
    }
}