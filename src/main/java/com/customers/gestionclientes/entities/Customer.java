package com.customers.gestionclientes.entities;

import lombok.*;


@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Customer {

    private Integer customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

}
