package modelo;

import java.util.List;

public class Enemigo {
    private int id;
    private String nombre;
    private String especie;
    private int vida;
    private int chakra;
    private List<Ataque> ataques;

    public Enemigo() {}

    public Enemigo(int id, String especie, String nombre, int vida, int chakra) {
    	this.id = id;
    	this.especie = especie;
        this.nombre = nombre;
        this.vida = vida;
        this.chakra = chakra;
    }
    
    //getters y setters
    // ...
}