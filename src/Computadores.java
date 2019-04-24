
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



public class Computadores {
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
    Impresora imprentas;
    Mouse ratons;
    Pantalla monitors;
    Parlantes audifonoss;
    Teclado teclados;

    public Computadores(Impresora imprentas, Mouse ratons, Pantalla monitors, Parlantes audifonoss, Teclado teclados) {
        this.imprentas = imprentas;
        this.ratons = ratons;
        this.monitors = monitors;
        this.audifonoss = audifonoss;
        this.teclados = teclados;
    }

    public Computadores() {
        this.imprentas = null;
        this.ratons = null;
        this.monitors = null;
        this.audifonoss = null;
        this.teclados = null;
    }

    public Impresora getImprentas() {
        return imprentas;
    }

    public void setImprentas(Impresora imprentas) {
        this.imprentas = imprentas;
    }

    public Mouse getRatons() {
        return ratons;
    }

    public void setRatons(Mouse ratons) {
        this.ratons = ratons;
    }

    public Pantalla getMonitors() {
        return monitors;
    }

    public void setMonitors(Pantalla monitors) {
        this.monitors = monitors;
    }

    public Parlantes getAudifonoss() {
        return audifonoss;
    }

    public void setAudifonoss(Parlantes audifonoss) {
        this.audifonoss = audifonoss;
    }

    public Teclado getTeclados() {
        return teclados;
    }

    public void setTeclados(Teclado teclados) {
        this.teclados = teclados;
    }

    public Impresora Crear_Impresora(Impresora imprenta) {
        Configuracion config = new Configuracion();
        JOptionPane.showMessageDialog(null, "Bienvenido a Impresora");
        String marca = JOptionPane.showInputDialog("Ingrese marca");
        imprenta.marca = marca;
        String descp = JOptionPane.showInputDialog("Ingrese descripcion");
        imprenta.descripcion = descp;
        int id = Integer.parseInt(JOptionPane.showInputDialog(" ingrese ID Impresora"));
        imprenta.idImpresora = id;
        config.menu();
        return imprenta;

    }

    public Mouse Crear_Mouse(Mouse raton) {
        Configuracion config = new Configuracion();
        JOptionPane.showMessageDialog(null, "Bienvenido a Raton");
        int id = Integer.parseInt(JOptionPane.showInputDialog(" ingrese id raton"));
        raton.idRaton = id;
        int cont = Integer.parseInt(JOptionPane.showInputDialog(" ingrese contador"));
        raton.contadorRatones = cont;
        config.menu();
        return raton;
    }

    public Pantalla Crear_Pantalla(Pantalla monitor) {
        Configuracion config = new Configuracion();
        JOptionPane.showMessageDialog(null, "Bienvenido a Pantalla");
        int idMonitor = Integer.parseInt(JOptionPane.showInputDialog(" ingrese id Pantalla"));
        monitor.idMonitor = idMonitor;
        String marca = JOptionPane.showInputDialog(" ingrese Marca pantalla");
        monitor.marca = marca;
        double tamaño = Double.parseDouble(JOptionPane.showInputDialog("Ingrese tamaño pantalla"));
        monitor.tamaño = tamaño;
        int contadorMonitores = Integer.parseInt(JOptionPane.showInputDialog(" ingrese contador pantalla"));
        monitor.contadorMonitores = contadorMonitores;
        config.menu();
        return monitor;
    }

    public Parlantes Crear_Parlantes(Parlantes audifonos) {
        Configuracion config = new Configuracion();
        JOptionPane.showMessageDialog(null, "Bienvenido a Parlantes");
        int idParlantes = Integer.parseInt(JOptionPane.showInputDialog(" ingrese id audifonos"));
        String descripcion = JOptionPane.showInputDialog(" ingrese Marca descripcion");
        String marca = JOptionPane.showInputDialog(" ingrese Marca marca");
        config.menu();
        return audifonos;
    }

    public Teclado Crear_Teclado(Teclado teclado) {
        Configuracion config = new Configuracion();
        JOptionPane.showMessageDialog(null, "Bienvenido a Teclado");
        int idTeclado = Integer.parseInt(JOptionPane.showInputDialog(" ingrese id Teclado"));
        String descripcion = JOptionPane.showInputDialog(" ingrese descripcion");
        config.menu();
        return teclado;
    }
}
