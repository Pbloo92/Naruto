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

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPersonaje() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPuntuacion() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

    // Getters y setters
    // ...
}
