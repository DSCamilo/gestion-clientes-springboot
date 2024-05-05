package com.customers.gestionclientes.services;

import com.customers.gestionclientes.entities.Customer;
import java.util.List;

public interface CustomerService {

    Customer getCustomer(Integer  customerID);
    List<Customer> getAllCustomers();
    void removeCustomer(Integer  customerID);
    void addCustomer( Customer customer);
    void updateCustomer(Integer customerId, Customer updateCustomer);
    List<Customer> searchCustomer( String  email, String address);

    default void hacerAlgo(){
        System.out.println("Probando interfaces");
    }
}
