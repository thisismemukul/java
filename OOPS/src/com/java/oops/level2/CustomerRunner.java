package com.java.oops.level2;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("597 pratap nagar","Jaipur","302039");
        Customer customer = new Customer("Mukul",homeAddress);
        Address workAddress = new Address("Officwe","Jaipur","302029");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
