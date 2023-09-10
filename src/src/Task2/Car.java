package Task2;

import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private String carLicensePlate;
    private int maxSpeed;
    private String color;

    public Car(String model, String carLicensePlate, int maxSpeed, String color) {
        this.model = model;
        this.carLicensePlate = carLicensePlate;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carLicensePlate='" + carLicensePlate + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }
}
