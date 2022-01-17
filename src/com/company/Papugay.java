package com.company;

public class Papugay {
    private String name;
    private int weight;
    private int age;

    public Papugay(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Papugay(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
