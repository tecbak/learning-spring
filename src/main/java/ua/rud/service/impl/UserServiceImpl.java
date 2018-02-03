package ua.rud.service.impl;

import org.springframework.stereotype.Service;
import ua.rud.model.User;
import ua.rud.service.UserService;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final List<User> users;

    public UserServiceImpl() {
        users = Arrays.asList(
                new User("John", "Smith"),
                new User("Marry", "Black")
        );

    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
