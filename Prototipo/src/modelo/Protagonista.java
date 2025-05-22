package modelo;

import java.util.List;

public class Protagonista {
    private int id;
    private String nombre;
    private List<String> finales;
    private int vida;
    private int chakra;
    private int artefactos;
    private String frase;
    private List<Ataque> ataques;

    public Protagonista() {}

    public Protagonista(int id, String nombre, int vida, int chakra, String frase, int artefactos) {
    	this.id = id;
    	this.nombre = nombre;
        this.vida = vida;
        this.chakra = chakra;
        this.artefactos = artefactos;
        this.frase = frase;
    }
    
    //getters y setters
    // ...
}
