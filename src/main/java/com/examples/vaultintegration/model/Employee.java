package com.examples.vaultintegration.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {

    private int id;
    private String firstName;
    private String lastName;

}
