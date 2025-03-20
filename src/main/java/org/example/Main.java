package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado trabajador = new Empleado("1245678M","Perico de los Palotes");

        trabajador.direccion="C/del Pez,6";
        trabajador.numHijos=3;
        System.out.println("DNI: "+trabajador.dni);
        System.out.println("Nombre: "+trabajador.nombre);
        System.out.println("Cargo: "+trabajador.cargo);
        System.out.println("Número de hijos: "+trabajador.numHijos);
        System.out.println("Sueldo: "+trabajador.calcula_sueldo(1200));
    }

    public void Imprimirempleado(Empleado trabajador){
        System.out.println("DNI: "+trabajador.dni);
        System.out.println("Nombre: "+trabajador.nombre);
        System.out.println("Cargo: "+trabajador.cargo);
        System.out.println("Número de hijos: "+trabajador.numHijos);
        System.out.println("Sueldo: "+trabajador.calcula_sueldo(1200));
    }

}