package com.company;

public class BlowFish extends Fish implements AnimalBehavior, AnimalMove, AnimalName{
    public int diameter;

    BlowFish(){
        super();
        diameter = 0;
    }

    public BlowFish(String name, int age, int weight, String scaleColor, int diameter){
        super(name, age, weight, scaleColor);
        this.diameter = diameter;
    }

    public void aport(){
        System.out.println("The fish is swimming");
    }

    @Override
    public void getVoice(){
        System.out.println("The fish is popping");
    }

    @Override
    public void eat(String foodName){
        System.out.println("The fish is eating" + foodName);
    }

    public int getDiameter(){
        return diameter;
    }

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    @Override
    public String toString(){
        return "Dog{" + "breed='" + diameter + '}';
    }

    @Override
    public void move() { System.out.println("Blowfishes swim"); }

    @Override
    public void sleep() { System.out.println("Blowfishes sleep from 9 to 10 hours");

    }
}
