package org.sdet5.vendingMachine.implementationClass;

import org.sdet5.vendingMachine.interfaceDesign.IVendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine implements IVendingMachine {

    private Map<String, Double> items;
    private double currentBalance;

    public VendingMachine() {
        items = new HashMap<>();
        currentBalance = 0.0;
    }

    public void addItem(String itemName, double price) {
        items.put(itemName, price);
    }

    public void displayItems() {
        System.out.println("Available Items:");
        for (Map.Entry<String, Double> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
    }


    public void insertMoney(double amount) {
        currentBalance += amount;
        System.out.println("Current Balance: $" + currentBalance);
    }
    public double selectItem(String itemName) {
        if (items.containsKey(itemName)) {
            double itemPrice = items.get(itemName);
            if (currentBalance >= itemPrice) {
                currentBalance -= itemPrice;
                System.out.println("You have successfully purchased " + itemName);
                System.out.println("Remaining Balance amount: " + currentBalance);
                return currentBalance;
            } else {
                System.out.println("Insufficient funds. Please insert more money.");
            }
        } else {
            System.out.println("Invalid item selection. Please choose a valid item.");
        }
        return currentBalance;

    }
}
