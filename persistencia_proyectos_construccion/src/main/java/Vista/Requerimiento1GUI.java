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

import Modelo.vo.Requerimiento_1;

// GUI
public class Requerimiento1GUI extends JFrame {

    public static final ElControladorDeRequerimientos CONTROLADOR = new ElControladorDeRequerimientos();

    private JTable tabla;
    private JScrollPane sp;

    public Requerimiento1GUI(ArrayList<Requerimiento_1> consulta1, ElControladorDeRequerimientos controlador){
        
        setTitle("Vista de Consulta 1");
        // setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Image icon = new ImageIcon(getClass().getResource("/img/bienes-raices-icon.png")).getImage();
        setIconImage(icon);

        setLayout(new BorderLayout());
        String[] nombres = {"Ciudad", "Acabados", "Clasificacion", "Banco_Vinculado", "Constructora"};
        tabla = new JTable(this.mostrar(consulta1, nombres.length), nombres);
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

    public String[][] mostrar(ArrayList<Requerimiento_1> lista, int nombres){
        
        // ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        // Requerimiento_1Dao requerimiento_1Dao = new Requerimiento_1Dao();
        // lista = requerimiento_1Dao.requerimiento();
        // lista = CONTROLADOR.consultarRequerimiento1();
        
        String[][] matris = new String [lista.size()][nombres];

        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getCiudad();
            matris[i][1] = lista.get(i).getAcabado();
            matris[i][2] = lista.get(i).getClasificacion();
            matris[i][3] = lista.get(i).getBancoVinculado();
            matris[i][4] = lista.get(i).getConstructora();
        }
        return matris;
    }
}
