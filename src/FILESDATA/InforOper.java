/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FILESDATA;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class InforOper {

    int con = 0;

    /*String a;
    char b;
    double c;
    int d;
    byte e;
    boolean f;*/
    public static void main(String[] args) {
        InforOper admin = new InforOper();
        Informacion op = new Informacion();
        op = admin.llenar(admin);
        admin.mostrar(op);
    }

    public void mostrar(Informacion op) {
        System.out.println("String: " + op.getA());
        System.out.println("char: " + op.getB());
        System.out.println("double: " + op.getC());
        System.out.println("int: " + op.getD());
        System.out.println("byte: " + op.getE());
        System.out.println("boolean: " + op.getF());
    }

    public Informacion llenar(InforOper admin) {
        String a = admin.escribirString(admin);
        char b = admin.escribirCHAR(admin);
        double c = admin.escribirDouble(admin);
        int d = admin.escribirInt(admin);
        byte e = admin.escribirByte(admin);
        boolean f = admin.escribirBoolean(admin);
        Informacion llenar = new Informacion(a, b, c, d, e, f);
        return llenar;
    }

    public boolean escribirBoolean(InforOper admin) {
        boolean t = false;
        int opc = Integer.parseInt(JOptionPane.showInputDialog("para escoger:\n1) true\n2)false"));
        switch (opc) {
            case 1:
                t = true;
                con = 4;
                break;
            case 2:
                t = false;
                con = 4;
                break;
            default:
                con++;
                t = false;
                break;
        }
        return t;

    }

    public char escribirCHAR(InforOper admin) {
        String guessStr = JOptionPane.showInputDialog("Escribe una letra");

        // check if have at least one letter
        if (guessStr.length() > 0) {
        }
        char guessChar = guessStr.charAt(0);
        return guessChar;
    }

    public double escribirDouble(InforOper admin) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("ingrese dato double"));
        return a;
    }

    public int escribirInt(InforOper admin) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato int"));
        return a;
    }

    public byte escribirByte(InforOper admin) {
        byte a = Byte.parseByte(JOptionPane.showInputDialog("ingresa dato byte"));
        return a;
    }

    public String escribirString(InforOper admin) {
        String a = JOptionPane.showInputDialog("ingrese dato String");
        return a;
    }
}
