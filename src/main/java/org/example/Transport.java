package org.example;

public class Transport {
    private double speed;
    private double power;
    private int weight;
    private String model;

    public Transport() {

    }

    @Override
    public String toString() {
        return "Transport{" +
                "speed=" + speed +
                ", power=" + power +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Transport(double speed, double power, int weight, String model) {
        this.speed = speed;
        this.power = power;
        this.weight = weight;
        this.model = model;
    }
}
