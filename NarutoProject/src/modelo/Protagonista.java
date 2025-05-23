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

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getVida() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getFinales() {
		return finales;
	}

	public void setFinales(List<String> finales) {
		this.finales = finales;
	}

	public int getArtefactos() {
		return artefactos;
	}

	public void setArtefactos(int artefactos) {
		this.artefactos = artefactos;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void setChakra(int chakra) {
		this.chakra = chakra;
	}

	public void setAtaques(List<Ataque> ataques) {
		this.ataques = ataques;
	}

	public String getChakra() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAtaques() {
		// TODO Auto-generated method stub
		return null;
	}
    
    //getters y setters
    // ...
}
