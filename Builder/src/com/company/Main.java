package com.company;

//normal interface and normal classes that implements them...

interface BuilderInterface{
    void buildBody();
    void insertWheels();
    void addHeadLights();
    Product getVehicle();
}

class Car implements BuilderInterface{
    private Product p = new Product();

    @Override
    public void buildBody(){
        p.add("This is a body of a car");
    }

    @Override
    public void insertWheels(){
        p.add("4 wheels are added");
    }

    @Override
    public void addHeadLights(){
        p.add("2 Head Lights are added");
    }

    @Override
    public Product getVehicle(){
        return p;
    }
}

class Motorcycle implements BuilderInterface{
    private Product p = new Product();

    @Override
    public void buildBody(){
        p.add("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels(){
        p.add("2 wheels are added");
    }

    @Override
    public void addHeadLights(){ p.add("1 Head Lights are added");}

    @Override
    public Product getVehicle(){
        return p;
    }
}


public class Main {

    public static void main(String[] args) {

        System.out.println("Builder Patterns Demo\n");
        Director d = new Director();
        BuilderInterface carBuilder = new Car();
        BuilderInterface motorBuilder = new Motorcycle();

        d.construct(carBuilder);
        d.construct(motorBuilder);

        Product p1 = carBuilder.getVehicle();
        Product p2 = motorBuilder.getVehicle();

        p1.show();
        p2.show();
    }
}
