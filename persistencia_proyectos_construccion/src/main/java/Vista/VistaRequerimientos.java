package Vista;

import java.util.ArrayList;
import java.sql.SQLException;
import Controlador.ElControladorDeRequerimientos;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ElControladorDeRequerimientos CONTROLADOR = new ElControladorDeRequerimientos();

    public static void requerimiento1() throws SQLException {
        
        try {
            ArrayList<Requerimiento_1> requerimiento_1 = CONTROLADOR.consultarRequerimiento1();
            System.out.println("Ciudad Acabados Clasificación Banco_Vinculados Constructora");
            for (Requerimiento_1 proyecto : requerimiento_1) {
                System.out.printf("%s %s %s %s %s %n", proyecto.getCiudad(), proyecto.getAcabado(),
                        proyecto.getClasificacion(), proyecto.getBancoVinculado(), proyecto.getConstructora());
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento2() throws SQLException {
        
        try {
            ArrayList<Requerimiento_2> requerimiento_2 = CONTROLADOR.consultarRequerimiento2();
            System.out.println("Nombre Primer_Apellido Ciudad_Residencia Cargo Salario");
            for (Requerimiento_2 lider : requerimiento_2) {
                System.out.printf("%s %s %s %s %d %n", lider.getNombre(), lider.getPrimerApellido(),
                        lider.getCiudadResidencia(), lider.getCargo(), lider.getSalario());
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!!" + e.getMessage());
        }
    }

    public static void requerimiento3() throws SQLException {
        
        try {
            ArrayList<Requerimiento_3> requerimiento_3 = CONTROLADOR.consultarRequerimiento3();
            System.out.println("Proveedor Pagado Constructora");
            for (Requerimiento_3 compra : requerimiento_3) {
                System.out.printf("%s %s %s %n", compra.getProveedor(), compra.getPagado(), compra.getConstructora());
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!!!" + e.getMessage());
        }
    }
}
