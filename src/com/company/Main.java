package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("pies");
        dog.species = "canis";
        dog.isAlive = true;
        dog.name = "Burek";
        dog.weight = 12.2;

        //System.out.println(dog.name);
        //System.out.println("species: " + dog.species + " name: " + dog.name);

        Animal cat = new Animal("kot");
        cat.species = "felis";
        cat.isAlive = true;
        cat.name = "kit";

        //System.out.println("Ten kot to " +cat.name);
        //System.out.println(cat.weight);

        Human kacper = new Human();
        kacper.firstName="Kacper";
        kacper.lastName="Motyl";
        kacper.pet=dog;
        kacper.mobile=new Phone();

        kacper.mobile.model="Pro 8";
        kacper.mobile.producer="Realme";
        kacper.pet.feed();

        System.out.println(kacper.pet.name);

        Car skoda = new Car("octavia","superb");
        Car toyota = new Car("corolla","yaris");


        kacper.car = new Car("skoda", "toyota");
        kacper.car.color="red";
        kacper.car.millage=10000.0;
        kacper.car.engineVolume=320.0;
        System.out.println("Kacpra samochód ma "+kacper.car.engineVolume+"KM i jest koloru: "+kacper.car.color);

        //System.out.println("Po spacerach waga psa to: "+ dog.weight + "kg");
        if (dog.weight < 0) {
            System.out.println("Pies zaraz zdechnie, jego waga to: " + dog.weight + " nakarm go pilnie!");
        } else
            System.out.println("Waga psa to: " + dog.weight + "kg");

        kacper.setSalary(1000.0);
        System.out.println(kacper.getSalary());

        kacper.getCar();
    }
}
