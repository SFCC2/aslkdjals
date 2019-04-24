/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList_ejemplo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */
public class dinamico {
    public static void main(String[] args) {
        dinamico admin= new  dinamico();
        admin.ejecutar();
    }
    public void ejecutar(){
        dinamico admin= new  dinamico();
        String a[]= null,b[]=null;        
        int cantidad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del arreglo"));
        a=admin.llenar_arregloString(admin,cantidad);
        b=admin.llenar_arregloString(admin, cantidad);
        admin.mostrar_arregloString(a);
        List<String> bandList = new ArrayList<String>();
        bandList= admin.crear_lista(a);
        List<String> undesirableList = new ArrayList<String>();
        undesirableList=admin.crear_lista(b);
        System.out.println("");
        System.out.println("\n");
        admin.mostrar_Lista(bandList);
          System.out.println("");
        System.out.println("\n");
        admin.mostrar_Lista(undesirableList);
        System.out.println("");
        String x= JOptionPane.showInputDialog("ingrese dato a eliminar teniendo en cuenta el listado");
        removeBands(bandList, undesirableList);
        System.out.println("\n\nI just wish these bands: ");

        for (int count = 0; count < bandList.size(); count++) {
            System.out.printf("%s ", bandList.get(count));
        }
    }
    
    
    public String[] llenar_arregloString(dinamico admin,int cantidad){
        String a[]= new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            String b=JOptionPane.showInputDialog("escriba el contenido");
            a[i]=b;
        }
        return a;
    }
    public List<String> crear_lista(String b[]){
        List<String> a = new ArrayList<String>();
        for (String y : b) {
            a.add(y);
        }return a;
    }    
    public void mostrar_arregloString(String a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public void mostrar_Lista(List<String> bandList){
       System.out.println("List of bands has: ");
        for (int count = 0; count < bandList.size(); count++) {
            System.out.printf("%s ", bandList.get(count)+",");
        }
    }
    
    public static void removeBands(Collection<String> bands,
            Collection<String> undesirableBands) {
        Iterator<String> iteratorBand = bands.iterator();

        while (iteratorBand.hasNext()) {
            if (undesirableBands.contains(iteratorBand.next())) {
                iteratorBand.remove();
            }
        }
    }
}

