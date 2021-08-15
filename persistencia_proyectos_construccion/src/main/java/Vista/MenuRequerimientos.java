package Vista;

// import java.sql.SQLException;

import Controlador.ElControladorDeRequerimientos;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JButton;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;

// GUI
public class MenuRequerimientos extends JFrame {

    public static final ElControladorDeRequerimientos CONTROLADOR = new ElControladorDeRequerimientos();

    private JButton btnRequerimiento1;
    private JButton btnRequerimiento2;
    private JButton btnRequerimiento3;
    private JPanel panel;

    public void iniciarMenuGUI() {

        setTitle("Menu de Requerimientos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icon = new ImageIcon(getClass().getResource("/img/propiedad.png")).getImage();
        setIconImage(icon);

        // setLayout(new BorderLayout());

        btnRequerimiento1 = new JButton("Requerimiento 1");
        btnRequerimiento1.addActionListener(CONTROLADOR);
        btnRequerimiento1.setActionCommand("requerimiento1");

        btnRequerimiento2 = new JButton("Requerimeinto 2");
        btnRequerimiento2.addActionListener(CONTROLADOR);
        btnRequerimiento2.setActionCommand("requerimiento2");

        btnRequerimiento3 = new JButton("Requerimeinto 3");
        btnRequerimiento3.addActionListener(CONTROLADOR);
        btnRequerimiento3.setActionCommand("requerimiento3");

        panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.add(btnRequerimiento1);
        panel.add(btnRequerimiento2);
        panel.add(btnRequerimiento3);

        getContentPane().add(panel);
        setSize(500, 80);
        // setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
