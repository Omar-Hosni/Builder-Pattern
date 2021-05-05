package com.company;
import java.util.LinkedList;

public class Product {
    private LinkedList<String> allFunctions;

    public Product(){
        allFunctions = new LinkedList<String>();
    }

    public void show(){
        for(int i = 0; i < allFunctions.size() ; ++i){
            System.out.println(allFunctions.get(i));
        }
    }
}

