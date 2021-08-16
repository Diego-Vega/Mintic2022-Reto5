package Vista;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// import java.sql.SQLException;

import Controlador.ElControladorDeRequerimientos;

// GUI
public class MenuRequerimientos extends JFrame {

    public static final ElControladorDeRequerimientos CONTROLADOR = new ElControladorDeRequerimientos();

    private JButton btnRequerimiento1, btnRequerimiento2, btnRequerimiento3;
    private JPanel jpanel1, jpanel2;
    private JLabel label1;

    public void iniciarMenuGUI() {

        setTitle("Menu de Requerimientos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icon = new ImageIcon(getClass().getResource("/img/bienes-raices-icon.png")).getImage();
        setIconImage(icon);

        setLayout(new BorderLayout());
        
        // Botones
        btnRequerimiento1 = new JButton("Requerimiento 1");
        btnRequerimiento1.addActionListener(CONTROLADOR);
        btnRequerimiento1.setActionCommand("requerimiento1");

        btnRequerimiento2 = new JButton("Requerimeinto 2");
        btnRequerimiento2.addActionListener(CONTROLADOR);
        btnRequerimiento2.setActionCommand("requerimiento2");

        btnRequerimiento3 = new JButton("Requerimeinto 3");
        btnRequerimiento3.addActionListener(CONTROLADOR);
        btnRequerimiento3.setActionCommand("requerimiento3");

        label1 = new JLabel(new ImageIcon("/img/inmobiliaria.png"));
        label1.setBounds(20, 20, 100, 80);
        

        // Contenedores y configuración
        jpanel1 = new JPanel();
        jpanel1.add(label1);
        

        jpanel2 = new JPanel();
        jpanel2.setBorder(BorderFactory.createTitledBorder("Lista Requerimientos"));
        jpanel2.setLayout(new BoxLayout(jpanel2, BoxLayout.Y_AXIS));

        jpanel2.add(Box.createRigidArea(new Dimension(0, 20)));
        jpanel2.add(btnRequerimiento1);
        jpanel2.add(Box.createRigidArea(new Dimension(0, 35)));
        jpanel2.add(btnRequerimiento2);
        jpanel2.add(Box.createRigidArea(new Dimension(0, 35)));
        jpanel2.add(btnRequerimiento3);

        // Agregar Contenedores y organización
        getContentPane().add(jpanel1, BorderLayout.CENTER);
        getContentPane().add(jpanel2, BorderLayout.EAST);
        setSize(400, 250);
        // setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
