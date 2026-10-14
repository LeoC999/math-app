package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
// Question 1:
// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE

        float bobsalary = 999.99f;
        float garysalary = 784.87f;
        double highestsalary = bobsalary - garysalary;
        System.out.println("Bob's salary monthly is more than Gary by: " + highestsalary);

        double carPrice = 23.000;
        double truckPrice = 43.000;
        double cheaper = Math.max(carPrice, truckPrice);
        System.out.println("The more expensive is " + cheaper+ "K which is the truck");

        double radious = 7.25;
        double area = radious * radious;
        System.out.println("The area is " + area);

        double spared = 5.0;
        double sqaureroot = Math.sqrt(spared);
        System.out.println("The square root is " + sqaureroot);

        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance is " + distance);










    }
}