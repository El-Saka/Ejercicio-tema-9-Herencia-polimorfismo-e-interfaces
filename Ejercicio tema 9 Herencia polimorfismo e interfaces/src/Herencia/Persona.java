package Herencia;

import javax.swing.*;

public class Persona {

    private String Nombre;
    private String Apellido;
    public int Edad;
    private int Telefono;

    //ESTE ES EL CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad, int telefono){
        this.Nombre= nombre;
        this.Apellido= apellido;
        this.Edad= edad;
        this.Telefono= telefono;
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre){

    }

    public String getApellido(){
        return Apellido;
    }
    public void setApellido(String apellido){

    }

    public int getEdad(){
        return Edad;
    }
    public void setEdad(int edad){

    }

    public int getTelefono(){
        return Telefono;
    }
    public void setTelefono(int telefono){

    }
}


