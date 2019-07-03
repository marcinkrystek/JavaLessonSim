package com.example.demo2;

import java.util.ArrayList;
import java.util.Collections;

public class PizzaSize {
    public PizzaSize() {
        ArrayList<String> pizzaSize = new ArrayList<String>();
        pizzaSize.add("18");
        pizzaSize.add("25");
        pizzaSize.add("36");

        Collections.sort(pizzaSize);
        pizzaSize.forEach(name -> System.out.println((name)));
    }
}
