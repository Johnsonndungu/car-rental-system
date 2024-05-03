// TruckVehicle interface
interface TruckVehicle extends Vehicles.Vehicle {
    void setCargoCapacity(double cargoCapacity);
    double getCargoCapacity();
    void setTransmissionType(String transmissionType);
    String getTransmissionType();
}

// Truck class implementing Vehicle and TruckVehicle interfaces
class Truck implements TruckVehicle {
    String make;
    String model;
    protected int year;
    private double cargoCapacity;
    private String transmissionType;

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public String getTransmissionType() {
        return transmissionType;
    }
}
