package modelo;

public class Escenario {
    private int id;
    private String nombre;
    private String terreno;
    private String momentoDia;
    private String clima;

    public Escenario() {}

    public Escenario(int id, String nombre, String terreno, String momentoDia, String clima) {
    	this.id = id;
    	this.nombre = nombre;
        this.terreno = terreno;
        this.momentoDia = momentoDia;
        this.clima = clima;
    }

    // Getters y setters
    // ...
}