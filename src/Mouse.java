/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labing
 */
public class Mouse {
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
    
    
    int idRaton;
    int contadorRatones;

    public Mouse(int idRaton, int contadorRatones) {
        this.idRaton = idRaton;
        this.contadorRatones = contadorRatones;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    public int getContadorRatones() {
        return contadorRatones;
    }

    public void setContadorRatones(int contadorRatones) {
        this.contadorRatones = contadorRatones;
    }
    public Mouse() {
        this.idRaton = 0;
        this.contadorRatones = 0;
    }
    
}
