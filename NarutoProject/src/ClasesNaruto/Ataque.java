package ClasesNaruto;


public class Ataque {
    private String nombre;
    private int dañoTotal;
    private int dañoParcial;
    private int fallo;

    public Ataque(String nombre, int dañoTotal, int dañoParcial, int fallo) {
        this.nombre = nombre;
        this.dañoTotal = dañoTotal;
        this.dañoParcial = dañoParcial;
        this.fallo = fallo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDaño(String tipoImpacto) {
        return switch (tipoImpacto.toLowerCase()) {
            case "total" -> dañoTotal;
            case "parcial" -> dañoParcial;
            case "fallo" -> fallo;
            default -> 0;
        };
    }
}
 