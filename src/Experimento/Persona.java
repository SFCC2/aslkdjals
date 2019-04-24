/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimento;

/**
 *
 * @author Asus-PC
 */
public class Persona {

    int Cedula;//cedula INT NOT NULL PRIMARY KEY, 
    String nombre;//nombre varchar(30) NOT NULL,
    String apellido;//apellido varchar(30) NOT NULL,
    String correo;//correo varchar(30) NOT NULL,
   // String Carrera;//    carrera varchar(30) NOT NULL,
    int telefono;

  /*  public Persona(int Cedula, String nombre, String apellido, String correo,
            String Carrera, int tel) {*/
    
    public Persona(int Cedula, String nombre, String apellido, String correo,
             int tel) {
        this.Cedula = Cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
     //   this.Carrera = Carrera;
        this.telefono=tel;
    }
    
        public Persona() {    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
/*
    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }*/

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public Persona cast(Object t) {
        Persona mobj = Persona.class.cast(t);
        return mobj;
    }
}
