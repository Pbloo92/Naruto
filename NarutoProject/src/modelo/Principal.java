/*package modelo;

import modelo.Usuario;
import modelo.Protagonista;

import java.util.List;
import java.util.Scanner;

public class Principal {

    private static final Scanner scanner = new Scanner(System.in);
    private static Usuario jugadorActual;
    private static Protagonista protagonista;

    public static void main(String[] args) {
        System.out.println("╔═════════════════════════════════════════════════════════╗");
        System.out.println("║          BIENVENIDO A LA AVENTURA DEL MUNDO NARUTO      ║");
        System.out.println("╠═════════════════════════════════════════════════════════╣");

        empezarJuego();
       /* iniciarSesion();

        cargarProtagonista();

        mostrarMenuPrincipal();
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

    /*private static void iniciarSesion() {
        while (true) {
            System.out.println("\n¿Tienes cuenta?");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Usuario: ");
                String usuario = scanner.nextLine();
                System.out.print("Contraseña: ");
                String pass = scanner.nextLine();
                jugadorActual = jugadorDAO.login(usuario, pass);
                if (jugadorActual != null) {
                    System.out.println("¡Bienvenido, " + jugadorActual.getNombre() + "!");
                    break;
                } else {
                    System.out.println("Credenciales incorrectas.");
                }
            } else if (opcion == 2) {
                System.out.print("Elige un nombre de usuario: ");
                String usuario = scanner.nextLine();
                System.out.print("Contraseña: ");
                String pass1 = scanner.nextLine();
                System.out.print("Repite la contraseña: ");
                String pass2 = scanner.nextLine();

                if (!pass1.equals(pass2)) {
                    System.out.println("Las contraseñas no coinciden.");
                    continue;
                }

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

                jugadorActual = new Usuario(usuario, pass1, personaje);
                if (jugadorDAO.registrarJugador(jugadorActual)) {
                    System.out.println("¡Registro exitoso! Bienvenido " + usuario);
                    break;
                } else {
                    System.out.println("Nombre de usuario ya existe o error al registrar.");
                }
            } else {
                System.out.println("Opción inválida.");
            }
        }
    }

    private static void cargarProtagonista() {
        List<Protagonista> protagonistas = personajeDAO.obtenerProtagonistas();
        for (Protagonista p : protagonistas) {
            if (p.getNombre().equalsIgnoreCase(jugadorActual.getPersonaje())) {
                protagonista = p;
                break;
            }
        }

        System.out.println("Has elegido a " + protagonista.getNombre() + " con " + protagonista.getVida() + " de vida.");
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
                case 3 -> System.out.println("En desarrollo");/*jugadorDAO.mostrarTop3();
                case 4 -> System.out.println("¡Gracias por jugar!");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private static void verEstadisticas() {
        System.out.println("\nJugador: " + jugadorActual.getNombre());
        System.out.println("Personaje: " + jugadorActual.getPersonaje());
        System.out.println("Puntuación: " + jugadorActual.getPuntuacion());
        System.out.println("Vida actual: " + protagonista.getVida());
        System.out.println("Chakra actual: " + protagonista.getChakra());
        System.out.println("Ataques disponibles:");
        protagonista.getAtaques().forEach(a -> System.out.println(" - " + a.getNombre()));
    }

    private static void comenzarJuego() {
        System.out.println("\n*** PRÓXIMA IMPLEMENTACIÓN: elección de escenarios, enigmas y combates. ***");
        // Aquí se llamará a EscenarioDAO, BatallaDAO, EnigmaDAO...
		System.out.println("Aqui comienza tu aventura como: " + jugadorActual.getPersonaje());
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
    
}*/
