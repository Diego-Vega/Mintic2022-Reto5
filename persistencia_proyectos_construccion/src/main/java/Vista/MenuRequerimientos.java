package Vista;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// import java.sql.SQLException;

import Controlador.ElControladorDeRequerimientos;

// GUI
public class MenuRequerimientos extends JFrame {

    public static final ElControladorDeRequerimientos CONTROLADOR = new ElControladorDeRequerimientos();

    private JButton btnRequerimiento1, btnRequerimiento2, btnRequerimiento3;
    private JButton btnprueba;
    private JPanel jpanel1, jpanel2;

    public void iniciarMenuGUI() {

        setTitle("Menu de Requerimientos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icon = new ImageIcon(getClass().getResource("/img/propiedad.png")).getImage();
        setIconImage(icon);

        setLayout(new BorderLayout());

        btnRequerimiento1 = new JButton("Requerimiento 1");
        btnRequerimiento1.addActionListener(CONTROLADOR);
        btnRequerimiento1.setActionCommand("requerimiento1");

        btnRequerimiento2 = new JButton("Requerimeinto 2");
        btnRequerimiento2.addActionListener(CONTROLADOR);
        btnRequerimiento2.setActionCommand("requerimiento2");

        btnRequerimiento3 = new JButton("Requerimeinto 3");
        btnRequerimiento3.addActionListener(CONTROLADOR);
        btnRequerimiento3.setActionCommand("requerimiento3");

        btnprueba = new JButton("Prueba");

        jpanel1 = new JPanel();
        jpanel1.setBorder(BorderFactory.createTitledBorder("Lista de requerimientos"));
        jpanel1.setLayout(new GridLayout());
        jpanel1.add(btnRequerimiento1);
        jpanel1.add(btnRequerimiento2);
        jpanel1.add(btnRequerimiento3);

        jpanel2 = new JPanel();
        jpanel2.add(btnprueba);

        getContentPane().add(BorderLayout.SOUTH ,jpanel1);
        getContentPane().add(BorderLayout.NORTH, jpanel2);
        setSize(500, 350);
        // setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
