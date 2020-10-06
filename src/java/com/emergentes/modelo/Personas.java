
package com.emergentes.modelo;

public class Personas {
    private int id;
    private String nombres;
    private String apellidos;
    private int edad;

    public Personas()
    {
        id=0;
        nombres="";
        apellidos="";
        edad =0;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
