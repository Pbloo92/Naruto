package dao;

import modelo.Enigma;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EnigmaDAO {

    public List<Enigma> obtenerEnigmas() {
        List<Enigma> enigmas = new ArrayList<>();
        String sql = "SELECT * FROM enigmas";

        try (Connection conn = ConexionBD.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Enigma e = new Enigma();
                e.setId(rs.getInt("id"));
                e.setNombre(rs.getString("nombre"));
                e.setDescripcion(rs.getString("descripcion"));
                e.setRecompensaArtefacto(rs.getBoolean("recompensa_artefacto"));
                e.setPuntos(rs.getInt("puntos"));
                enigmas.add(e);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo enigmas: " + e.getMessage());
        }

        return enigmas;
    }
}
