package com.company;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setName("nembo");
        fish.setAge(12);
        fish.setWeight(30);


        System.out.println( "name:" + fish.getName());
        System.out.println( "age:" + fish.getAge());
        System.out.println( "weight:" + fish.getWeight());

        System.out.println("____________________________");


        Papugay papugay = new Papugay();
        papugay.setName("bord");
        papugay.setAge(4);
        papugay.setWeight(2);

        System.out.println( "name: " + papugay.getName());
        System.out.println( "age:" + papugay.getAge());
        System.out.println(  "weight:" + papugay.getWeight());

        System.out.println("_____________________________");



        Cat cat = new Cat();
        cat.setName("tom");
        cat.setAge(3);
        cat.setWeight(5);

        System.out.println( "name:" + cat.getName());
        System.out.println( "age:" + cat.getAge());
        System.out.println( "weight:" + cat.getWeight());

        System.out.println("________________________________");

        Dog dog = new Dog();
        dog.setName("alabay");
        dog.setAge(3);
        dog.setWeight(10);

        System.out.println( "name:" + dog.getName());
        System.out.println( "age:" + dog.getAge());
        System.out.println( "weight:" + dog.getWeight());


    }


    }




