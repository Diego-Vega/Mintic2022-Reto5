package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import Modelo.dao.Requerimiento_1Dao;
import Modelo.dao.Requerimiento_2Dao;
import Modelo.dao.Requerimiento_3Dao;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

import Vista.MenuRequerimientos;
import Vista.Requerimiento1GUI;
import Vista.Requerimiento2GUI;
import Vista.Requerimiento3GUI;
import Vista.VistaMenu;

public class ElControladorDeRequerimientos implements ActionListener {

    private final Requerimiento_1Dao REQUERIMIENTO_1DAO;
    private final Requerimiento_2Dao REQUERIMIENTO_2DAO;
    private final Requerimiento_3Dao REQUERIMIENTO_3DAO;
    private final MenuRequerimientos menuRequerimientos;
    private VistaMenu vistamenu;
    private Requerimiento1GUI requerimiento1gui;
    private Requerimiento2GUI requerimiento2gui;
    private Requerimiento3GUI requerimiento3gui;

    public ElControladorDeRequerimientos() {
        this.REQUERIMIENTO_1DAO = new Requerimiento_1Dao();
        this.REQUERIMIENTO_2DAO = new Requerimiento_2Dao();
        this.REQUERIMIENTO_3DAO = new Requerimiento_3Dao();
        this.menuRequerimientos = new MenuRequerimientos();
//        this.vistamenu = new VistaMenu();
    }

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        return this.REQUERIMIENTO_1DAO.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return this.REQUERIMIENTO_2DAO.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return this.REQUERIMIENTO_3DAO.requerimiento3();
    }

    public void inicio1() throws SQLException {
        this.menuRequerimientos.iniciarMenuGUI();
    }

    public VistaMenu inicio2() throws SQLException {
        return this.vistamenu = new VistaMenu();
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {

        String actionCommand = ((JButton) e.getSource()).getActionCommand();

        switch (actionCommand) {
            case "requerimiento1":
                try {
                this.requerimiento1gui = new Requerimiento1GUI(consultarRequerimiento1(), this);
            } catch (SQLException excepcion) {
                System.err.println("Ha ocurrido un error consultando el requerimiento 1: " + excepcion);
            }
            break;
            case "requerimiento2":
                try {
                this.requerimiento2gui = new Requerimiento2GUI(consultarRequerimiento2(), this);
            } catch (SQLException excepcion) {
                System.err.println("Ha ocurrido un error consultando el requerimiento 2: " + excepcion);
            }
            break;
            case "requerimiento3":
                try {
                this.requerimiento3gui = new Requerimiento3GUI(consultarRequerimiento3(), this);
            } catch (SQLException excepcion) {
                System.err.println("Ha ocurrido un error consultando el requerimiento 3: " + excepcion);
            }
            break;
            default:
                break;
        }
    }
}
