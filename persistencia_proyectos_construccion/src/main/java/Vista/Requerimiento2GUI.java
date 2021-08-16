package Vista;

// import java.sql.SQLException;
import java.util.ArrayList;

import Controlador.ElControladorDeRequerimientos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Image;

import Modelo.vo.Requerimiento_2;

// GUI
public class Requerimiento2GUI extends JFrame {

    public static final ElControladorDeRequerimientos CONTROLADOR = new ElControladorDeRequerimientos();

    private JTable tabla;
    private JScrollPane sp;

    public Requerimiento2GUI(ArrayList<Requerimiento_2> consulta2, ElControladorDeRequerimientos controlador){
        
        setTitle("Vista de Consulta 2");
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Image icon = new ImageIcon(getClass().getResource("/img/bienes-raices-icon.png")).getImage();
        setIconImage(icon);

        setLayout(new BorderLayout());
        String[] nombres = {"Nombre", "Primer_Apellido", "Ciudad_Residencia", "Cargo", "Salario"};
        tabla = new JTable(this.mostrar(consulta2, nombres.length), nombres);
        sp = new JScrollPane(tabla);
        add(sp,BorderLayout.CENTER);

        // Para la edicción del contenio en las celdas de la tabla
        tabla.setEnabled(false);
        // Para cambiar la ubicación de las columnas de la tabla
        tabla.getTableHeader().setReorderingAllowed(false);
        // tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // tabla.doLayout();

        setSize(650,255);
        // setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public String[][] mostrar(ArrayList<Requerimiento_2> lista, int nombres) {
        
        // ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        // // Requerimiento_1Dao requerimiento_1Dao = new Requerimiento_1Dao();
        // lista = CONTROLADOR.consultarRequerimiento1();

        String[][] matris = new String [lista.size()][nombres];

        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getNombre();
            matris[i][1] = lista.get(i).getPrimerApellido();
            matris[i][2] = lista.get(i).getCiudadResidencia();
            matris[i][3] = lista.get(i).getCargo();
            matris[i][4] = String.valueOf(lista.get(i).getSalario());
        }
        return matris;
    }
}
