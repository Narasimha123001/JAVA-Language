package com.JavaFundamentals.OOPS.features.Abstractions;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("56984589","fifgiebc@ifie.com",(byte)56,(double) 589614,"narsim",8799);

        MySqlRepository repository = new MySqlRepository();
        MongoDbRepository repository1 = new MongoDbRepository();
        CustomerServiceImpl customerService = new CustomerServiceImpl(repository);
        CustomerServiceImpl customerService1 = new CustomerServiceImpl(repository1);

        customerService.addCustomerDb(customer);
        customerService.displayCustomerDetails(customer);

        customerService1.addCustomerDb(customer);
        customerService1.displayCustomerDetails(customer);


    }
}
