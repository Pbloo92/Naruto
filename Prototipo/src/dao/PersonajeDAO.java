package dao;

import modelo.Enemigo;
import modelo.Protagonista;
import modelo.Secundario;
import modelo.Ataque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonajeDAO {
    private AtaqueDAO ataqueDAO = new AtaqueDAO();

    public List<Protagonista> obtenerProtagonistas() {
        List<Protagonista> lista = new ArrayList<>();
        String sql = "SELECT * FROM protagonistas";

        try (Connection conn = ConexionBD.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Protagonista p = new Protagonista();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setFinales(Arrays.asList(rs.getString("finales").split(",")));
                p.setVida(rs.getInt("vida"));
                p.setArtefactos(rs.getInt("artefactos"));
                p.setFrase(rs.getString("frase"));
                p.setAtaques(ataqueDAO.obtenerAtaquesPorPersonaje(p.getNombre()));
                lista.add(p);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo protagonistas: " + e.getMessage());
        }

        return lista;
    }

    public List<Enemigo> obtenerEnemigos() {
        List<Enemigo> lista = new ArrayList<>();
        String sql = "SELECT * FROM enemigos";

        try (Connection conn = ConexionBD.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Enemigo e = new Enemigo();
                e.setId(rs.getInt("id"));
                e.setNombre(rs.getString("nombre"));
                e.setEspecie(rs.getString("especie"));
                e.setVida(rs.getInt("vida"));

                List<Ataque> ataques = new ArrayList<>();
                ataques.add(obtenerAtaquePorId(rs.getInt("ataque1")));
                ataques.add(obtenerAtaquePorId(rs.getInt("ataque2")));
                ataques.add(obtenerAtaquePorId(rs.getInt("ataque3")));
                e.setAtaques(ataques);

                lista.add(e);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo enemigos: " + e.getMessage());
        }

        return lista;
    }

    private Ataque obtenerAtaquePorId(int id) {
        Ataque a = null;
        String sql = "SELECT * FROM ataques WHERE id = ?";
        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                a = new Ataque();
                a.setId(id);
                a.setPersonaje(rs.getString("personaje"));
                a.setNombre(rs.getString("nombre"));
                a.setDañoTotal(rs.getInt("daño_total"));
                a.setDañoParcial(rs.getInt("daño_parcial"));
                a.setDañoBloqueo(rs.getInt("daño_bloqueo"));
                a.setChakra(rs.getInt("chakra"));
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo ataque por ID: " + e.getMessage());
        }
        return a;
    }

    public List<Secundario> obtenerSecundarios() {
        List<Secundario> lista = new ArrayList<>();
        String sql = "SELECT * FROM secundarios";

        try (Connection conn = ConexionBD.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Secundario s = new Secundario();
                s.setId(rs.getInt("id"));
                s.setNombre(rs.getString("nombre"));
                s.setEspecie(rs.getString("especie"));
                s.setFrase(rs.getString("frase"));
                lista.add(s);
            }
        } catch (SQLException e) {
            System.err.println("Error obteniendo secundarios: " + e.getMessage());
        }

        return lista;
    }
}
