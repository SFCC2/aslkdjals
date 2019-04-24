/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList_ejemplo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class ArrayListExample_Dinamico {

    public static void main(String[] args) {
        ArrayListExample_Dinamico admin = new ArrayListExample_Dinamico();
        admin.ejecutar(admin);
    }

    public void ejecutar(ArrayListExample_Dinamico admin) {
        int cantidad = 4;
        String[] a = admin.llenar_arregloString(admin, cantidad);
        admin.mostrar_arregloString(a);
        String[] b = admin.llenar_arregloString1(admin, cantidad);
        admin.mostrar_arregloString(b);
        
    }

    public String[] llenar_arregloString(ArrayListExample_Dinamico admin, int cantidad) {
        String a[] = new String[cantidad];
        // String[] undesirableBands = {"Nirvana,", "Led Zepelling,","The Strokes,", "Jamiroquai"};        // String[] bands = {"Nirvana,", "Jamiroquai,","Guns and Roses,", "Funkadelic Parliament"};
        String b = "Nirvana,", c = "Led Zepelling,", d = "The Strokes,", e = "Jamiroquai";
        for (int i = 0; i < cantidad; i++) {
            switch (i) {
                case 0:
                    a[i] = b;
                    break;
                case 1:
                    a[i] = c;
                    break;
                case 2:
                    a[i] = d;
                    break;
                case 3:
                    a[i] = e;
                    break;
            }
        }
        return a;
    }

    public String[] llenar_arregloString1(ArrayListExample_Dinamico admin, int cantidad) {
        String a[] = new String[cantidad];
        // String[] bands = {"Nirvana,", "Jamiroquai,","Guns and Roses,", "Funkadelic Parliament"};
        String b = "Nirvana,", c = "Jamiroquai,", d = "Guns and Roses,", e = "Funkadelic Parliament";
        for (int i = 0; i < cantidad; i++) {
            switch (i) {
                case 0:
                    a[i] = b;
                    break;
                case 1:
                    a[i] = c;
                    break;
                case 2:
                    a[i] = d;
                    break;
                case 3:
                    a[i] = e;
                    break;
            }
        }
        return a;
    }

    public void mostrar_arregloString(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
    }

}