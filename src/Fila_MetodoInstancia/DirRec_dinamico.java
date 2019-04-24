/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila_MetodoInstancia;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class DirRec_dinamico {

    public static void main(String[] args) {
        DirRec_dinamico admin = new DirRec_dinamico();
        admin.eje(admin);
    }

    public void eje(DirRec_dinamico admin) {
        String[] b = null;
        b = admin.CrearMatriz();
        admin.Mostra_Matriz(b);
        System.out.println("");
             admin.fileEntrada(b);
       
       
    }

    public void fileEntrada(String[] args) {
        if (args.length == 0) {
            System.err.println("Uso DirRec <directorio>");
        } else {
            dir(new File(args[0]));
        }
    }
    public void file(){
        File gdF = new File("datos.dat");
    }

    private static void dir(File entrada) {
        if (!entrada.exists()) {
            System.out.println(entrada.getName() + " no encontrado.");
        } else if (entrada.isFile()) {
            System.out.println(entrada.getAbsolutePath());
        } else if (entrada.isDirectory()) {
            File[] files = entrada.listFiles();
            if (files.length > 0) {
                for (File f : files) {
                    dir(f);
                }
            } else {
                System.out.println("vacío");
            }
        }
    }

    public String[] CrearMatriz() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("tamaño de la matriz"));
        String[] b = new String[a];
        for (int i = 0; i < a; i++) {
            //String c = "a" + i;
            String c="datos"+i+".dat";
            b[i] = c;
        }
        return b;

    }

    public void Mostra_Matriz(String[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
