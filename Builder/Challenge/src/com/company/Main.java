package com.company;

interface Item{
    void price();
    void eat();
    void drink();
    Product packedUp();
}

class Burger implements Item{
    private Product p = new Product();
    private int cost;

    @Override
    public void price() {
        System.out.println("Burger costs: " + cost + " dollars");
    }

    @Override
    public void eat() {
        System.out.println("Burger being eaten");
    }

    @Override
    public void drink() {

    }

    @Override
    public Product packedUp() {
        return p;
    }

    public Burger(int c){
        cost = c;
    }
}

class Drinks implements Item{

    private Product p = new Product();
    private int cost;

    @Override
    public void price() {
        System.out.println("\nDrink costs: " + cost + " dollars");
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {
        System.out.println("A drink being swallowed");
    }

    @Override
    public Product packedUp() {
        return p;
    }

    public Drinks(int c){
        cost = c;
    }
}



public class Main {

    public static void main(String[] args) {
        System.out.println("BUILDER PATTERNS CHALLENGE 1:\n ");
        Director d = new Director();
        Item BurgerItem = new Burger(6);
        Item DrinksItem = new Drinks(3);



        d.construct(BurgerItem);
        d.construct(DrinksItem);

        Product foodProduct = BurgerItem.packedUp();
        Product drinksProduct = DrinksItem.packedUp();



        foodProduct.show();
        drinksProduct.show();
    }
}
