package org.example;


public class Application {
    public static void main(String[] args) {
        Transport chevrolet = new Transport();
        chevrolet.setSpeed(120.01);
        System.out.println(chevrolet.getSpeed());
        Transport bmw = new Transport(200.40,600,1800, "BMW");
        System.out.println(bmw);

    }
}

