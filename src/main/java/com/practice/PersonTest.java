package com.practice;

import java.util.Scanner;

public class PersonTest {

    private int age;

    public PersonTest(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String output;
        if (this.age < 13) {
            output = "You are young";
        }
        else if (this.age >= 13 && this.age < 18) {
            output = "You are a teenager";
        } else {
            output = "You are old";
        }
        System.out.println(output);
    }

    public void yearPasses() {
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            PersonTest p = new PersonTest(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }

}

