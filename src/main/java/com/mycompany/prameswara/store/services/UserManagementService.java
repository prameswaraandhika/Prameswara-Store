package com.mycompany.prameswara.store.services;

import java.util.List;

import com.mycompany.prameswara.store.enteties.User;

public interface UserManagementService {

    String registerUser(User user);

    List<User> getUsers();

    User getUserByEmail(String userEmail);

}
