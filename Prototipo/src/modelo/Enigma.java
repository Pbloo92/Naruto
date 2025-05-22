package modelo;

public class Enigma {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean recompensaArtefacto;
    private int puntos;

    public Enigma() {}

    public Enigma(int id, String nombre, String descripcion, boolean recompensaArtefacto, int puntos) {
    	this.id = id;
    	this.nombre = nombre;
        this.descripcion = descripcion;
        this.recompensaArtefacto = recompensaArtefacto;
        this.puntos = puntos;
    }

    // Getters y setters
    // ...
}