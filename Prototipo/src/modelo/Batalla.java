package modelo;

public class Batalla {
    private int id;
    private String nombre;
    private String ubicacion;
    private Enemigo enemigo;
    private boolean recompensaArtefacto;
    
    public Batalla() {}

    public Batalla(int id, String ubicacion, String nombre, Enemigo enemigo, boolean recompensaArtefacto) {
    	this.id = id;
    	this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.enemigo = enemigo;
        this.recompensaArtefacto = recompensaArtefacto;
    }

    // getters y setters
    // ...
}
