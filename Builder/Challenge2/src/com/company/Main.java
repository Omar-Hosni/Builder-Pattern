package com.company;

import javax.swing.undo.CannotUndoException;

interface Item{
    public String name();
    public Packing packing();
    public float price();
}


abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

class VegBurger extends Burger{
    @Override
    public float price(){
        return 25.9f;
    }

    @Override
    public String name(){
        return "Veg Burger";
    }

}

class ChickenBurger extends Burger{
    @Override
    public float price(){
        return 22.9f;
    }

    @Override
    public String name(){
        return "Chicken Burger";
    }

}

abstract class ColdDrinks implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}

class Pepsi extends ColdDrinks{
    public float price(){
        return 14.3f;
    }

    public String name(){
        return "Pepsi";
    }
}

class Coke extends ColdDrinks{
    public float price(){
        return 11.3f;
    }

    public String name(){
        return "Coke";
    }
}

interface Packing{
    public String pack();
}

class Wrapper implements Packing{
    @Override
    public String pack(){
        return "Wrapper";
    }
}

class Bottle implements Packing{
    @Override
    public String pack(){
        return "Bottle";
    }
}


public class Main {

    public static void main(String[] args) {
	Director d = new Director();
	MealBuilderInterface vegMealBuilder = new VegMealBuilder();
	MealBuilderInterface nonVegMealBuilder = new NonVegMealBuilder();

	d.construct(vegMealBuilder);
	d.construct(nonVegMealBuilder);

	Meal VegMeal = vegMealBuilder.getMeal();
	Meal nonVegMeal = nonVegMealBuilder.getMeal();

	VegMeal.showItems();
        System.out.println("");
	nonVegMeal.showItems();
    }
}
