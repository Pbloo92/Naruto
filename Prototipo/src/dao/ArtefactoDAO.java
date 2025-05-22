package dao;

import modelo.Artefacto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArtefactoDAO {

    public List<Artefacto> obtenerTodos() {
        List<Artefacto> lista = new ArrayList<>();
        String sql = "SELECT * FROM artefactos";

        try (Connection conn = ConexionBD.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Artefacto a = new Artefacto(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getInt("escenario_id"),
                    rs.getInt("nombre_id")
                );
                lista.add(a);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo artefactos: " + e.getMessage());
        }

        return lista;
    }

    public List<Artefacto> obtenerPorEscenario(int escenarioId) {
        List<Artefacto> lista = new ArrayList<>();
        String sql = "SELECT * FROM artefactos WHERE escenario_id = ?";

        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, escenarioId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Artefacto a = new Artefacto(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getInt("escenario_id"),
                    rs.getInt("nombre_id")
                );
                lista.add(a);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo artefactos por escenario: " + e.getMessage());
        }

        return lista;
    }

    public Artefacto obtenerPorId(int id) {
        Artefacto a = null;
        String sql = "SELECT * FROM artefactos WHERE id = ?";

        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                a = new Artefacto(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getInt("escenario_id"),
                    rs.getInt("nombre_id")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo artefacto por id: " + e.getMessage());
        }

        return a;
    }
}

