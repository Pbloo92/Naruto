package ClasesNaruto;

public class Escenario {
    private String nombre;
    private String clima;
    private String momentoDelDia;
    private String terreno;

    public Escenario(String nombre, String clima, String momentoDelDia, String terreno) {
        this.nombre = nombre;
        this.clima = clima;
        this.momentoDelDia = momentoDelDia;
        this.terreno = terreno;
    }

    public int getPenalizacionAtaque() {
        int penalizacion = 0;

        // Clima
        switch (clima.toLowerCase()) {
            case "lluvia" -> penalizacion += 1;
            case "nieve" -> penalizacion += 2;
        }

        // Terreno
        switch (terreno.toLowerCase()) {
            case "rocoso" -> penalizacion += 1;
            case "montañoso" -> penalizacion += 2;
        }

        return penalizacion;
    }

    public int getPenalizacionDefensa() {
        int penalizacion = 0;

        // Terreno
        switch (terreno.toLowerCase()) {
            case "rocoso" -> penalizacion += 1;
            case "montañoso" -> penalizacion += 2;
        }

        // Momento del día
        if (momentoDelDia.equalsIgnoreCase("noche")) {
            penalizacion += 1;
        }

        return penalizacion;
    }

    public int getBonificacionAtaque() {
        return momentoDelDia.equalsIgnoreCase("noche") ? 2 : 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return clima + ", " + momentoDelDia + ", " + terreno;
    }
} 

