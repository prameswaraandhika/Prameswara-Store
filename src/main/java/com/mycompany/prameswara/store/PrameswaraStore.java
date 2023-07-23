package com.mycompany.prameswara.store;

import com.itbulls.learnit.javacore.jcf.hw.onlinestore.withlist.menu.Menu;
import com.mycompany.prameswara.store.menu.impl.MainMenu;

/**
 *
 * @author Andhika Prameswara <prameswaara@gmail.com>
 */
public class PrameswaraStore {

    public static final String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
        Menu mainMenu = new MainMenu();
        mainMenu.start();
    }
}
