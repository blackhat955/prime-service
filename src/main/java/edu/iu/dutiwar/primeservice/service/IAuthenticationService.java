package edu.iu.dutiwar.primeservice.service;

import edu.iu.dutiwar.primeservice.model.Customer;
import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}
