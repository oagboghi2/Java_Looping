package com.lambdaschool;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Random rand = new Random(); //rand is the new object


        System.out.println("Min Integer is " + Integer.MIN_VALUE);
        System.out.println("Max Integer is " + Integer.MAX_VALUE);

        System.out.println("\nRandom Numbers");
        for (int i = 0; i < 7; i++)
        {
            System.out.println("Random Number " + rand.nextInt());
            System.out.println("Random number " + rand.nextInt(5));
        }

        System.out.println("\nRandom Doubles");
        int i = 0;
        while (i < 7)
        {
            System.out.println("Random number " + rand.nextDouble());
            i++;
        }

        System.out.println("\nRandom ntegers until 0");
        int myTest;
        do
        {
            myTest = rand.nextInt(7);
            System.out.println("Number " + myTest);
        } while (myTest != 0);

        System.out.println("\nRandom Numbers Even");
        for (int j = 0; j < 10; j++)
        {
            int myTester = rand.nextInt(10);
            System.out.println("Testing " + myTester);
            if ((myTester % 2) == 0)
            {
                //continue;
                break;
            }
            System.out.println(myTester);
        }

        System.out.println("/nPrint Days");
        int randDay = rand.nextInt(7);
        if ((randDay == 0) || (randDay == 6)) // && and ! not
        {
            System.out.println("Weekend");
        }
        else
        {
            System.out.println("Weekday");
        }

        System.out.println("\nPrint Days");
        randDay = rand.nextInt(3);
        if (randDay == 0)
        {
            System.out.println("Sunday");
        }
        if (randDay == 1)
        {
            System.out.println("Monday");
        }
        if (randDay == 2)
        {
            System.out.println("Tuesday");
        }
        if (randDay == 3)
        {
            System.out.println("Wednesday");
        }

        System.out.println("\nSwitch Days");
        switch (randDay)
        {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                    System.out.println("Error");
        }
    }
}
