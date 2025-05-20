package ClasesNaruto;

import java.util.ArrayList;
import java.util.List;

public class Enemigo {
    private String nombre;
    private String especie;
    private int vida;
    private List<Ataque> ataques;

    public Enemigo(String nombre, String especie, int vida) {
        this.nombre = nombre;
        this.especie = especie;
        this.vida = vida;
        this.ataques = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getVida() {
        return vida;
    }

    public void recibirDaño(int daño) {
        this.vida -= daño;
    }

    public void añadirAtaque(Ataque ataque) {
        ataques.add(ataque);
    }

    public List<Ataque> getAtaques() {
        return ataques;
    }
}
