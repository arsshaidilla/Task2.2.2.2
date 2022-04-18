package com.company;

public class Animalinfo {
    public static void main(String[] args){
        Animal animal[] = new Animal[6];

        animal[0] = new Dog("Husky", 3, 20, "Carnivora", "Chow-Chow");



        AnimalBehavior AnimalBehavior[] = new AnimalBehavior[3];

        AnimalBehavior[0] = new Dog("Husky", 4, 23, "Carnivora", "Chow-Chow");
        AnimalBehavior[1] = new Pigeon("Pablo", 18, 2, "Black", "spain");
        AnimalBehavior[2] = new BlowFish("Blowfish", 3, 4, "grey and white", 11);

        for (Animal a : animal) {
            a.move();
        }

        for (Animal a : animal) {
            AnimalName.name(a.getName());
        }
    }
}
