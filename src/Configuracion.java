
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Labing
 */
public class Configuracion {
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
    Computadores PC = new Computadores();

    public static void main(String[] args) {
        Configuracion config = new Configuracion();

        config.menu();
    }

    public void menu() {
        Computadores PC = new Computadores();

        Configuracion config = new Configuracion();
        int opc = Integer.parseInt(JOptionPane.showInputDialog(" 1) agregar\n2) mostrar3\n salir"));
        switch (opc) {
            case 1:
                Computadores CREAR = new Computadores();
                config.Crear_Computador(CREAR);
                PC=CREAR;
                break;
            case 2:
                Computadores MOSTRAR = new Computadores();
                Computadores pc = new Computadores();
                config.Mostrar_Computador(MOSTRAR);
                PC=MOSTRAR;
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Hasta luego");
                System.exit(0);
                break;
            default:

                JOptionPane.showMessageDialog(null, "Error de digitacion");
                config.Crear_Computador(PC);
                break;
        }

    }

    public Computadores Mostrar_Computador(Computadores PC) {
        Configuracion config = new Configuracion();
        for (int i = 0; i < PC.hashCode(); i++) {
            System.out.println(PC.imprentas.descripcion);
        }
        return PC;
    }

    public Computadores Crear_Computador(Computadores PC) {
        Configuracion config = new Configuracion();
        Impresora imprenta = new Impresora();
        Mouse raton = new Mouse();
        Pantalla monitor = new Pantalla();
        Parlantes audifonos = new Parlantes();
        Teclado teclado = new Teclado();

        int opc = Integer.parseInt(JOptionPane.showInputDialog(" 1) llenar Impresora\n2) llenar raton\n"
                + "3) llenar Pantalla\n4) llenar parlantes\n5) llenar teclado\n6) salir"));
        switch (opc) {
            case 1:
                PC.Crear_Impresora(imprenta);
                break;
            case 2:
                PC.Crear_Mouse(raton);
                break;
            case 3:
                PC.Crear_Pantalla(monitor);
                break;
            case 4:
                PC.Crear_Parlantes(audifonos);
                break;
            case 5:
                PC.Crear_Teclado(teclado);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Hasta luego");
                System.exit(0);
                break;
            default:

                JOptionPane.showMessageDialog(null, "Error de digitacion");
                config.Crear_Computador(PC);
                break;

        }
        return PC;
    }
}
