package com.company;

public class Animal {
    String species;
    Double weight;
    Integer age;
    public String name;
    Boolean isAlive;

    public Animal(String species){
        this.isAlive=true;
        this.age=1;
        this.species=species;

        switch (this.species){
            case "felis":this.weight=2.0; break;
            case "canis":this.weight=10.0; break;
            default: this.weight=5.0;break;
        }
    }

    public Double getWeight(){
        return this.weight;
    }

    void feed() {
        if (isAlive) {
            weight += 1.0;
            System.out.println("thx for food");
        }}
        void run() {
            weight -= 1;
            System.out.println("thx for run");
        }

    }

