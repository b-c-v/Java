package com.bcv.lessons.HorstmannBook.Chapter3;

/**
 * A menu that displayed on a console
 */
public class MenuDisplay {
    public static void main(String[] args) {
        Menu aMenu = new Menu();
        aMenu.addOption("Open new account");
        aMenu.addOption("Log into existing account");
        aMenu.addOption("Help");
        aMenu.addOption("Quit");
        aMenu.display();
    }

    public static class Menu {
        private String menuText;
        private int optionCount;

        /**
         * Construct a menu with no options
         */
        public Menu() {
            menuText = "";
            optionCount = 0;

        }

        /**
         * Adds an option to the end of this menu.
         *
         * @param option the option to add
         */
        public void addOption(String option) {
            this.optionCount = optionCount + 1;
            this.menuText = menuText + optionCount + ")" + option + "\n";
        }

        /**
         * Displays the menu on the console.
         */
        public void display() {
            System.out.println(menuText);

        }
    }
}
