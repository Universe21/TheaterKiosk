package com.company;

import java.util.Scanner;

public class TheaterKiosk {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare variable age

        int age;

        System.out.print("Enter your age: ");

        age = scanner.nextInt();

        if(age>=21)

            System.out.println("You will get a paper wrist band!!");

    }

}

