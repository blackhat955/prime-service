package edu.iu.dutiwar.primeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String username;
    private String password;

}
