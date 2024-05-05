package com.customers.gestionclientes.services;

import com.customers.gestionclientes.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    private List<Customer> listCustomers =   new ArrayList<>();

    public CustomerServiceImp() {

        Customer c = new Customer();
        c.setCustomerId(1);
        c.setFirstName("John");
        c.setLastName("Benitez");
        c.setEmail("John@customer.com");
        c.setAddress("El problado CC");
        listCustomers.add(c);

        Customer c2 = new Customer();
        c2.setCustomerId(2);
        c2.setFirstName("Dayana");
        c2.setLastName("Mutis");
        c2.setEmail("dm@customer.com");
        c2.setAddress("Barrio La Plaza");
        listCustomers.add(c2);

        Customer c3 = new Customer();
        c3.setCustomerId(2);
        c3.setFirstName("Alejandra");
        c3.setLastName("Fernandez");
        c3.setEmail("af@customer.com");
        c3.setAddress("Barrio La Cadena");
        listCustomers.add(c3);
    }

    public Customer getCustomer(Integer  customerID){
        for (Customer customer:listCustomers){
            if(customer.getCustomerId() == customerID){
                return customer;
            }
        }
        return null;
    }

    public List<Customer> getAllCustomers(){
        return listCustomers;
    }

    public  void removeCustomer(Integer  customerID){
        for (Customer customer:listCustomers){
            if(customer.getCustomerId() == customerID){
                listCustomers.remove(customer);
                break;
            }
        }
    }

    public void addCustomer( Customer customer){
        listCustomers.add(customer);
    }

    public void updateCustomer(Integer customerId, Customer updateCustomer){
        for(Customer customer : listCustomers){
            if (customer.getCustomerId() == customerId) {
                listCustomers.remove(customer);
                updateCustomer.setCustomerId(customerId);
                listCustomers.add(updateCustomer);
                break;
            }
        }
    }

    public List<Customer> searchCustomer( String  email, String address){
        List<Customer> searchCustomers = new ArrayList<>();

        if (email != null){
            for (Customer customer:listCustomers){
                if(customer.getEmail().contains(email)){
                    searchCustomers.add(customer);
                }
            }
        }
        if (address != null ){
            for (Customer customer:listCustomers){
                if(customer.getAddress().contains(address)){
                    searchCustomers.add(customer);
                }
            }
        }
        return searchCustomers;
    }
}
