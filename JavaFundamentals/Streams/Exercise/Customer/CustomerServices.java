package com.JavaFundamentals.Streams.Exercise.Customer;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerServices {
    private CustomerRepository customerRepository;

    public CustomerServices(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomerList(){
        return this.customerRepository.getCustomerList();
    }

    public List<Customer> getCustomerByAge(byte age){
        return this.customerRepository.getCustomerList().stream()
                .filter(customer -> customer.getAge() > age)
                .collect(Collectors.toList());
    }
    public List<String> getCustomerNames(){
        return this.customerRepository.getCustomerList().stream().map(Customer::getName).toList();
    }

    public List<Customer> getSortedCustomerByAge(){
        return this.customerRepository.getCustomerList().stream()
                .sorted((c1,c2)->Integer.compare(c1.getAge(), c2.getAge()))
                .collect(Collectors.toList());
    }

    public Integer getSumOfAges(){
        return this.customerRepository.getCustomerList().stream()
                .map(Customer::getAge)
                .reduce(0,Integer::sum);
    }
    public List<String> customerNamesInList(){
        return this.customerRepository.getCustomerList().stream()
                .map(Customer::getName)
                .collect(Collectors.toList());
    }
    public String customerNameJoined(){
        return this.customerRepository.getCustomerList().stream()
                .map(Customer::getName)
                .collect(Collectors.joining(","));
    }
    public Map<String,List<Customer>> groupByCities(){
        return this.customerRepository.getCustomerList().stream()
                .collect(Collectors.groupingBy(Customer::getCity));
    }
    public Map<Boolean, List<Customer>> partitionedByAge(){
        return this.customerRepository.getCustomerList().stream()
                .collect(Collectors.partitioningBy(c->c.getAge()>19));
    }
}
