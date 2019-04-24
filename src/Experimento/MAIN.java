/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimento;

import java.util.ArrayList;

/**
 *
 * @author Asus-PC
 */
public class MAIN {
    public static void main(String[] args) {
        MAIN admin= new MAIN();
        admin.meny();
    }
    public void meny(){
       ArrayList<Persona> Personas = new ArrayList<>();
        op rec= new op();
        rec.ejecutar();
    }
}
