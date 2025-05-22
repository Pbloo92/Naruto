package dao;

import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {

    public boolean registrarJugador(Usuario jugador) {
        String sql = "INSERT INTO jugadores (nombre, contraseña, personaje, puntuacion) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, jugador.getNombre());
            stmt.setString(2, jugador.getContraseña());
            stmt.setInt(3, jugador.getPuntuacion());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error registrando jugador: " + e.getMessage());
            return false;
        }
    }

    public Usuario login(String nombre, String contraseña) {
        String sql = "SELECT * FROM jugadores WHERE nombre = ? AND contraseña = ?";
        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombre);
            stmt.setString(2, contraseña);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
            	Usuario j = new Usuario();
                j.setId(rs.getInt("id"));
                j.setNombre(rs.getString("nombre"));
                j.setContraseña(rs.getString("contraseña"));
                j.setPuntuacion(rs.getInt("puntuacion"));
                return j;
            }
        } catch (SQLException e) {
            System.err.println("Error en login: " + e.getMessage());
        }
        return null;
    }

    public void actualizarPuntuacion(String nombre, int puntos) {
        String sql = "UPDATE jugadores SET puntuacion = ? WHERE nombre = ?";
        try (Connection conn = ConexionBD.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, puntos);
            stmt.setString(2, nombre);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error actualizando puntuación: " + e.getMessage());
        }
    }

    public void mostrarTop3() {
        String sql = "SELECT nombre, puntuacion FROM jugadores ORDER BY puntuacion DESC LIMIT 3";
        try (Connection conn = ConexionBD.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("TOP 3 JUGADORES:");
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " -> " + rs.getInt("puntuacion") + " puntos");
            }
        } catch (SQLException e) {
            System.err.println("Error mostrando top 3: " + e.getMessage());
        }
    }
}
