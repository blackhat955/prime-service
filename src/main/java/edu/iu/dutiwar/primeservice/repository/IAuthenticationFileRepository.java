package edu.iu.dutiwar.primeservice.repository;

import edu.iu.dutiwar.primeservice.model.Customer;
import java.io.IOException;

public interface IAuthenticationFileRepository {

    boolean save (Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;

}
