package org.sdet5.bfSolution;
import java.util.Scanner;

public class SpeedLimitPunishment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();
        int fine = calculateFine(speed);
        String punishment = calculatePunishment(speed);
        System.out.println(fine + " " + punishment);
       // scanner.close();
    }

    // Function to calculate fine based on speed
    private static int calculateFine(int speed) {
        if (speed <= 90) {
            return 0;
        } else if (speed <= 110) {
            return 3000;
        } else {
            return 25000;
        }
    }
    private static String calculatePunishment(int speed) {
        if (speed <= 90) {
            return "No punishment";
        } else if (speed <= 110) {
            return "Warning";
        } else {
            return "License removed";
        }
    }
}
