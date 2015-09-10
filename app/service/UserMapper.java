package service;

import model.User;

import java.util.List;

public interface UserMapper {
    List<User> all();

    User getUserById(Long id);
}
