package com.acme;

import java.lang.invoke.StringConcatFactory;

public class Persona {

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    private String nombre;
    private String apellido;

    @Override
    public String toString() {
        return String.format("%s %s", nombre, apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
