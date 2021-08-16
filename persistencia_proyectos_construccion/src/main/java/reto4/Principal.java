package reto4;

import Vista.Requerimiento1GUI;
import Vista.VistaRequerimientos;

import java.sql.SQLException;

import Controlador.ElControladorDeRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales, no se debe subir en
 * iMaster
 */
public class Principal {

    public static void main(String[] args) throws SQLException {

        // ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        // controlador.inicio1();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        controlador.inicio2();

        // Requerimiento1GUI menu = new Requerimiento1GUI();
        // System.out.println("Requerimiento 1");
        // VistaRequerimientos.requerimiento1();
        // System.out.println("\nRequerimiento 2");
        // VistaRequerimientos.requerimiento2();
        // System.out.println("\nRequerimiento 3");
        // VistaRequerimientos.requerimiento3();
    }
}
