
package Controller;

import Entity.Customer;
import Service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    
      @Autowired
private CustomerService customerService;
    private List<Customer> customers;
     @RequestMapping( value = "create",method = RequestMethod.POST)
    public Customer register(@RequestBody Customer customer){
        customerService.save(customer);
        return customer;
    }
}
