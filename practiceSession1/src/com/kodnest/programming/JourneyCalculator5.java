package com.kodnest.programming;

import java.util.Scanner;

class JourneyCalculator5 {
	public double calculateDistance(double speed, double time) {
        
        double distance = speed * time;
        return Math.round(distance * 100.0) / 100.0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JourneyCalculator5 jc = new JourneyCalculator5();

        System.out.print("Enter the speed (in km/h): ");
        double speed = sc.nextDouble();

        System.out.print("Enter the time (in hours): ");
        double time = sc.nextDouble();

        double distance = jc.calculateDistance(speed, time);
        System.out.printf("Distance traveled: %.2f km%n", distance);

        sc.close();
    }
}
