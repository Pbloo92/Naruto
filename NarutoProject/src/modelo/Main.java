package modelo;

import modelo.Usuario;
import modelo.Protagonista;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static Usuario jugadorActual;
    private static Protagonista protagonista;

    public static void main(String[] args) {
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("║          BIENVENIDO A LA AVENTURA DEL MUNDO NARUTO      ║");
        System.out.println("╠═════════════════════════════════════════════════════════╣");

        mostrarMenuPrincipal();
        empezarJuego();
        
      
    }
    
    private static void empezarJuego() {
    	System.out.println("Elige un personaje:");
        System.out.println("1. Naruto");
        System.out.println("2. Sasuke");
        System.out.println("3. Gaara");
        System.out.print("Opción: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine();

        String personaje = switch (eleccion) {
            case 1 -> "Naruto";
            case 2 -> "Sasuke";
            case 3 -> "Gaara";
            default -> {
                System.out.println("Opción inválida, se selecciona Naruto por defecto.");
                yield "Naruto";
            }
        };
    }


    private static void mostrarMenuPrincipal() {
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Comenzar juego");
            System.out.println("2. Ver estadísticas");
            System.out.println("3. Ver TOP 3 jugadores");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> comenzarJuego();
                case 2 -> verEstadisticas();
                case 3 -> System.out.println("En desarrollo");
                case 4 -> System.out.println("¡Gracias por jugar!");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private static void verEstadisticas() {
        System.out.println("\nJugador: " + jugadorActual.getNombre());
        System.out.println("Personaje: " + protagonista.getNombre());
        System.out.println("Puntuación: " + jugadorActual.getPuntuacion());
        System.out.println("Vida actual: " + protagonista.getVida());
        System.out.println("Chakra actual: " + protagonista.getChakra());
        System.out.println("Ataques disponibles:");
    }

    private static void comenzarJuego() {
        System.out.println("\n*** PRÓXIMA IMPLEMENTACIÓN: elección de escenarios, enigmas y combates. ***");
        
		System.out.println("Aqui comienza tu aventura como: " + protagonista.getNombre());
		System.out.println("");
		System.out.println("Años después de la Cuarta Gran Guerra Ninja, el mundo shinobi disfruta \n"
				+ "de una paz frágil. Sin embargo, la aparición de antiguos templos \n"
				+ "cargados de energías oscuras amenaza con desatar un nuevo conflicto.\n"
				+ "Cada templo encierra misterios que alteran las leyes de la naturaleza y el chakra, y \n"
				+ "están protegidos por enemigos resucitados o corrompidos. Naruto, Sasuke y Gaara son \n"
				+ "designados para liderar una misión crítica: descubrir el origen de estos templos y\n"
				+ "detener la amenaza antes de que el mundo colapse nuevamente.");
		System.out.println("");
		System.out.println("Deberás ir tomando decisiones para detener la amenaza, podrás interactuar con \n"
				+ "algunos personajes que te ayudarán y otros que te harán luchar así que no será fácil.");

		// ELECCION DEL LUGAR
			System.out.println("Elige una ubicacion a la que ir:");
			System.out.println("");
			System.out.println("1.Cueva de la Niebla Oscura ");
			System.out.println("2.Laboratorio Perdido ");
			System.out.println("3.Templo del Tiempo ");
			System.out.println("4.Fortaleza de las Sombras");
			System.out.println("5.Santuario de la Arena Desolada ");
			System.out.println("6.Palacio Celestial ");
    }
    
}
