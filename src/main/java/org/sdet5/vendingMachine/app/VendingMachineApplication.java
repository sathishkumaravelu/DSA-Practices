package org.sdet5.vendingMachine.app;

import org.sdet5.vendingMachine.implementationClass.VendingMachine;
import org.testng.annotations.Test;

public class VendingMachineApplication extends VendingMachine {
    VendingMachine vendingMachine;

    @Test
    public void test() {
        vendingMachine = new VendingMachine();
        vendingMachine.addItem("Iphone", 50);
        vendingMachine.addItem("samsung", 70);
        vendingMachine.addItem("oneplus", 10);


        vendingMachine.displayItems();
        vendingMachine.insertMoney(100);
        int currentBalance = (int) vendingMachine.selectItem("Iphone");
        System.out.println("current balance : $ "+ currentBalance);
    }
}
