package modelo;

public class Ataque {
    private int id;
    private String personaje;
    private String nombre;
    private int dañoTotal;
    private int dañoParcial;
    private int dañoBloqueo;
    private int chakraConsume;

    public Ataque() {}

    public Ataque(int id, String personaje, String nombre, int dañoTotal, int dañoParcial, int dañoBloqueo, int chakraConsume) {
    	this.id = id;
    	this.personaje = personaje;
        this.nombre = nombre;
        this.dañoTotal = dañoTotal;
        this.dañoParcial = dañoParcial;
        this.dañoBloqueo = dañoBloqueo;
        this.chakraConsume = chakraConsume;
    }

    // Getters y setters
    // ...
}
