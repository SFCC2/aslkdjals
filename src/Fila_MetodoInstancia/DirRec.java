/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila_MetodoInstancia;

import java.io.File;

/**
 *
 * @author Asus-PC
 */
public class DirRec {

    public static void main(String[] args) {
       
        
        
       if (args.length == 0) {
            System.err.println("Uso DirRec <directorio>");
        } else {
            dir(new File(args[0]));
        }
        
        
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
}
