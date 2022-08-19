package com.hillel.nevinchanyi.lesson12;

public class Fitness {
    private final String name;
    private final int day;
    private final int month;
    private final int year;
    private String lastname;
    private double weight;
    private int countSteps;
    private int age;
    public Fitness(String name, int day, int month, int year, String lastname, double weight, int countSteps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.lastname = lastname;
        this.weight = weight;
        this.countSteps = countSteps;

        age = 2022 - year;
    }
    private boolean checkDay(int day) {
        return day > 0 && day < 31;
    }
    public String getName() {
        return name;
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getCountSteps() {
        return countSteps;
    }
    public void setCountSteps(int countSteps) {
        this.countSteps = countSteps;
    }
    public int getAge() {
        return age;
    }
    void printAccountInfo() {
        System.out.println("name='" + getName() + '\'' +
                ", day=" + getDay() +
                ", month=" + getMonth() +
                ", year=" + getYear() +
                ", age=" + getAge() +
                ", lastname='" + getLastname() + '\'' +
                ", weight=" + getWeight() +
                ", countSteps=" + getCountSteps());
    }
}

