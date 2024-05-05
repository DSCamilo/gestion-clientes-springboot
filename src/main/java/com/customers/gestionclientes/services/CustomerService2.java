package com.customers.gestionclientes.services;

import com.customers.gestionclientes.entities.Customer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService2 {


    /*private List<Customer> listCustomers =   new ArrayList<>();

    public CustomerController() {

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
    }


    @GetMapping("/customer/{customerID}") //Traer un cliente especifico
    public Customer getCustomer(@PathVariable Integer  customerID){
        for (Customer customer:listCustomers){
            if(customer.getCustomerId() == customerID){
                return customer;
            }
        }
        return null;
    }

    @GetMapping("/customer") //Traer todos los clientes
    public List<Customer> getAllCustomers(){
        return listCustomers;
    }

    @DeleteMapping("/customer/{customerID}") //Eliminar un cliente especifico
    public  void removeCustomer(@PathVariable Integer  customerID){
        for (Customer customer:listCustomers){
            if(customer.getCustomerId() == customerID){
                listCustomers.remove(customer);
                break;
            }
        }
    }

    @PostMapping("/customer") //Agregar cliente
    public void addCustomer(@RequestBody Customer customer){
        listCustomers.add(customer);
    }

    @PutMapping("/customer/{customerId}") //Actualizar cliente
    public void upodateCustomer(@PathVariable Integer customerId,
                                @RequestBody Customer updateCustomer){
        for(Customer customer : listCustomers){
            if (customer.getCustomerId() == customerId) {
                listCustomers.remove(customer);
                updateCustomer.setCustomerId(customerId);
                listCustomers.add(updateCustomer);
                break;
            }
        }

    }

    @GetMapping("/customer/search") //Buscar un cliente especifico
    public List<Customer> searchCustomer(@RequestParam(name = "email", required = false) String  email,
                                         @RequestParam(name = "address", required = false) String address){
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
    }*/


}
