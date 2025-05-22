package ClasesNaruto;

import java.util.*;

public class Juego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseDatos db = new BaseDatos();

        System.out.println("=== ELIGE TU PROPIA AVENTURA ===");

        int usuarioId = -1;
        String nombreUsuario = "";

        while (usuarioId == -1) {
            System.out.print("\n¿Tienes cuenta? (s/n): ");
            String opcion = sc.nextLine();

            System.out.print("Nombre de usuario: ");
            nombreUsuario = sc.nextLine();

            System.out.print("Contraseña: ");
            String contrasena = sc.nextLine();

            if (opcion.equalsIgnoreCase("s")) {
                usuarioId = db.login(nombreUsuario, contrasena);
                if (usuarioId == -1) {
                    System.out.println("⚠️ Usuario o contraseña incorrectos.");
                }
            } else {
                boolean registrado = db.registrarUsuario(nombreUsuario, contrasena);
                if (registrado) {
                    usuarioId = db.login(nombreUsuario, contrasena);
                    System.out.println("✅ Usuario registrado con éxito.");
                }
            }
        }

        // Crear jugador
        // Naruto
        Jugador jugador = new Jugador(nombreUsuario);
        jugador.añadirAtaque(new Ataque("Rasengan", 30, 15, 0));
        jugador.añadirAtaque(new Ataque("Shuriken", 20, 10, 0));
        jugador.añadirAtaque(new Ataque("Clones de sombra", 25, 12, 0));
        
     // Sasuke
        Jugador jugador2 = new Jugador(nombreUsuario);
        jugador.añadirAtaque(new Ataque("Chidori", 30, 15, 0));
        jugador.añadirAtaque(new Ataque("Susano", 20, 10, 0));
        jugador.añadirAtaque(new Ataque("Amateratsu", 25, 12, 0));
        
     // Gaara
        Jugador jugador3 = new Jugador(nombreUsuario);
        jugador.añadirAtaque(new Ataque("Ataúd de atadura de arena", 30, 15, 0));
        jugador.añadirAtaque(new Ataque(" Funeral de la cascada de arena", 20, 10, 0));
        jugador.añadirAtaque(new Ataque(" Balas de arena", 25, 12, 0));

        // Crear enemigo 1
        Enemigo enemigo = new Enemigo(" Zabuza Momochi", "Humano", 80);
        enemigo.añadirAtaque(new Ataque("Manto de niebla", 25, 10, 0));
        enemigo.añadirAtaque(new Ataque("Gran espada de Zabuza", 30, 15, 0));
        enemigo.añadirAtaque(new Ataque("Técnicas de agua", 20, 10, 0));
        
     // Crear enemigo 2
        Enemigo enemigo2 = new Enemigo("Orochimaru", "Humano", 100);
        enemigo.añadirAtaque(new Ataque("Serpientes letales", 25, 10, 0));
        enemigo.añadirAtaque(new Ataque("Conjuro oscuro", 30, 15, 0));
        enemigo.añadirAtaque(new Ataque("Veneno", 20, 10, 0));
        
     // Crear enemigo 3
        Enemigo enemigo3 = new Enemigo("Itachi Uchiha", "Humano", 140);
        enemigo.añadirAtaque(new Ataque("Amaterasu", 25, 10, 0));
        enemigo.añadirAtaque(new Ataque("Susano", 30, 15, 0));
        enemigo.añadirAtaque(new Ataque("Espada de Totsuka", 20, 10, 0));
        
     // Crear enemigo 4
        Enemigo enemigo4 = new Enemigo("Obito Uchiha", "Humano", 150);
        enemigo.añadirAtaque(new Ataque("Kamui", 25, 10, 0));
        enemigo.añadirAtaque(new Ataque("Rinnegan ", 30, 15, 0));
        enemigo.añadirAtaque(new Ataque("Control del Jūbi", 20, 10, 0));
        
     // Crear enemigo 5
        Enemigo enemigo5 = new Enemigo("Madara Uchiha", "Humano", 180);
        enemigo.añadirAtaque(new Ataque("Limbo", 25, 10, 0));
        enemigo.añadirAtaque(new Ataque("Susanoo", 30, 15, 0));
        enemigo.añadirAtaque(new Ataque("Amenominaka", 20, 10, 0));
        
     // Crear enemigo 6
        Enemigo enemigo6 = new Enemigo("Kaguya Ōtsutsuki", "Extraterrestre", 220);
        enemigo.añadirAtaque(new Ataque("Rinne-Sharingan", 25, 10, 0));
        enemigo.añadirAtaque(new Ataque("Dimensiones Espaciales", 30, 15, 0));
        enemigo.añadirAtaque(new Ataque("Técnicas de la Luna", 20, 10, 0));

        // Escenario 1
        Escenario escenario = new Escenario("Cueva de la Niebla Oscura", "lluvia", "noche", "rocoso");
        
     // Escenario 2
        Escenario escenario2 = new Escenario("Laboratorio Perdido", "lluvia", "noche", "rocoso");
        
     // Escenario 3
        Escenario escenario3 = new Escenario("Templo del Tiempo", "lluvia", "noche", "rocoso");
        
     // Escenario 4
        Escenario escenario4 = new Escenario("Fortaleza de las Sombras", "lluvia", "noche", "rocoso");
        
     // Escenario 5
        Escenario escenario5 = new Escenario("Santuario de la Arena Desolada", "lluvia", "noche", "rocoso");
        
     // Escenario 6
        Escenario escenario6 = new Escenario("Palacio Celestial", "lluvia", "noche", "rocoso");

        // Iniciar combate
        Batalla batalla = new Batalla(jugador, enemigo, escenario);
        batalla.iniciar();

        
        
        
        
        // Enigma 1
        if (jugador.getVida() > 0) {
            Enigma enigma = new Enigma(
                "Oro parece, plata no es. Abran las cortinas y verás lo que és. ¿Qué es?",
                "plátano",
                25
            );
            System.out.println("\nHas encontrado un enigma:");
            System.out.println(enigma.getPregunta());
            System.out.print("Tu respuesta: ");
            String respuesta = sc.nextLine();
            if (enigma.comprobarRespuesta(respuesta)) {
                jugador.incrementarPuntos(enigma.getPuntos());
                System.out.println("✅ Correcto. Ganas " + enigma.getPuntos() + " puntos.");
            } else {
                System.out.println("❌ Incorrecto. No ganas puntos.");
            }
        }
        
     // Enigma 2
        if (jugador.getVida() > 0) {
            Enigma enigma = new Enigma(
                "Canto en la orilla, vivo en el agua. No soy pez ni soy cigarra. ¿Qué soy?",
                "rana",
                25
            );
            System.out.println("\nHas encontrado un enigma:");
            System.out.println(enigma.getPregunta());
            System.out.print("Tu respuesta: ");
            String respuesta = sc.nextLine();
            if (enigma.comprobarRespuesta(respuesta)) {
                jugador.incrementarPuntos(enigma.getPuntos());
                System.out.println("✅ Correcto. Ganas " + enigma.getPuntos() + " puntos.");
            } else {
                System.out.println("❌ Incorrecto. No ganas puntos.");
            }
        }
        
     // Enigma 3
        if (jugador.getVida() > 0) {
            Enigma enigma = new Enigma(
                "Me gusta chapotear, vivo en un estanque y soy buen nadador. ¿Qué soy?",
                "pato",
                25
            );
            System.out.println("\nHas encontrado un enigma:");
            System.out.println(enigma.getPregunta());
            System.out.print("Tu respuesta: ");
            String respuesta = sc.nextLine();
            if (enigma.comprobarRespuesta(respuesta)) {
                jugador.incrementarPuntos(enigma.getPuntos());
                System.out.println("✅ Correcto. Ganas " + enigma.getPuntos() + " puntos.");
            } else {
                System.out.println("❌ Incorrecto. No ganas puntos.");
            }
        }
        
     // Enigma 4
        if (jugador.getVida() > 0) {
            Enigma enigma = new Enigma(
                "Este banco está ocupado por un padre y por un hijo, el padre se llama Juan y el hijo ya te lo he dicho. ¿Como se llama?",
                "esteban",
                25
            );
            System.out.println("\nHas encontrado un enigma:");
            System.out.println(enigma.getPregunta());
            System.out.print("Tu respuesta: ");
            String respuesta = sc.nextLine();
            if (enigma.comprobarRespuesta(respuesta)) {
                jugador.incrementarPuntos(enigma.getPuntos());
                System.out.println("✅ Correcto. Ganas " + enigma.getPuntos() + " puntos.");
            } else {
                System.out.println("❌ Incorrecto. No ganas puntos.");
            }
        }
        
     // Enigma 5
        if (jugador.getVida() > 0) {
            Enigma enigma = new Enigma(
                "Y lo es, y lo es, y no me lo adivinas ni en un mes. ¿Qué es?",
                "hilo",
                25
            );
            System.out.println("\nHas encontrado un enigma:");
            System.out.println(enigma.getPregunta());
            System.out.print("Tu respuesta: ");
            String respuesta = sc.nextLine();
            if (enigma.comprobarRespuesta(respuesta)) {
                jugador.incrementarPuntos(enigma.getPuntos());
                System.out.println("✅ Correcto. Ganas " + enigma.getPuntos() + " puntos.");
            } else {
                System.out.println("❌ Incorrecto. No ganas puntos.");
            }
        }
        
     

        // Mostrar puntuación
        System.out.println("\n🏁 Puntuación final de " + jugador.getNombre() + ": " + jugador.getPuntuacion() + " puntos.");

        // Guardar puntuación
        db.guardarPuntuacion(usuarioId, jugador.getPuntuacion());

        // Mostrar ranking
        System.out.println("\n¿Deseas ver el ranking? (s/n): ");
        String verRanking = sc.nextLine();
        if (verRanking.equalsIgnoreCase("s")) {
            db.mostrarMejorJugador();
            db.mostrarTop();
        }

        System.out.println("\nGracias por jugar. ¡Hasta la próxima!");
    }
} 
