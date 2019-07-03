package com.example.demo2;

import java.util.ArrayList;
import java.util.Collections;

public class PizzaType {
    public PizzaType() {
        ArrayList<String> pizzaType = new ArrayList<String>();
        pizzaType.add("pepperoni");
        pizzaType.add("caprese");
        pizzaType.add("sicilia");
        pizzaType.add("mexico");

        Collections.sort(pizzaType);
        pizzaType.forEach(name -> System.out.println((name)));
    }
}
