
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahmu
 */
public class CarFilterByModelAndAge {
    public static void main(String[] args) {
        // Create a list of Car objects
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2018, "Blue", 25000.0, "ABC123"),
            new Car(2, "Honda", "Civic", 2019, "Red", 22000.0, "XYZ789"),
            new Car(3, "Ford", "Fusion", 2017, "Silver", 20000.0, "PQR456"),
            new Car(4, "Toyota", "Corolla", 2022, "Black", 18000.0, "DEF456"),
            new Car(5, "Ford", "Mustang", 2020, "Yellow", 35000.0, "GHI789")
        };
        // Take user input for the car model and threshold years
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the car model: ");
        String modelToFilter = scanner.nextLine();
        System.out.print("Enter the threshold number of years: ");
        int thresholdYears = scanner.nextInt();

        // Display list of cars of the given model that have been in use for more than n years
        displayCarsByModelAndAge(cars, modelToFilter, thresholdYears);
    }

    public static void displayCarsByModelAndAge(Car[] cars, String model, int years) {
        System.out.println("Cars of model " + model + " that have been in use for more than " + years + " years:");
        boolean found = false;
        int currentYear = 2023; // Assuming the current year is 2023
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYear() > years)) {
                found = true;
                Car.displayCarInfo(car);
            }
        }

        if (!found) {
            System.out.println("No cars found for model " + model + " with more than " + years + " years of use.");
        }
    }

   
}



