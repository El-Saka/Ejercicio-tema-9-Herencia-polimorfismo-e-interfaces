package Herencia;

public class Herencia {

    public static void main(String[] args){

        Cliente objCliente = new Cliente("David", "Jorquera", 36, 123456);

        objCliente.setCredito("123456789");
        objCliente.mostrarDatos();

        Trabajador objTrabajador = new Trabajador("Antonio", "Rivera",40, 741025);
        objTrabajador.setSalario(963214587);

        objTrabajador.mostrarDatos();

    }
}
