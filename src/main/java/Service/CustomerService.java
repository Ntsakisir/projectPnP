
package Service;

import Entity.Customer;
import Repository.CustomerRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
     private static List<Customer> customers;
    
    public Customer save(Customer customer){
        Customer c = new Customer();
        c.setFirstName(customer.getFirstName());
      c.setLastName(customer.getLastName());
        c.setEmailAddress(customer.getEmailAddress());
        c.setContactNumber(customer.getContactNumber());
//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); 
//        String password = passwordEncoder.encode(customer.getPassword());
        c.setPassword(customer.getPassword());
    return customerRepo.save(c);
    }
}
