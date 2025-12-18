package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        System.out.println("//Old style");
        greetCustomer(new Customer("Jay", "0711778833"));

        System.out.println("\nUsing Consumer");
        greetCustomerConsumer.accept(new Customer("Jay", "0711778833"));

        System.out.println("\nUsing BiConsumer");
        greetCustomerConsumerBiFunction.accept(new Customer("Jay", "0711778833"), false);
    }

    private static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hi " + customer.getCustomerName() + " thanks for registering with your phone number" + customer.getCustomerPhoneNumber());

    private static BiConsumer<Customer, Boolean> greetCustomerConsumerBiFunction = (customer, showPhoneNumber) ->
            System.out.println("Hi " + customer.getCustomerName() +
                    " thanks for registering with your phone number " + (showPhoneNumber ? customer.getCustomerPhoneNumber() : "*********"));

    static void greetCustomer(Customer customer) {
        System.out.println("Hi " + customer.getCustomerName() + " thanks for registering with your " + customer.getCustomerPhoneNumber());
    }

    static class Customer {

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        public String getCustomerName() {
            return customerName;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }
    }
}
