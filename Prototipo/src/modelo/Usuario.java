package modelo;

public class Usuario {
    private int id;
    private String nombre;
    private String contraseña;
    private int puntuacion;

    public Usuario() {}

    public Usuario(String nombre, String contraseña, String personaje) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.puntuacion = 0;
    }

    // Getters y setters
    // ...
}
