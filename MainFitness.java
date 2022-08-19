package com.hillel.nevinchanyi.lesson12;
import java.util.Scanner;
public class MainFitness {
    public static void main(String[] args) {
        Fitness fitnessClient1 = new Fitness("Rodion", 14,8,2001, "Nevinchanyi", 70, 8000);
        Fitness fitnessClient2 = new Fitness("Nick", 16,2,1999, "Jackson", 75, 5000);

        fitnessClient1.printAccountInfo();
        fitnessClient2.printAccountInfo();

        System.out.println(fitnessClient1.getName());
    }

}
