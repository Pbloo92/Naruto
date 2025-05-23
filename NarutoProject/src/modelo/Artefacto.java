package modelo;

public class Artefacto {
    private int id;
    private String nombre;
    private String descripcion;
    private int escenarioId;
    private int batallaId; // puede ser enigma o batalla

    public Artefacto() {}

    public Artefacto(int id, String nombre, String descripcion, int escenarioId, int batallaId) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.escenarioId = escenarioId;
        this.batallaId = batallaId;
    }

    // Getters y setters
    // ...
}
