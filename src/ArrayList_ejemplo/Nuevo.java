/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList_ejemplo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class Nuevo {

    public static void main(String[] args) {
        Nuevo admin = new Nuevo();
        admin.ejectuar(admin);
    }

    public void ejectuar(Nuevo admin) {
        int a = 0;
        a = admin.CantidadDatos(a);
        ArrayList<String> al = new ArrayList<String>();
        int[] b = null;
        al = admin.Crear_Arreglo(a);
        b = admin.numeros_Usados(a);
        admin.mostrar_arregloInt(b, a);
        System.out.println("\n\n");
        String c = null;
        c = admin.mostrar_arregloString(al, a, b);
        System.out.println("\n\n");
        System.out.println("\n\n");
        System.out.println(c);
        admin.eliminar(al,a);
        c = admin.mostrar_arregloString(al, a, b);
    }

    public ArrayList<String> eliminar(ArrayList<String> al, int a) {
        int cont = 0;
        Nuevo admin = new Nuevo();
        int b = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de identifiacion para eliminar"));
        if (b <= a) {
            al.remove(a);
        } else if (b > a) {
            cont++;
            admin.eliminar(al, a);
            if(cont>3){
                System.exit(0);
            }
        }

        return al;
    }

    public String agregarContenido(String a) {
        a = JOptionPane.showInputDialog("INGRESE DATO");
        return a;
    }

    public int CantidadDatos(int a) {
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos a agregar"));
        return a;
    }

    public ArrayList<String> Crear_Arreglo(int a) {
        Nuevo admin = new Nuevo();
        ArrayList<String> al = new ArrayList<String>();
        String b = null;
        for (int i = 0; i < a; i++) {
            b = admin.agregarContenido(b);
            al.add(b);
        }
        return al;
    }

    public int[] numeros_Usados(int a) {
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = i + 1;
        }
        return b;
    }

    public String mostrar_arregloString(ArrayList<String> al, int a, int[] b) {
        String c = null;
        for (int i = 0; i < a; i++) {
            System.out.println(al.get(i));
            c += ")" + b[i] + " " + al.get(i);
        }
        return c;
    }

    public String mostrar_arregloInt(int[] al, int a) {

        String c = null;
        for (int i = 0; i < a; i++) {
            System.out.print(al[i]);
            c += ", " + al[i];
        }
        return c;
    }

}
