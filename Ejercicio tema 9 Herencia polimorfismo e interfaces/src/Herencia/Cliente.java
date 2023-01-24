package Herencia;

import javax.swing.*;

public final class Cliente extends Persona{

    private String Credito;

    public String getCredito(){
        return Credito;
    }
    public void setCredito(String credito){
        this.Credito= credito;
    }

    public Cliente(String nombre, String apellido, int edad, int telefono) {
        super(nombre, apellido, edad, telefono);
    }

    public void mostrarDatos(){

        JOptionPane.showMessageDialog(null, "Cliente\nNombre: " + getNombre()+ "\nApellido: "+ getApellido()+ "\nEdad: " + getEdad() + "\nTelefono: " + getTelefono() + "\nCredito: " +getCredito());
    }

}