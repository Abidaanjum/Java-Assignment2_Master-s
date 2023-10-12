
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mahmu
 */
public class CarFilterByYearAndPrice {
    public static void main(String[] args) {
        // Create an array of Car objects
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2018, "Blue", 25000.0, "ABC123"),
            new Car(2, "Honda", "Civic", 2019, "Red", 22000.0, "XYZ789"),
            new Car(3, "Ford", "Fusion", 2017, "Silver", 20000.0, "PQR456"),
            new Car(4, "Toyota", "Corolla", 2015, "Black", 18000.0, "DEF456"),
            new Car(5, "Ford", "Mustang", 2020, "Yellow", 35000.0, "GHI789")
        };

        // Take user input for the year of manufacture and price
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year of manufacture: ");
        int yearToFilter = scanner.nextInt();
        System.out.print("Enter the minimum price: ");
        double minPrice = scanner.nextDouble();

        // Display list of cars of the given year with price higher than the specified one
        displayCarsByYearAndPrice(cars, yearToFilter, minPrice);
    }

    private static void displayCarsByYearAndPrice(Car[] cars, int year, double minPrice) {
        System.out.println("Cars of year " + year + " with price higher than $" + minPrice + ":");
        boolean found = false;
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > minPrice) {
                found = true;
                Car.displayCarInfo(car);
            }
        }

        if (!found) {
            System.out.println("No cars found for year " + year + " with price higher than $" + minPrice + ".");
        }
    }

 
}




