/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labing
 */
public class Parlantes {
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
    
    
    
    int idParlantes;
    String descripcion;
    String marca;

    public Parlantes(int idParlantes, String descripcion, String marca) {
        this.idParlantes = idParlantes;
        this.descripcion = descripcion;
        this.marca = marca;
    }

    public int getIdParlantes() {
        return idParlantes;
    }

    public void setIdParlantes(int idParlantes) {
        this.idParlantes = idParlantes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
     public Parlantes() {
        this.idParlantes = 0;
        this.descripcion = "";
        this.marca = "";
    }
    
}
