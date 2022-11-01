package com.openBootcamp.Model;

public class Coche {

    // 1. Atributes
    public String marca;
    public Double motor;
    public String dueño;

    // 2. Constructors
    public Coche() {
    }

    public Coche(String marca, Double motor, String dueño) {
        this.marca = marca;
        this.motor = motor;
        this.dueño = dueño;
    }

    // 3. Methods
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", motor=" + motor +
                ", dueño='" + dueño + '\'' +
                '}';
    }
}
