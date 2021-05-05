package com.company;

//a class for construction
//it recalls the function created by the interface
//we create an object from the interface and we access its functions
//those functions are implemented in various classes
//later on we use the construct function in the director class
//to access those implemented functions all at once
//and we create an object from director in the Main class
//so it helps us construct the classes we built previously

public class Director {
    BuilderInterface myBuilder;

    public void construct(BuilderInterface b){
        myBuilder = b;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadLights();
    }}
