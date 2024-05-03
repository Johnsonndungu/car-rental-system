import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a vehicle type (Car, Motorcycle, Truck):");
        String vehicleType = scanner.nextLine();

        switch (vehicleType.toLowerCase()) {
            case "car":
                Car car = new Car();
                System.out.println("Enter car make:");
                car.make = scanner.nextLine();
                System.out.println("Enter car model:");
                car.model = scanner.nextLine();
                System.out.println("Enter car year:");
                car.year = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.println("Enter number of doors:");
                car.setNumDoors(scanner.nextInt());
                scanner.nextLine(); // Consume newline
                System.out.println("Enter fuel type:");
                car.setFuelType(scanner.nextLine());

                System.out.println("Car details:");
                System.out.println("Make: " + car.getMake());
                System.out.println("Model: " + car.getModel());
                System.out.println("Year: " + car.getYear());
                System.out.println("Number of doors: " + car.getNumDoors());
                System.out.println("Fuel type: " + car.getFuelType());
                break;

            case "motorcycle":
                Motorcycle motorcycle = new Motorcycle();
                System.out.println("Enter motorcycle make:");
                motorcycle.make = scanner.nextLine();
                System.out.println("Enter motorcycle model:");
                motorcycle.model = scanner.nextLine();
                System.out.println("Enter motorcycle year:");
                motorcycle.year = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.println("Enter number of wheels:");
                motorcycle.setNumWheels(scanner.nextInt());
                scanner.nextLine(); // Consume newline
                System.out.println("Enter motorcycle type:");
                motorcycle.setType(scanner.nextLine());

                System.out.println("Motorcycle details:");
                System.out.println("Make: " + motorcycle.getMake());
                System.out.println("Model: " + motorcycle.getModel());
                System.out.println("Year: " + motorcycle.getYear());
                System.out.println("Number of wheels: " + motorcycle.getNumWheels());
                System.out.println("Type: " + motorcycle.getType());
                break;

            case "truck":
                Truck truck = new Truck();
                System.out.println("Enter truck make:");
                truck.make = scanner.nextLine();
                System.out.println("Enter truck model:");
                truck.model = scanner.nextLine();
                System.out.println("Enter truck year:");
                truck.year = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.println("Enter cargo capacity:");
                truck.setCargoCapacity(scanner.nextDouble());
                scanner.nextLine(); // Consume newline
                System.out.println("Enter transmission type:");
                truck.setTransmissionType(scanner.nextLine());

                System.out.println("Truck details:");
                System.out.println("Make: " + truck.getMake());
                System.out.println("Model: " + truck.getModel());
                System.out.println("Year: " + truck.getYear());
                System.out.println("Cargo capacity: " + truck.getCargoCapacity());
                System.out.println("Transmission type: " + truck.getTransmissionType());
                break;

            default:
                System.out.println("Invalid vehicle type.");
        }

        scanner.close();
    }
}
