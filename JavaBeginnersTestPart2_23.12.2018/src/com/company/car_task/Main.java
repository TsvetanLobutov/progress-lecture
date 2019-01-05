package com.company.car_task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String  lines = reader.readLine();
        String[] strs = lines.trim().split("\\s+");

        while (!"END".equals(reader.readLine())){

            double speed = 0;
            double fuel = 0;
            double fuelEconomy = 0;

            Car car = new Car(speed, fuel, fuelEconomy);



            int[] numbers = new int[3];

            for (int i = 0; i < strs.length; i++) {
                numbers[i] = Integer.parseInt(strs[i]);
            }

            speed = numbers[0];
            fuel = numbers[1];
            fuelEconomy = numbers[2];



            double travelDistance = Double.parseDouble(reader.readLine());

            double time = car.calculateTime(travelDistance, speed);

            String command = reader.readLine();

            switch (command){
                case "Distance":
                    System.out.println("Distance" + car.calculateDistance(travelDistance, time));
                    break;
                case "Time":
                    System.out.println("Time " + time);
                    break;
                case "Fuel":
                    System.out.println("Fuel" + car.calculateFuel(fuel, fuelEconomy));
                    break;

            }

            reader.readLine();

        }


    }
}
