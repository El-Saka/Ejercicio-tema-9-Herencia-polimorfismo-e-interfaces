package Herencia;

import javax.swing.*;

public final class Trabajador extends Persona{

    private float Salario;

    public float getSalario(){
        return Salario;
    }
    public void setSalario(float salario){
        this.Salario= salario;
    }

    public Trabajador(String nombre, String apellido, int edad, int telefono) {
        super(nombre, apellido, edad, telefono);
    }

    public void mostrarDatos(){

        JOptionPane.showMessageDialog(null, "Trabajador\nNombre: " + getNombre()+ "\nApellido: "+ getApellido()+ "\nEdad: " + getEdad() + "\nTelefono: " + getTelefono() + "\nSalario: " +getEdad());
    }
}
