package com.pluralsight;


import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {


        // create an ArrayList to hold the shopping list
        ArrayList<String> shoppingList = new ArrayList<>();

//        using System.out.println
        System.out.println("Shopping List");
        System.out.println("-----------------");
        System.out.println("1. Bread");
        System.out.println("2. Milk");
        System.out.println("3. Eggs");
        System.out.println("4. Butter");
        System.out.println("5. Sugar");
        System.out.println("6. Salt");
        System.out.println("7. Pepper");
        System.out.println("8. Cheese");
        System.out.println("9. Apples");
        System.out.println("10. Oranges");
        System.out.println("11. Bananas");
        System.out.println("12. Grapes");
        System.out.println("13. Strawberries");

//        using ArrayList
        // add items to the shopping list
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Butter");
        shoppingList.add("Sugar");
        shoppingList.add("Salt");
        shoppingList.add("Pepper");
        shoppingList.add("Cheese");
        shoppingList.add("Apples");
        shoppingList.add("Oranges");
        shoppingList.add("Bananas");
        shoppingList.add("Grapes");
        shoppingList.add("Strawberries");

        System.out.println("\nShopping List:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }
}