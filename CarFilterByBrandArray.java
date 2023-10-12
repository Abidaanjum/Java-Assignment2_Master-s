
import java.util.Scanner;

public class CarFilterByBrandArray {
    public static void main(String[] args) {
        // Create an array of Car objects
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2018, "Blue", 25000.0, "ABC123"),
            new Car(2, "Honda", "Civic", 2019, "Red", 22000.0, "XYZ789"),
            new Car(3, "Ford", "Fusion", 2017, "Silver", 20000.0, "PQR456"),
            new Car(4, "Toyota", "Corolla", 2015, "Black", 18000.0, "DEF456"),
            new Car(5, "Ford", "Mustang", 2020, "Yellow", 35000.0, "GHI789")
        };

        // Take user input for the brand name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the brand name to filter cars: ");
        String brandToFilter = scanner.nextLine();

        // Display list of cars of the given brand
        displayCarsByBrand(cars, brandToFilter);
    }

    public static void displayCarsByBrand(Car[] cars, String brand) {
        System.out.println("Cars of brand " + brand + ":");
        boolean found = false;
        for (Car car : cars) {
            if (car.getMake().equalsIgnoreCase(brand)) {
                found = true;
                Car.displayCarInfo(car);
            }
        }

        if (!found) {
            System.out.println("No cars found for brand " + brand);
        }
    }

   
}