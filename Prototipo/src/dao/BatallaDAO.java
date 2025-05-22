package dao;

import modelo.Batalla;
import modelo.Enemigo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BatallaDAO {
    private final PersonajeDAO personajeDAO = new PersonajeDAO();

    public List<Batalla> obtenerBatallas() {
        List<Batalla> lista = new ArrayList<>();
        String sql = "SELECT * FROM batallas";

        try (Connection conn = ConexionBD.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            List<Enemigo> enemigos = personajeDAO.obtenerEnemigos();

            while (rs.next()) {
                Batalla b = new Batalla();
                b.setId(rs.getInt("id"));
                b.setNombre(rs.getString("nombre"));
                b.setUbicacion(rs.getString("ubicacion"));

                int enemigoId = rs.getInt("enemigo_id");
                Enemigo enemigo = enemigos.stream().filter(e -> e.getId() == enemigoId).findFirst().orElse(null);
                b.setEnemigo(enemigo);
                b.setRecompensaArtefacto(rs.getBoolean("recompensa_artefacto"));

                lista.add(b);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo batallas: " + e.getMessage());
        }

        return lista;
    }
}

