package Vista;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.GridLayout;
//import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

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
        private JLabel labelImagen, labelTitulo;

        public void iniciarMenuGUI() {

        //Configuración de Ventana
        setTitle("Menu de Consultas");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icon = new ImageIcon(getClass().getResource("/img/bienes-raices-icon.png")).getImage();
        setIconImage(icon);

        setLayout(new BorderLayout());

        // Botones
        btnRequerimiento1 = new JButton("Consulta 1");
        btnRequerimiento1.setFont(new Font("Arial", 1, 14));
        btnRequerimiento1.addActionListener(CONTROLADOR);
        btnRequerimiento1.setActionCommand("requerimiento1");
        btnRequerimiento1.setAlignmentX(Component.CENTER_ALIGNMENT);

        btnRequerimiento2 = new JButton("Consulta 2");
        btnRequerimiento2.setFont(new Font("Arial", 1, 14));
        btnRequerimiento2.addActionListener(CONTROLADOR);
        btnRequerimiento2.setActionCommand("requerimiento2");
        btnRequerimiento2.setAlignmentX(Component.CENTER_ALIGNMENT);

        btnRequerimiento3 = new JButton("Consulta 3");
        btnRequerimiento3.setFont(new Font("Arial", 1, 14));
        btnRequerimiento3.addActionListener(CONTROLADOR);
        btnRequerimiento3.setActionCommand("requerimiento3");
        btnRequerimiento3.setAlignmentX(Component.CENTER_ALIGNMENT);

        //Etiquetas
        //->titulo
        labelTitulo = new JLabel("BIENVENIDO");
        labelTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        labelTitulo.setFont(new Font("Arial", 1, 14));

        //->imagen
        labelImagen = new JLabel();
        labelImagen.setIcon(new ImageIcon(getClass().getResource("/img/bienes-raices-icon.png")));
        labelImagen.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Contenedores y configuración
        //->contenedor 1
        jpanel1 = new JPanel();
        jpanel1.setLayout(new BoxLayout(jpanel1, BoxLayout.Y_AXIS));
        jpanel1.add(Box.createRigidArea(new Dimension(0, 20)));
        jpanel1.add(labelTitulo);
        jpanel1.add(Box.createRigidArea(new Dimension(0, 20)));
        jpanel1.add(labelImagen);

        //->contenedor 2
        jpanel2 = new JPanel();
        jpanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1),
                "Escoja una Consulta",
                javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.ABOVE_TOP,
                new Font("Arial", 1, 14)));

//        jpanel2.setLayout(new BoxLayout(jpanel2, BoxLayout.Y_AXIS));
//        jpanel2.setLayout(new BorderLayout());
        jpanel2.setLayout(new GridLayout(3, 1, 1, 10));

//        jpanel2.add(Box.createRigidArea(new Dimension(0, 20)));
//        jpanel2.add(btnRequerimiento1, BorderLayout.PAGE_START);
        jpanel2.add(btnRequerimiento1);
//        jpanel2.add(Box.createRigidArea(new Dimension(0, 5)));
//        jpanel2.add(btnRequerimiento2, BorderLayout.CENTER);
        jpanel2.add(btnRequerimiento2);
//        jpanel2.add(Box.createRigidArea(new Dimension(0, 5)));
//        jpanel2.add(btnRequerimiento3, BorderLayout.PAGE_END);
        jpanel2.add(btnRequerimiento3);

        // Agregar Contenedores y organización
        getContentPane().add(jpanel1, BorderLayout.CENTER);
        getContentPane().add(jpanel2, BorderLayout.SOUTH);
        setSize(350, 350);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        }
}
