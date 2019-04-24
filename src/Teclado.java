/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labing
 */
public class Teclado {
    private static final char UPPER_LEFT_CORNER = '┌';
    private static final char UPPER_RIGHT_CORNER = '┐';
    private static final char HORIZONTAL_LINE = '─';
    private static final char VERTICAL_LINE = '│';
    private static final char INTERSECTION = '┼';
    private static final char INTERSECTION_HORIZONTAL_DOWN = '┴';
    private static final char INTERSECTION_VERTICAL_LEFT = '├';
    private static final char INTERSECTION_VERTICAL_RIGHT = '┤';
    private static final char LOWER_LEFT_CORNER = '└';
    private static final char LOWER_RIGHT_CORNER = '┘';
    
    int idTeclado;
    String descripcion;

    public Teclado(int idTeclado, String descripcion) {
        this.idTeclado = idTeclado;
        this.descripcion = descripcion;
    }

     public Teclado() {
        this.idTeclado = 0;
        this.descripcion = "";
    }
}
