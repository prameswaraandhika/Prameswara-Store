package com.mycompany.prameswara.store.menu.impl;

import java.util.List;

import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.menu.Menu;
import com.mycompany.prameswara.store.configs.ApplicationContext;
import com.mycompany.prameswara.store.enteties.User;
import com.mycompany.prameswara.store.services.UserManagementService;
import com.mycompany.prameswara.store.services.impl.DefaultUserManagementService;

public class CustomerListMenu implements Menu {

    private ApplicationContext context;
    private UserManagementService userManagementService;

    {
        userManagementService = DefaultUserManagementService.getInstance();
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        List<User> users = userManagementService.getUsers();

        if (users == null || users.size() == 0) {
            System.out.println("Unfortunately, there are no customers.");
        } else {
            for (User user : users) {
                System.out.println(user);
            }
        }
        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** USERS *****");
    }

}
