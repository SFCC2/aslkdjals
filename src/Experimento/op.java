/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimento;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class op {

    // private ArrayList<Persona> Personas = new ArrayList<>();
    public static void main(String[] args) {
        op admi = new op();
        admi.ejecutar();
    }

    public void ejecutar() {
        ArrayList<Persona> Personas = new ArrayList<>();
Persona person= new Persona();
        op admi = new op();

        admi.cantidad(admi, Personas);
        //admi.llenar(admi, Personas);
        String a = null;
        admi.listaPersona(Personas);
        int num = Integer.parseInt(JOptionPane.showInputDialog("INGRESE CEDULA PARA ELIMINAR"));
        admi.delete(Personas, num);
        System.out.println("////eliminar////");
        admi.listaPersona(Personas);
    }

    public void cantidad(op admi, ArrayList<Persona> Personas) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de personas a registrar"));
        for (int i = 0; i < cantidad; i++) {
            Personas = admi.llenar(admi, Personas);
        }
        /* for (Persona persona : Personas) {

            System.out.println(persona.getCedula() + "        "
                    + persona.getNombre() + "        " + persona.getApellido() + "        "
                    + "        " + persona.getTelefono());

        }*/
    }

    public ArrayList<Persona> llenar(op admi, ArrayList<Persona> Personas) {
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("ingrese cedula"));//cedula INT NOT NULL PRIMARY KEY, 
        String nombre = JOptionPane.showInputDialog("ingrese nombre");//nombre varchar(30) NOT NULL,
        String apellido = JOptionPane.showInputDialog("ingrese apellido");//apellido varchar(30) NOT NULL,
        String correo = JOptionPane.showInputDialog("ingrese correo");//correo varchar(30) NOT NULL,
        // String Carrera = JOptionPane.showInputDialog("ingrese carrera");//    carrera varchar(30) NOT NULL,
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("ingrese telefono"));
        //System.out.println(cedula + "        " + nombre + "        " + apellido + "        " + correo + "        " + telefono);
        //admi.completar(Personas,Cedula, nombre, apellido, correo, Carrera, telefono);
        Personas = admi.completar(Personas, cedula, nombre, apellido, correo, telefono);
        return Personas;
    }

    public ArrayList<Persona> completar(ArrayList<Persona> Personas, int cedula, String nombre, String apellido,
            String correo, int telefono) {
   Persona person= new Persona(cedula, nombre, apellido, correo, cedula);
        Personas.add(person);

       // Personas.add(new Persona(cedula, nombre, apellido, correo, telefono));
        return Personas;
        ///  this.Personas.add(new Persona(cedula, nombre, apellido, correo, Carrera, telefono));    
    }

    public void addPersona(ArrayList<Persona> Personas, Persona persona) {
        Personas.add(persona);
    }

    public void listaPersona(ArrayList<Persona> personas) {

        for (Persona persona : personas) {
            System.out.println(persona.getCedula() + "        "
                    + persona.getNombre() + "        " + persona.getApellido() + "        "
                    /*+ persona.getCarrera()*/ + "        " + persona.getTelefono());

        }

    }

    public void delete(ArrayList<Persona> personas, int id) {


            personas.remove(id);
       

    }
    /*
    public ArrayList<Persona> getPersonas() {
        return personas;
    }*/

}
