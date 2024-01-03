package org.sdet5.vendingMachine.interfaceDesign;
import java.util.Map;

public interface IVendingMachine {
    public void addItem(String itemName, double price);

    public void displayItems();

    public void insertMoney(double amount);

    public double  selectItem(String itemName);
}
