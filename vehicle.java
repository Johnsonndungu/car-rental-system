class Vehicles {
    // Interface for Vehicle
    interface Vehicle {
        String getMake();
        String getModel();
        int getYear();
    }

    // Interface for Car specific attributes
    interface CarVehicle extends Vehicle {
        void setNumDoors(int numDoors);
        int getNumDoors();
        void setFuelType(String fuelType);
        String getFuelType();
    }

    // Interface for Motorcycle specific attributes
    interface MotorVehicle extends Vehicle {
        void setNumWheels(int numWheels);
        int getNumWheels();
        void setType(String type);
        String getType();
    }

    // Interface for Truck specific attributes
    interface TruckVehicle extends Vehicle {
        void setCargoCapacity(double cargoCapacity);
        double getCargoCapacity();
        void setTransmissionType(String transmissionType);
        String getTransmissionType();
    }

    // Car class implementing Vehicle and CarVehicle interfaces
    static class Car implements CarVehicle {
        @Override
        public String getMake() {
            return null;
        }

        @Override
        public String getModel() {
            return null;
        }

        @Override
        public int getYear() {
            return 0;
        }

        @Override
        public void setNumDoors(int numDoors) {

        }

        @Override
        public int getNumDoors() {
            return 0;
        }

        @Override
        public void setFuelType(String fuelType) {

        }

        @Override
        public String getFuelType() {
            return null;
        }
        // Implementation of Car class...
    }

    // Motorcycle class implementing Vehicle and MotorVehicle interfaces
    static class Motorcycle implements MotorVehicle {
        @Override
        public String getMake() {
            return null;
        }

        @Override
        public String getModel() {
            return null;
        }

        @Override
        public int getYear() {
            return 0;
        }

        @Override
        public void setNumWheels(int numWheels) {

        }

        @Override
        public int getNumWheels() {
            return 0;
        }

        @Override
        public void setType(String type) {

        }

        @Override
        public String getType() {
            return null;
        }
        // Implementation of Motorcycle class...
    }

    // Truck class implementing Vehicle and TruckVehicle interfaces
    static class Truck implements TruckVehicle {
        @Override
        public String getMake() {
            return null;
        }

        @Override
        public String getModel() {
            return null;
        }

        @Override
        public int getYear() {
            return 0;
        }

        @Override
        public void setCargoCapacity(double cargoCapacity) {

        }

        @Override
        public double getCargoCapacity() {
            return 0;
        }

        @Override
        public void setTransmissionType(String transmissionType) {

        }

        @Override
        public String getTransmissionType() {
            return null;
        }
        // Implementation of Truck class...
    }

    
    public static void main(String[] args) {
  
    }
}
