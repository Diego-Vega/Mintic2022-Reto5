package Modelo.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import Util.JDBCUtilities;

import Modelo.vo.Requerimiento_1;

public class Requerimiento_1Dao {

    // Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {

        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();

        Connection conexion = null;

        try {

            conexion = JDBCUtilities.getConnection();

            String consulta = "SELECT  Ciudad, Acabados, Clasificacion, Banco_Vinculado, Constructora "+
            "FROM Proyecto "+ 
            "WHERE Ciudad = 'Bogota' ";
            // +"LIMIT 10";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Requerimiento_1 requerimiento_1 = new Requerimiento_1();

                requerimiento_1.setCiudad(resultSet.getString("Ciudad"));
                requerimiento_1.setAcabado(resultSet.getString("Acabados"));
                requerimiento_1.setClasificacion(resultSet.getString("Clasificacion"));
                requerimiento_1.setBancoVinculado(resultSet.getString("Banco_Vinculado"));
                requerimiento_1.setConstructora(resultSet.getString("Constructora"));
                respuesta.add(requerimiento_1);
            }

            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Error al hacer la consulta en requerimiento 1 " + e);
        } finally {
            if (conexion != null) {
                conexion.close();
            }
        }

        return respuesta;
    }
}