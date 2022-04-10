package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;

    Phone mobile;
    Animal pet;
    private String car;
    public String getCar(){
        return this.car;
    }
    public void setCar(){
        System.out.println("Jezdzic samochodem: "+getCar());
    }

    private Double salary;

    public Double getSalary(){
        System.out.println("Dane o wypłacie były pobrane "+ java.time.LocalDateTime.now());
        return this.salary;
    }
    public void setSalary(Double salary){
        if(salary<0){
            System.out.println("wynagrodzenie jest mniejsze od 0, blad");
        } else{
            System.out.println("Nowa pensja wyslana do ksiegowej");
            System.out.println("odbierz Aneks od Hanki");
            System.out.println("Nie ukrywaj dochodu i tak Cię dojadą");
        }
        this.salary = salary;
        String infoSent;
        String aneks;
        String zmianaUS;
        Double newSalary;
        System.out.println(salary);
    }
}
