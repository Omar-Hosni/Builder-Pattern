package com.company;

public class Director {

    Item myItems;

    public void construct(Item I){
        myItems = I;
        myItems.price();
        myItems.drink();
        myItems.eat();
    }

}
