package dao;

import modelo.Escenario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EscenarioDAO {

    public List<Escenario> obtenerEscenarios() {
        List<Escenario> escenarios = new ArrayList<>();
        String sql = "SELECT * FROM escenarios";

        try (Connection conn = ConexionBD.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Escenario e = new Escenario();
                e.setId(rs.getInt("id"));
                e.setNombre(rs.getString("nombre"));
                e.setTerreno(rs.getString("terreno"));
                e.setMomentoDia(rs.getString("momento_dia"));
                e.setClima(rs.getString("clima"));
                escenarios.add(e);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo escenarios: " + e.getMessage());
        }

        return escenarios;
    }
}

