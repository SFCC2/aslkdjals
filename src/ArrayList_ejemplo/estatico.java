/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList_ejemplo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Asus-PC
 */
public class estatico {

    public static void main(String[] args) {
        // ArrayList con tamaño
        ArrayList<String> al = new ArrayList<String>();

// Añadir elementos a un ArrayList
        System.out.println("añadir y mostrar");
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");
// Recorrer un ArrayList con un Iterador
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("");
        System.out.println("");
        System.out.println("eliminar");
// Eliminamos el segundo elemento
        al.remove(1);

        it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
