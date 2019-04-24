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
import javax.swing.JOptionPane;

/**
 *
 * @author SFCC2
 * @fecha: 12/12/2018
 * @OrigenLugar: NA
 * @tema: File_DATE 
 */
public class FileData_dinamico {

    int con = 0;

    public static void main(String[] args) {
        FileData_dinamico admin = new FileData_dinamico();
        admin.menu2();

    }    
    public void menu2() {
        try {

            FileData_dinamico admin = new FileData_dinamico();
            InforOper adminis = new InforOper();
            Informacion op = new Informacion();
            op= adminis.llenar(adminis);//op = admin.datos(adminis, op);

            FileOutputStream gdF = new FileOutputStream("datos.dat");
            DataOutputStream dosF = null;
            dosF = admin.out(gdF, dosF, op);
            
            FileInputStream ldF = new FileInputStream("datos.dat");
            DataInputStream disF = null;
            disF = admin.in(ldF, disF,admin );
            
            adminis.mostrar(op);
            
        } catch (Exception e) {
        }
    }

    public DataOutputStream out(FileOutputStream gdF, DataOutputStream dosF, Informacion op) {
        try {
            dosF = new DataOutputStream(gdF);
            dosF.writeBoolean(op.getF());
            dosF.writeChar(op.getB());
            dosF.writeByte(op.getE());
            dosF.writeInt(op.getD());
            dosF.writeDouble(op.getC());
            dosF.writeChars(op.getA());
            dosF.close();
        } catch (Exception e) {
        }
        return dosF;
    }

    public DataInputStream in(FileInputStream ldF, DataInputStream disF,FileData_dinamico admin) {
        try {
            disF = new DataInputStream(ldF);
            boolean v = disF.readBoolean();
            char c = disF.readChar();
            byte b = disF.readByte();
            int i = disF.readInt();
            double d = disF.readDouble();
            String a = disF.readLine();
// Cerramos el flujo
            disF.close(); // cierra todo            
        } catch (Exception e) {
        }
        return disF;
    }

   /* public Informacion datos(InforOper adminis, Informacion op) {
        op = adminis.llenar(adminis);
        return op;
    }*/

   
}
