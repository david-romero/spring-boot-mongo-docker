package org.davromalc.tutorial.model;

import org.springframework.data.annotation.Id;

import lombok.Data;


@Data
public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;

}
