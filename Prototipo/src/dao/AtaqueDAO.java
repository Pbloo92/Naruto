package dao;

import modelo.Ataque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AtaqueDAO {

    public List<Ataque> obtenerAtaquesPorPersonaje(String nombrePersonaje) {
        List<Ataque> lista = new ArrayList<>();
        String sql = "SELECT * FROM ataques WHERE personaje = ?";

        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombrePersonaje);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Ataque a = new Ataque();
                a.setId(rs.getInt("id"));
                a.setPersonaje(rs.getString("personaje"));
                a.setNombre(rs.getString("nombre"));
                a.setDañoTotal(rs.getInt("daño_total"));
                a.setDañoParcial(rs.getInt("daño_parcial"));
                a.setDañoBloqueo(rs.getInt("daño_bloqueo"));
                a.setChakra(rs.getInt("chakra"));
                lista.add(a);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo ataques: " + e.getMessage());
        }

        return lista;
    }
}
