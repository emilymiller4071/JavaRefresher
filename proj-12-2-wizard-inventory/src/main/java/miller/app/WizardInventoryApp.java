package miller.app;

import miller.presentation.Console;

import java.util.ArrayList;
import java.util.List;

public class WizardInventoryApp {
    public static void main(String[] args) {

        System.out.println("The Wizard Inventory game\n");

        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("wooden staff");
        inventory.add("wizard hat");
        inventory.add("cloth shoes");

        displayMenu();

        System.out.println();

        while (true) {
            String choice = Console.getString("Command: ");
            if (choice.isEmpty()) {
                System.out.println("This is a required entry. Try again.\n");
            } else if (choice.equalsIgnoreCase("show")) {
                showItems(inventory);
            } else if (choice.equalsIgnoreCase("grab")) {
                grabItem(inventory);
            } else if (choice.equalsIgnoreCase("edit")) {
                editItem(inventory);
            } else if (choice.equalsIgnoreCase("drop")) {
                dropItem(inventory);
            } else if (choice.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Error! Invalid entry. Try again.\n");
            }
        }
        System.out.println("Goodbye!");
    }

    // display Command Menu
    public static void displayMenu() {
        System.out.println("COMMAND MENU");
        System.out.println("show - Show all items");
        System.out.println("grab - Grab an item");
        System.out.println("edit - Edit an item");
        System.out.println("drop - Drop an item");
        System.out.println("exit - Exit program");
        System.out.println();
    }

    // method to show items
    public static void showItems(List<String> inventory) {
        for (String item : inventory) {
            System.out.println((inventory.indexOf(item) + 1) + ". " + item);
        }
        System.out.println();
    }

    // method to grab item
    public static void grabItem(List<String> inventory) {
        if (inventory.size() >= 4) {
            System.out.println("You can't carry any more items. Drop something first.\n");
        } else {
            String item = Console.getString("Name: ");
            inventory.add(item);
            System.out.println(item + " was added.\n");
        }
    }

    // method to edit item
    public static void editItem(List<String> inventory) {
        boolean isValid = false;
        while (!isValid) {
            int number = Console.getInt("Number: ");
            if (number < 1 || number > inventory.size()) {
                System.out.println("Invalid number. Try again.");
            } else {
                String updatedItem = Console.getString("Updated Name: ");
                inventory.set(number - 1, updatedItem);
                System.out.println("Item number " + number + " was updated to: " + updatedItem + "\n");
                isValid = true;
            }
        }
    }

    // method to drop item
    public static void dropItem(List<String> inventory) {
        boolean isValid = false;
        while (!isValid) {
            int number = Console.getInt("Number: ");
            if (number < 1 || number > inventory.size()) {
                System.out.println("Invalid number. Try again.");
            } else {
                String droppedItem = inventory.get(number - 1);
                System.out.println(droppedItem + " was dropped.");
                inventory.remove(droppedItem);
                isValid = true;
                System.out.println();
            }

        }
    }
}