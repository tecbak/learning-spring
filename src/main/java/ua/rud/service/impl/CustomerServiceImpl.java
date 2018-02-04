package ua.rud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.rud.model.Customer;
import ua.rud.repository.CustomerRepository;
import ua.rud.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(Customer customer) {
        repository.saveAndFlush(customer);
    }
}
