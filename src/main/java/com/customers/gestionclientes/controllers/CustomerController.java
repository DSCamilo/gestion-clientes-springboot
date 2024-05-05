package com.customers.gestionclientes.controllers;


import com.customers.gestionclientes.entities.Customer;
import com.customers.gestionclientes.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/customer/{customerID}") //Traer un cliente especifico
    public Customer getCustomer(@PathVariable Integer  customerID){
      return service.getCustomer(customerID);
    }

    @GetMapping("/customer") //Traer todos los clientes
    public List<Customer> getAllCustomers(){
        return service.getAllCustomers();
    }

    @DeleteMapping("/customer/{customerID}") //Eliminar un cliente especifico
    public  void removeCustomer(@PathVariable Integer customerID){
        service.removeCustomer(customerID);
    }

    @PostMapping("/customer") //Agregar cliente
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }

    @PutMapping("/customer/{customerId}") //Actualizar cliente
    public void upodateCustomer(@PathVariable Integer customerId,
                                @RequestBody Customer updateCustomer){
        service.updateCustomer(customerId, updateCustomer);
    }

    @GetMapping("/customer/search") //Buscar un cliente especifico
    public List<Customer> searchCustomer(@RequestParam(name = "email", required = false) String  email,
                                         @RequestParam(name = "address", required = false) String address){
        return service.searchCustomer(email, address);
    }

    }

