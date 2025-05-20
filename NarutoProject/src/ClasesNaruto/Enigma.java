package ClasesNaruto;

public class Enigma {
    private String pregunta;
    private String respuesta;
    private int puntos;

    public Enigma(String pregunta, String respuesta, int puntos) {
        this.pregunta = pregunta;
        this.respuesta = respuesta.toLowerCase();
        this.puntos = puntos;
    }

    public String getPregunta() {
        return pregunta;
    }

    public boolean comprobarRespuesta(String entradaUsuario) {
        return entradaUsuario.trim().toLowerCase().equals(respuesta);
    }

    public int getPuntos() {
        return puntos;
    }
} 
