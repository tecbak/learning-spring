package ua.rud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.rud.model.Customer;
import ua.rud.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService service;

    @Autowired
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @RequestMapping(path = "/add/{firstName}/{lastName}", method = RequestMethod.GET)
    public ResponseEntity<?> add(@PathVariable String firstName, @PathVariable String lastName) {
//    @RequestMapping(path = "/add", method = RequestMethod.GET)
//    public void add() {
        Customer customer = new Customer(firstName, lastName);
        service.add(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
