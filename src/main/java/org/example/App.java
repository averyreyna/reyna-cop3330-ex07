/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App {
    // creating a constant for the conversion to square meters
    public static final double conversion = 0.09290304;

    public static void main(String[] args) {
        // inputs 1 and 2 contain the length and width of the user's room
        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        int inputLength = Integer.parseInt(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is the width of the room in feet? ");
        int inputWidth = Integer.parseInt(input2.nextLine());

        // math for the area and area in meters
        int roomArea = inputLength * inputWidth;
        double roomAreaMeters = roomArea * conversion;

        // formatted string for output
        String areaOutout = String.format("The area is\n%d square feet\n%.3f square meters", roomArea, roomAreaMeters);

        System.out.println(areaOutout);
    }
}