package com.acme;

public class Persona {

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        System.out.println("Esta instrucción es inservible");
        return String.format("%s", nombre);
    }
}
