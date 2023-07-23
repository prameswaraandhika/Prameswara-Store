package com.mycompany.prameswara.store.menu.impl;

import java.util.Scanner;

import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.menu.Menu;
import com.mycompany.prameswara.store.configs.ApplicationContext;

public class ChangePasswordMenu implements Menu {

    private ApplicationContext context;

    {
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        context.getLoggedInUser().setPassword(userInput);
        System.out.println("Your password has been successfully changed");
        new MainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** CHANGE PASSWORD *****");
        System.out.print("Enter new password: ");
    }

}
