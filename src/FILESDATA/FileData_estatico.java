/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FILESDATA;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Departamento de Lenguajes y Ciencias de la Computación
 * @fecha: desconocida
 * @OrigenLugar: NA
 * @tema: File_DATE 
 */
public class FileData_estatico {

    public static void main(String args[]) throws IOException {
        FileOutputStream gdF = new FileOutputStream("datos.dat");
        DataOutputStream dosF = new DataOutputStream(gdF);
// Escribimos algunos datos
        dosF.writeBoolean(true);
        dosF.writeChar('A');
        dosF.writeByte(Byte.MAX_VALUE);
        dosF.writeInt(Integer.MAX_VALUE);
        dosF.writeDouble(Double.MAX_VALUE);
        dosF.close(); // Cerramos el flujo. Cierra todos
// Creamos un flujo de entrada de datos
        FileInputStream ldF = new FileInputStream("datos.dat");
        DataInputStream disF = new DataInputStream(ldF);
// Leemos los datos guardados
        boolean v = disF.readBoolean();
        char c = disF.readChar();
        byte b = disF.readByte();
        int i = disF.readInt();
        double d = disF.readDouble();
// Cerramos el flujo
        disF.close(); // cierra todo
// Mostramos los datos
        System.out.println(v);
        System.out.println(c);
        System.out.println(b);
        System.out.println(i);
        System.out.println(d);
    }
}
