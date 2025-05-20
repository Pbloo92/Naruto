package main;

import java.util.Scanner;
import java.util.Random;

public class Naruto {

	public static void main(String[] args) {

		int opciones = 0;
		int artefacto = 0;
		
		int vidaP = 0;
		int chakraP = 0;
		int vidaE = 0;
		int ataqueE = 0;

		String[] enigmas = { "Canto en la orilla, vivo en el agua. No soy pez ni soy cigarra. ¿Qué soy?",
				"Me gusta chapotear, vivo en un estanque y soy buen nadador. ¿Qué soy?",
				"Este banco está ocupado por un padre y por un hijo, el padre se llama Juan y el hijo ya te lo he dicho. ¿Como se llama?",
				"Oro parece, plata no és. Abran las cortinas y verás lo que és. ¿Qué soy?",
				"Y lo es, y lo es, y no me lo adivinas ni en un mes. ¿Qué es?" };

		int lugar = 0;

		int opcionesCombate = 0;

		String[] ataquesP = new String[4];
		String[] ataquesE = new String[4];

		int[] dañoP = new int[4];
		int[] dañoE = new int[4];
		int[] chakraPA = new int[4];

		boolean exploracion = true;
		boolean combate = true;
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("* * * * * * * * * * * * * * * * * * * * * * ");
		System.out.println("*              NARUTO GAME                * ");
		System.out.println("*                                         * ");
		System.out.println("*     Desarrolladores:                    * ");
		System.out.println("*           Pablo, Roberto y Elena        * ");
		System.out.println("*                                         * ");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * ");

		String clave = "jugones";
		String personaje = "";

		// CONTRASEÑA
		System.out.println("Introduce la contraseña para empezar:");
		clave = scanner.nextLine();

		while (!clave.equals("jugones")) {
			System.out.println("Contraseña incorrecta, prueba otra vez:");
			clave = scanner.nextLine();
		}

		if (clave.equalsIgnoreCase("jugones")) {
			System.out.println("Contraseña correcta");
			System.out.println("              COMIENZA EL JUEGO              ");

			// ELECCION PERSONAJE
			System.out.println("Elige tu personaje principal:");
			System.out.println("Naruto, Sasuke o Gaara");
			personaje = scanner.nextLine();
		}

		while (!personaje.equals("Naruto") && !personaje.equals("Sasuke") && !personaje.equals("Gaara")) {
			System.out.println("Opcion incorrecta!");
			System.out.println("Elige uno de los indicados:");
			System.out.println("Naruto, Sasuke o Gaara");
			personaje = scanner.nextLine();
		}

		// ATRIBUTOS NARUTO
		if (personaje.equals("Naruto")) {
			vidaP = 160;
			chakraP = 2300;
			ataquesP[1] = "Rasengan";
			ataquesP[2] = "Rasenshuriken";
			ataquesP[3] = "Clones de Sombra";
			dañoP[1] = 50;
			dañoP[2] = 120;
			dañoP[3] = 30;
			chakraPA[1] = 275;
			chakraPA[2] = 550;
			chakraPA[3] = 100;

		}

		// ATRIBUTOS SASUKE
		if (personaje.equals("Sasuke")) {
			vidaP = 150;
			chakraP = 1900;
			ataquesP[1] = "Chidori";
			ataquesP[2] = "Susano";
			ataquesP[3] = "Amateratsu";
			dañoP[1] = 60;
			dañoP[2] = 130;
			dañoP[3] = 100;
			chakraPA[1] = 300;
			chakraPA[2] = 750;
			chakraPA[3] = 400;

		}

		// ATRIBUTOS GAARA
		if (personaje.equals("Gaara")) {
			vidaP = 120;
			chakraP = 1400;
			ataquesP[1] = "Ataúd de atadura de arena";
			ataquesP[2] = "Funeral de la cascada de arena";
			ataquesP[3] = "Balas de arena";
			dañoP[1] = 40;
			dañoP[2] = 90;
			dañoP[3] = 60;
			chakraPA[1] = 300;
			chakraPA[2] = 500;
			chakraPA[3] = 100;
		}

		System.out.println("Has elegido a " + personaje);
		System.out.println("Vida: " + vidaP);
		System.out.println("Chakra: " + chakraP);
		System.out.println("Aqui comienza tu aventura como: " + personaje);
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
		while (exploracion) {
			System.out.println("Elige una ubicacion a la que ir:");
			System.out.println("");
			System.out.println("1.Cueva de la Niebla Oscura ");
			System.out.println("2.Laboratorio Perdido ");
			System.out.println("3.Templo del Tiempo ");
			System.out.println("4.Fortaleza de las Sombras");
			System.out.println("5.Santuario de la Arena Desolada ");
			System.out.println("6.Palacio Celestial ");
			lugar = scanner.nextInt();

			switch (lugar) {

			// CUEVA DE LA NIEBLA OSCURA
			case 1:

				ataquesE[1] = "Manto de niebla";
				ataquesE[2] = "Gran espada de Zabuza";
				ataquesE[3] = "Técnicas de agua";
				dañoE[1] = 50;
				dañoE[2] = 80;
				dañoE[3] = 70;
				vidaE = 80;

				System.out.println("Has entrado a la Cueva de la Niebla Oscura. \n"
						+ "Esta controlada por Zabuza. Es un laberinto de niebla donde \n"
						+ "la visibilidad es casi nula. Las ilusiones y ataques sorpresa son constantes.\n"
						+ "Deberas encontrar una fuente de luz que disipe la niebla sin destruir el templo.");
				System.out.println("");
				System.out.println("Al entrar te has encontrado con Kakashi. \n");

				// NARUTO - CUEVA DE LA NIEBLA OSCURA
				if (personaje.equals("Naruto")) {
					System.out.println("Kakashi: Naruto, las trampas aquí son como las de Obito, impredecibles \n "
							+ "       y diseñadas para explotar tus debilidades. Necesitamos coordinación.\n" + " \n"
							+ "Naruto: ¡Estoy listo, Kakashi-sensei! Solo dime cómo quieres hacerlo. \n" + " \n"
							+ "Opciones: \n" + " \n"
							+ "1.Usar clones de sombra para dispersar las trampas mientras Kakashi identifica el camino correcto \n"
							+ "  (arriesgando que los clones activen trampas adicionales si no son precisos). \n"
							+ "2.Dejar que Kakashi use su experiencia para guiar mientras tú resuelves el enigma \n"
							+ "  para proteger al equipo (arriesgando consumir demasiado chakra). \n"
							+ "3.Atacar juntos, confiando en la sincronización entre tus habilidades y las de Kakashi \n"
							+ "  (arriesgando que una mala coordinación dé ventaja a Zabuza). \n " + " \n");

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {

						// NARUTO - CUEVA DE LA NIEBLA OSCURA - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println(
										"Has utilizado los Clones de Sombra pero han activado las trampas y Zabuza os ha descubierto \n");
								System.out.println("Empieza el combate \n" + "Tu oponente es Zabuza");
								System.out.println("Vida: " + vidaE);
								
								
								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Zabuza recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Zabuza bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Zabuza esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Zabuza: " + dañoFinal);
											System.out.println("Vida restante de Zabuza: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Zabuza ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;

											System.out.println("Zabuza ataca con " + ataquesE[ataqueE] + "!");

											// Agregar lógica de defensa del jugador aquí
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												System.out.println(
														"Lamentablemente, caíste en la última batalla y no lograste recolectar \n"
																+ "ningún artefacto. La amenaza prevalece. \n"
																+ "FIN DEL JUEGO");

												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out.println("¡Has derrotado a Zabuza y la niebla empieza a disiparse!");
									System.out.println("Has conseguido un Artefacto (Luz de Zabuza)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									combate = false;

								}
								continue;

							}
							break;

						// NARUTO - CUEVA DE LA NIEBLA OSCURA - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println("" + "Eliges dejar que Kakashi use su experiencia mientras tú "
										+ " resuelves el enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Kakashi consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra.");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Luz de Zabuza sin pelear!!");
								++artefacto;

								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Zabuza os echa de la cueva y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// NARUTO - CUEVA DE LA NIEBLA OSCURA - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println("Eliges atacar juntos, confiando en la sincronización con Kakashi");
								System.out.println(
										"Gracias a la sincronización con kakashi consigues capturar a Zabuza con vida sin recibir daño ");
								System.out.println("Has conseguido un Artefacto (Luz de Zabuza)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}
				}

				// SASUKE - CUEVA DE LA NIEBLA OSCURA
				if (personaje.equals("Sasuke")) {
					System.out.println("Kakashi: Sasuke, las sombras de Obito están diseñadas para\n"
							+ "         manipular tus emociones. Si no nos coordinamos, estaremos perdidos.\n" + " \n"
							+ "Sasuke: Entonces dime, Kakashi, ¿cuál es tu plan?\n" + " \n" + "Opciones:\n" + " \n"
							+ "1.Utilizar tu Rinnegan para detectar las ilusiones y abrir paso\n"
							+ "  tú solo (arriesgándote a que las sombras te embosquen mientras exploras).\n"
							+ "2.Coordinarte conmigo para alternar ataques y defensas,\n"
							+ "  y resolver el enigma (arriesgando que la complejidad del plan\n"
							+ "  dé tiempo a Zabuza para contraatacar).\n"
							+ "3.Esperar un error en las trampas de Obito y aprovecharlo\n"
							+ "  para avanzar (arriesgando prolongar el enfrentamiento).\n");

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();
						switch (opciones) {

						// SASUKE - CUEVA DE LA NIEBLA OSCURA - CASO 1
						case 1:
							if (opciones == 1) {
								if (chakraP > 100)
									System.out.println(
											"Utilizar tu Rinnegan para detectar las ilusiones y abrir paso tú solo \n"
													+ "consigues llegar hasta zabuza pero las sombras te emboscan \n");
								System.out.println("Empieza el combate \n" + "\n" + "Tu oponente es Zabuza");
								vidaE = 80;

								System.out.println("Vida: " + vidaE);

								do {
									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {
										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Zabuza recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Zabuza bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Zabuza esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}
											// Mostrar resultado
											System.out.println("Daño causado a Zabuza: " + dañoFinal);
											System.out.println("Vida restante de Zabuza: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Zabuza ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;

											System.out.println("Zabuza ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												System.out.println(
														"Lamentablemente, caíste en la última batalla y no lograste recolectar \n"
																+ "ningún artefacto. La amenaza prevalece. \n"
																+ "FIN DEL JUEGO");

												combate = false;
												exploracion = false;
											}
										}
									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3.");
									}
								} while (vidaP > 0 && vidaE > 0);

								// Volvemos al menú de exploración si el jugador ganó
								if (vidaP > 0 && vidaE == 0) {

									combate = false;

									System.out.println("¡Has derrotado a Zabuza y la niebla empieza a disiparse!");
									System.out.println("Has conseguido un Artefacto (Luz de Zabuza)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
								}
								continue;
							}

							break;

						// SASUKE - CUEVA DE LA NIEBLA OSCURA - CASO 2
						case 2:

							if (chakraP > 100)
								System.out.println("Te coordinas con Kakashi para alternar ataques y defensas,\n"
										+ "y resolver el enigma");
							chakraP = 1500;
							System.out.println(
									"Gracias a Kakashi consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra.");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Luz de Zabuza sin pelear!!");
								++artefacto;

								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Zabuza os echa de la cueva y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// SASUKE - CUEVA DE LA NIEBLA OSCURA - CASO 3
						case 3:
							if (opciones == 3) {
								if (chakraP > 100) {

									vidaE = 0;

									System.out.println(
											"Eliges atacar juntos, confiando en la sincronización con Kakashi");
									System.out.println(
											"Gracias a la sincronización con kakashi consigues capturar a Zabuza con vida sin recibir daño \n");
									System.out.println("Has conseguido un Artefacto (Luz de Zabuza)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");

									if (vidaE == 0) {
										combate = false;
									}
								}
							}
							break;
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}
				}

				// GAARA - CUEVA DE LA NIEBLA OSCURA
				if (personaje.equals("Gaara")) {
					System.out.println("Kakashi: Gaara, las sombras aquí no son normales. Obito las usa \n "
							+ "        para confundir y dividirnos. Necesitamos avanzar con cuidado. " + "  \n"
							+ "Gaara: Mi arena puede detectar y neutralizar las trampas,  \n"
							+ "       pero no puedo hacerlo todo solo.  \n" + " \n" + "Opciones: \n" + " \n"
							+ "1.Usar tu arena para explorar y bloquear las sombras mientras \n "
							+ "  Kakashi analiza las trampas (arriesgando consumir demasiado chakra \n"
							+ "  si las trampas son numerosas). \n"
							+ "2.Permitir que Kakashi use su experiencia para guiar mientras tú \n "
							+ "  resuelves el enigma (arriesgando que Kakashi \n"
							+ "  sea atacado si las trampas son más rápidas que él). \n"
							+ "3.Trabajar juntos: Kakashi neutraliza las sombras con su \n"
							+ "  inteligencia mientras tú bloqueas las trampas con tu arena \n "
							+ "  (arriesgando que la coordinación tome más tiempo del que tienen).");

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();
						switch (opciones) {

						// GAARA - CUEVA DE LA NIEBLA OSCURA - CASO 1
						case 1:
							if (opciones == 1) {
								if (chakraP > 100)
									System.out.println("Usas tu arena para explorar y bloquear las sombras mientras \n"
											+ "Kakashi analiza las trampas pero Zabuza os ha descubierto \n");
								System.out.println("Empieza el combate \n" + "\n" + "Tu oponente es Zabuza");
								vidaE = 80;

								System.out.println("Vida: " + vidaE);

								do {
									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {
										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Zabuza recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Zabuza bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Zabuza esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Zabuza: " + dañoFinal);
											System.out.println("Vida restante de Zabuza: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Zabuza ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;

											System.out.println("Zabuza ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												System.out.println(
														"Lamentablemente, caíste en la última batalla y no lograste recolectar \n"
																+ "ningún artefacto. La amenaza prevalece. \n"
																+ "FIN DEL JUEGO");
												combate = false;
												exploracion = false;
											}
										}
									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3.");
									}
								} while (vidaP > 0 && vidaE > 0);

								// Volvemos al menú de exploración si el jugador ganó
								if (vidaP > 0 && vidaE == 0) {

									combate = false;

									System.out.println("Has conseguido un Artefacto (Luz de Zabuza)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
								}
								continue;
							}

							break;

						// GAARA - CUEVA DE LA NIEBLA OSCURA - CASO 2
						case 2:

							if (chakraP > 100)
								System.out.println(
										"Permitir que Kakashi use su experiencia para guiar mientras tú resuelves el enigma");

							System.out.println(
									"Gracias a Kakashi consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra.");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Luz de Zabuza sin pelear!!");
								++artefacto;

								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Zabuza os echa de la cueva y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// GAARA - CUEVA DE LA NIEBLA OSCURA - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println("Eliges atacar juntos, confiando en la sincronización con Kakashi");
								System.out.println(
										"Gracias a la sincronización con kakashi consigues capturar a Zabuza con vida sin recibir daño \n");
								System.out.println("Has conseguido un Artefacto (Luz de Zabuza)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}

							break;
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}
				}

			default:

				break;

			// LABORATORIO PERDIDO
			case 2:
				ataquesE[1] = "Kusanagi ";
				ataquesE[2] = "Manto de serpiente";
				ataquesE[3] = "Invocación de serpientes";
				dañoE[1] = 70;
				dañoE[2] = 95;
				dañoE[3] = 50;
				vidaE = 100;

				System.out.println("Has entrado al Laboratorio Perdido. Está controlado\n"
						+ "por Orochimaru. Es un espacio retorcido lleno de criaturas \n"
						+ "experimentales y trampas químicas. Deberás neutralizar los venenos de \n"
						+ "Orochimaru mientras enfrentan sus experimentos más letales.");
				System.out.println("");
				System.out.println("Al entrar te has encontrado con Tsunade. \n");

				// NARUTO - LABORATORIO PERDIDO
				if (personaje.equalsIgnoreCase("Naruto")) {
					System.out.println("Naruto: Tsunade, este lugar está lleno de bichos y venenos. ¡Es como\n"
							+ "      si Orochimaru hubiera mezclado ciencia y locura! \n" + " \n"
							+ "Tsunade: Exacto, Naruto. Estos venenos no son normales, y necesitamos contrarrestarlos\n"
							+ "         antes de que afecten al equipo. Decide rápido cómo quieres proceder. \n" + " \n"
							+ "Opciones: \n" + " \n"
							+ "1.Usar clones de sombra para explorar y neutralizar las trampas químicas \n"
							+ "  (arriesgando activar más venenos si los clones fallan). \n"
							+ "2.Dejar que Tsunade neutralice los venenos mientras tú resuelves el enigma (arriesgando consumir demasiado \n"
							+ " chakra en un ambiente hostil). \n"
							+ "3.Destruir toda la sección del laboratorio con un Rasenshuriken, eliminando tanto \n"
							+ "  venenos como trampas (arriesgando que las explosiones destruyan información valiosa o \n"
							+ "  empeoren la situación). \n");

					vidaP = 190;
					chakraP = 2600;
					dañoP[1] = 70;
					dañoP[2] = 150;
					dañoP[3] = 50;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {
						// NARUTO - LABORATORIO PERDIDO - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println(
										"Utilizas los Clones de Sombra pero han activado las trampas químicas y Orochimaru os ha descubierto \n");
								System.out.println("Empieza el combate \n" + "Tu oponente es Orochimaru");
								System.out.println("Vida: " + vidaE);

								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Orochimaru recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Orochimaru bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Orochimaru esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Orochimaru: " + dañoFinal);
											System.out.println("Vida restante de Orochimaru: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Orochimaru ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;
											System.out.println("Orochimaru ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out.println(
											"¡Has derrotado a Orochimaru, los bichos y los venenos ya no están!");
									System.out
											.println("Has conseguido un Artefacto (Amuleto de Escamas de Orochimaru)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									combate = false;

								}
								continue;

							}
							break;

						// NARUTO - LABORATORIO PERDIDO - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println(
										"Dejas que Tsunade neutralice los venenos mientras tú resuelves el enigma");

							System.out.println(
									"Gracias a Tsuande consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra.");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Amuleto de Escamas de Orochimaru sin pelear!!");
								++artefacto;

								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Orochimaru os echa del laboratorio y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// NARUTO - LABORATORIO PERDIDO - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println(
										"Destruyes toda la sección del laboratorio con un Rasenshuriken, eliminando tanto\n"
												+ "venenos como trampas pero las explosiones han destruido información valiosa aunque\n"
												+ "el Artefacto está intacto");
								System.out.println("Has conseguido un Artefacto (Amuleto de Escamas de Orochimaru)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}
				}

				// SASUKE - LABORATORIO PERDIDO
				if (personaje.equalsIgnoreCase("Sasuke")) {
					System.out.println("Tsunade: Sasuke, este laboratorio está diseñado para hacerte dudar.\n"
							+ "         Orochimaru sabe cómo manipular la mente y el cuerpo. Necesitamos \n "
							+ "         mantenernos enfocados.\n" + " \n"
							+ "Sasuke: No subestimes mi fuerza, pero acepto tus consejos. ¿Cuál es el plan?\n" + " \n"
							+ "Opciones:\n" + " \n"
							+ "1.Usar el Rinnegan para localizar las trampas químicas y neutralizarlas antes de que\n"
							+ "  se activen (arriesgando agotar tus recursos si las trampas son demasiadas).\n"
							+ "2.Confiar en Tsunade para desactivar las toxinas mientras resuelves\n"
							+ "  el Enigma(arriesgando exponerte a ataques directos mientras\n"
							+ "  te concentras en resolverlo).\n"
							+ "3.Combinar tus habilidades: Tsunade neutraliza las toxinas mientras tú localizas a\n"
							+ "  Orochimaru rápidamente (arriesgando dejar a otros aliados vulnerables\n"
							+ "  mientras ambos avanzan).\n");

					vidaP = 170;
					chakraP = 2200;
					dañoP[1] = 70;
					dañoP[2] = 130;
					dañoP[3] = 100;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();
						switch (opciones) {

						// SASUKE - LABORATORIO PERDIDO - CASO 1
						case 1:
							if (opciones == 1) {
								if (chakraP > 100)
									System.out.println(
											"Has utilizado tu Rinnegan para detectar las trampas químicas y neutralizarlas, \n"
													+ "consiguiendo llegar hasta Orochimaru\n");
								System.out.println("Empieza el combate \n" + "\n" + "Tu oponente es Orochimaru");

								System.out.println("Vida: " + vidaE);

								do {
									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {
										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Orochimaru recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Orochimaru bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Orochimaru esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Orochimaru: " + dañoFinal);
											System.out.println("Vida restante de Orochimaru: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Orochimaru ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;

											System.out.println("Orochimaru ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}
									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3.");
									}
								} while (vidaP > 0 && vidaE > 0);

								// Volvemos al menú de exploración si el jugador ganó
								if (vidaP > 0 && vidaE == 0) {

									combate = false;

									System.out
											.println("Has conseguido un Artefacto (Amuleto de Escamas de Orochimaru)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
								}
								continue;
							}

							break;

						// SASUKE - LABORATORIO PERDIDO - CASO 2
						case 2:

							if (chakraP > 100)
								System.out.println(
										"Confias en Tsunade para desactivar las toxinas mientras resuelves el Enigma");

							System.out.println(
									"Gracias a Tsuande consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra.");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Amuleto de Escamas de Orochimaru sin pelear!!");
								++artefacto;

								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Orochimaru os echa del laboratorio y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// SASUKE - LABORATORIO PERDIDO - CASO 3
						case 3:
							if (opciones == 3) {
								if (chakraP > 100) {

									vidaE = 0;
									System.out.println(
											"Eliges atacar juntos, confiando en que Tsunade neutralice las toxinas ");
									System.out.println(
											"Consigues localizar y capturar a Orochiaru con vida sin recibir daño \n");
									System.out
											.println("Has conseguido un Artefacto (Amuleto de Escamas de Orochimaru)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");

									if (vidaE == 0) {
										combate = false;
									}
								}
							}
							break;
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}
				}

				// GAARA - LABORATORIO PERDIDO
				if (personaje.equalsIgnoreCase("Gaara")) {
					System.out.println("Shikamaru: Gaara, estas trampas están diseñadas para confundirnos. \n"
							+ "         Si no sincronizamos nuestras habilidades, podríamos quedarnos \n"
							+ "         atrapados aquí para siempre.\n" + "  \n"
							+ "Gaara: Mi control sobre la arena puede abrir el camino, pero \n "
							+ "       necesitaré tus estrategias para hacerlo de manera eficiente. \n" + " \n"
							+ "Opciones: \n " + " \n"
							+ "1.Usar tu arena para mover las esferas mientras Shikamaru analiza \n"
							+ "  las trampas y las neutraliza (arriesgando consumir tu chakra si \n"
							+ "  las trampas son demasiadas para cubrir todo).\n"
							+ "2.Dejar que Shikamaru se encargue de las trampas mientras tú te \n"
							+ "  concentras en el enigma (arriesgando que las trampas sean más rápidas que su análisis ). \n"
							+ "3.Trabajar en conjunto: Shikamaru identifica los patrones mientras \n"
							+ "  tú ajustas la arena para activar los mecanismos correctos (arriesgando \n"
							+ "  que el trabajo en equipo sea más lento que actuar por separado).");

					vidaP = 130;
					chakraP = 1700;
					dañoP[1] = 50;
					dañoP[2] = 100;
					dañoP[3] = 70;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();
						switch (opciones) {

						// GAARA - LABORATORIO PERDIDO - CASO 1
						case 1:
							if (opciones == 1) {
								if (chakraP > 100)
									System.out.println(
											"Utilizas tu arena para mover las esferas mientras Shikamaru analiza\n"
													+ "  las trampas y las neutraliza pero Orochimaru os ha descubierto \n");
								System.out.println("Empieza el combate \n" + "\n" + "Tu oponente es Orochimaru");
								vidaE = 80;

								System.out.println("Vida: " + vidaE);

								do {
									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {
										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Orochimaru recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Orochimaru bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Orochimaru esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Orochimaru: " + dañoFinal);
											System.out.println("Vida restante de Orochimaru: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Orochimaru ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;

											System.out.println("Orochimaru ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}
									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3.");
									}
								} while (vidaP > 0 && vidaE > 0);

								// Volvemos al menú de exploración si el jugador ganó
								if (vidaP > 0 && vidaE == 0) {

									combate = false;

									System.out
											.println("Has conseguido un Artefacto (Amuleto de Escamas de Orochimaru)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
								}
								continue;
							}

							break;

						// GAARA - LABORATORIO PERDIDO - CASO 2
						case 2:

							if (chakraP > 100)
								System.out.println(
										"Dejar que Shikamaru se encargue de las trampas mientras tú te concentras en el enigma");

							System.out.println(
									"Gracias a Tsuande consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra.");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Amuleto de Escamas de Orochimaru sin pelear!!");
								++artefacto;

								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Orochimaru os echa del laboratorio y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							// GAARA - LABORATORIO PERDIDO - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println("Eliges atacar juntos, para que Tsunade identifique los patrones\n");
								System.out.println(
										"Gracias a la sincronización con Tsunade consigues capturar a Orochimaru con vida sin recibir daño \n");
								System.out.println("Has conseguido un Artefacto (Amuleto de Escamas de Orochimaru)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}

							break;
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}
				}

				break;

			// TEMPLO DEL TIEMPO
			case 3:
				ataquesE[1] = "Amaterasu";
				ataquesE[2] = "Susano";
				ataquesE[3] = "Espada de Totsuka";
				dañoE[1] = 100;
				dañoE[2] = 120;
				dañoE[3] = 70;
				vidaE = 140;

				System.out.println("Has entrado al Templo del Tiempo. Está controlado \n"
						+ "por Itachi Uchiha. Las paredes del templo emiten ecos de\n"
						+ "eventos pasados y futuros. Aquí, el tiempo se distorsiona, y  \n"
						+ "las ilusiones de Itachi hacen que los héroes enfrenten  \n"
						+ "versiones jóvenes y futuras de sí mismos. Deberás resolver los \n"
						+ "acertijos de relojes antiguos para estabilizar el flujo del tiempo. \n"
						+ "Cada movimiento incorrecto acelera la desintegración del templo. \n");
				System.out.println("");
				System.out.println("Al entrar te has encontrado con Jiraiya.");

				// NARUTO - TEMPLO DEL TIEMPO
				if (personaje.equalsIgnoreCase("Naruto")) {
					System.out.println("Naruto: Jiraiya, este lugar me da escalofríos. Es como si \n "
							+ "      el tiempo estuviera jugando con nosotros. \n" + " \n"
							+ "Jiraiya: Naruto, este templo no es como los demás. Los acertijos están entrelazados \n"
							+ "         con ilusiones temporales, y cada error podría ser fatal.\n"
							+ "         Escoge tu camino con cuidado. \n" + " \n" + "Opciones: \n" + " \n"
							+ "1.Usar el modo Sabio para detectar las alteraciones temporales y guiar al equipo \n "
							+ "  (arriesgando consumir mucho chakra si las ilusiones son demasiado fuertes). \n"
							+ "2.Dejar que Jiraiya interfiera con los mecanismos temporales mientras tú te concentras \n"
							+ "  en proteger al equipo (arriesgando que Jiraiya quede atrapado si falla). \n"
							+ "3.Enfrentar directamente las ilusiones, confiando en tu vínculo con Kurama para resistir \n"
							+ "  el daño mental (arriesgando que las ilusiones alteren tus emociones y te desestabilicen). \n");

					vidaP = 210;
					chakraP = 2750;
					dañoP[1] = 80;
					dañoP[2] = 160;
					dañoP[3] = 60;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {

						// NARUTO - TEMPLO DEL TIEMPO - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println("Utilizas el modo Sabio pero accidentalmente caes en un Genjutsu\n"
										+ " y te toca enfrentarte contra Itachi");
								System.out.println("Empieza el combate \n" + "Tu oponente es Itachi");
								System.out.println("Vida: " + vidaE);

								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Itachi recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Itachi bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Itachi esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Itachi: " + dañoFinal);
											System.out.println("Vida restante de Itachi: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Itachi ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;
											System.out.println("Itachi ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out.println("¡Has derrotado a Itachi y la ilusiones han desaparecido!");
									System.out.println("Has conseguido un Artefacto (Anillo del Tiempo)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");

								}
								continue;

							}
							break;

						// NARUTO - TEMPLO DEL TIEMPO - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println("" + "Eliges dejar que Tsunade use su experiencia  mientras tú "
										+ " resuelves el enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Tsunade consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra. \n"
											+ "Tu chakra es: " + chakraP + "  \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Anillo del Tiempo sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Itachi os echa del Templo y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// NARUTO - TEMPLO DEL TIEMPO - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println(
										"Te enfrentas a las Ilusiones gracias a tu vínculo con Kurama. Y gracias a la ayuda de Tsunade "
												+ "conseguis capturar a Itachi y conseguir el Artefacto intacto");
								System.out.println("Has conseguido un Artefacto (Anillo del Tiempo)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}
				}

				// SASUKE - TEMPLO DEL TIEMPO
				if (personaje.equalsIgnoreCase("Sasuke")) {
					System.out.println("Jiraiya: Sasuke, Itachi está probando tus límites. Su ilusión\n"
							+ "          del tiempo está diseñada para desestabilizarte. \n "
							+ "          Necesitamos actuar rápido.\n" + " \n"
							+ "Sasuke: No necesito ayuda para enfrentar a Itachi.\n"
							+ "        Esto es personal. Pero si tienes algo que aportar, dilo.\n" + " \n"
							+ "Jiraiya: Claro, muchacho.\n" + " \n" + "Opciones:\n" + " \n"
							+ "1.Confrontar a Itachi directamente y depender de tu Rinnegan para\n"
							+ "  deshacer sus ilusiones (arriesgándote a quedar atrapado en un bucle\n"
							+ "  temporal si fallas).\n"
							+ "2.Permitir que yo lo distraiga mientras tú resuelves los acertijos del\n"
							+ "  templo (arriesgando que Itachi te juzgue por depender de otro).\n"
							+ "3.Trabajar juntos para enfrentarlo combinando tus habilidades con\n"
							+ "  las mías (arriesgando que Itachi explote vuestra coordinación imperfecta).\n");

					vidaP = 180;
					chakraP = 2350;
					dañoP[1] = 80;
					dañoP[2] = 140;
					dañoP[3] = 100;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();
						switch (opciones) {

						// SASUKE - TEMPLO DEL TIEMPO - CASO 1
						case 1:
							if (opciones == 1) {
								if (chakraP > 100)
									System.out.println(
											"Utilizas tu Rinnegan para desacerte e sus ilusiones pero te enfrentas"
													+ "derectamente a él\n");
								System.out.println("Empieza el combate \n" + "\n" + "Tu oponente es Itachi");
								vidaE = 80;

								System.out.println("Vida: " + vidaE);

								do {
									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {
										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Itachi recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Itachi bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Itachi esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Itachi: " + dañoFinal);
											System.out.println("Vida restante de Itachi: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Itachi ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;

											System.out.println("Itachi ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}
									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3.");
									}
								} while (vidaP > 0 && vidaE > 0);

								// Volvemos al menú de exploración si el jugador ganó
								if (vidaP > 0 && vidaE == 0) {

									combate = false;

									System.out.println("¡Has derrotado a Itachi y su ilusión del tiempo ya no está!");
									System.out.println("Has conseguido un Artefacto (Anillo del Tiempo)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
								}
								continue;
							}

							break;

						// SASUKE - TEMPLO DEL TIEMPO - CASO 2
						case 2:

							if (chakraP > 100)
								System.out.println("" + "Eliges dejar que Tsunade use su experiencia  mientras tú "
										+ " resuelves el Enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Tsunade consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra. \n"
											+ "Tu chakra es: " + chakraP + "  \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Luz de Zabuza sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Itachi os echa del Templo y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// SASUKE - TEMPLO DEL TIEMPO - CASO 3
						case 3:
							if (opciones == 3) {
								if (chakraP > 100) {

									vidaE = 0;

									System.out.println(
											"Eliges atacar juntos, confiando en la sincronización con Tsunade");
									System.out.println(
											"Gracias a la sincronización con Tsunade consigues capturar a Itachi con vida sin recibir daño \n");
									System.out.println("Has conseguido un Artefacto (Anillo del Tiempo)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");

									if (vidaE == 0) {
										combate = false;
									}
								}
							}
							break;
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				// GAARA - TEMPLO DEL TIEMPO
				if (personaje.equalsIgnoreCase("Gaara")) {
					System.out.println("Jiraiya: Gaara, este templo está diseñado para agotar tus fuerzas."
							+ "         Cada paso que damos parece atraer más trampas. \n" + " \n"
							+ "Gaara: No me detendré. Mi arena es más fuerte que cualquier obstáculo. \n" + " \n"
							+ "Opciones: \n" + " \n"
							+ "1.Usar tu arena para desenterrar las esferas de obsidiana mientras Jiraiya"
							+ "  distrae a los guardianes (arriesgando que los guardianes ataquen mientras "
							+ "  trabajas). \n"
							+ "2.Permitir que Jiraiya use su infiltración para manipular las trampas "
							+ "  mientras tú defiendes al equipo (arriesgando que las trampas activen mecanismos"
							+ "  secundarios si no son neutralizadas correctamente). \n"
							+ "3.Trabajar juntos para desactivar las trampas y mover las esferas, combinando"
							+ "  fuerza y estrategia (arriesgando que la coordinación entre ambos sea más lenta "
							+ "  que actuar por separado). ");

					vidaP = 140;
					chakraP = 1900;
					dañoP[1] = 60;
					dañoP[2] = 110;
					dañoP[3] = 80;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();
						switch (opciones) {

						// GAARA - TEMPLO DEL TIEMPO - CASO 1
						case 1:
							if (opciones == 1) {
								if (chakraP > 100)
									System.out.println(
											"Utilizas tu arena para desenterrar las esferas de obsidiana mientras Jiraiya\n"
													+ "distrae a los guardianes pero Itachi os ha descubierto \n");
								System.out.println("Empieza el combate \n" + "\n" + "Tu oponente es Itachi");
								vidaE = 80;

								System.out.println("Vida: " + vidaE);

								do {
									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {
										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Itachi recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Itachi bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Itachi esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Itachi: " + dañoFinal);
											System.out.println("Vida restante de Itachi: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Itachi ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;

											System.out.println("Orochimaru ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}
									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3.");
									}
								} while (vidaP > 0 && vidaE > 0);

								// Volvemos al menú de exploración si el jugador ganó
								if (vidaP > 0 && vidaE == 0) {

									combate = false;

									System.out.println("Has conseguido un Artefacto (Anillo del Tiempo)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
								}
								continue;
							}

							break;

						// GAARA - TEMPLO DEL TIEMPO - CASO 2
						case 2:

							if (chakraP > 100)
								System.out.println("" + "Eliges dejar que Tsunade use su experiencia  mientras tú "
										+ " resuelves el Enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Tsunade consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra. \n"
											+ "Tu chakra es: " + chakraP + "  \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Anillo del Tiempo de Itachi sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Itachi os echa del Templo y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// GAARA - TEMPLO DEL TIEMPO - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println("Eliges atacar juntos, para que Tsunade identifique los patrones\n");
								System.out.println(
										"Gracias a la sincronización con Tsunade consigues capturar a Orochimaru con vida sin recibir daño \n");
								System.out.println("Has conseguido un Artefacto (Anillo del Tiempo de Itachi)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}

							break;
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				break;

			// FORTALEZA DE LAS SOMBRAS
			case 4:
				ataquesE[1] = "Kamui";
				ataquesE[2] = "Rinnegan";
				ataquesE[3] = "Control del Jūbi";
				dañoE[1] = 80;
				dañoE[2] = 110;
				dañoE[3] = 130;
				vidaE = 150;

				System.out.println("Has entrado a la Fortaleza de las Sombras. Esta controlado \n "
						+ "por Obito Uchiha. Este lugar está lleno de trampas ilusorias y sombras \n "
						+ "vivas que confunden a los héroes.Deberas Resolver acertijos \n "
						+ "basados en luz y oscuridad para abrir pasajes ocultos.\n");
				System.out.println("");
				System.out.println("Al entrar te has encontrado con Shikamaru.");

				// NARUTO - FORTALEZA DE LAS SOMBRAS
				if (personaje.equalsIgnoreCase("Naruto")) {
					System.out.println("Naruto: !Shikamaru! Esta niebla es un dolor de cabeza. No puedo ver ni el \n"
							+ "        puente de mi nariz. ¿Cómo esperas que encontremos esa fuente de luz? \n" + " \n"
							+ "Shikamaru: Naruto, esta niebla no es un simple obstáculo; es un arma. \n"
							+ "           Cada movimiento que hacemos altera el flujo. Tengo un plan, pero depende de ti. \n"
							+ " \n" + "Opciones: \n" + " \n"
							+ "1.Usar clones de sombra para explorar el terreno (arriesgándote a gastar mucho \n"
							+ "  chakra si las trampas son numerosas). \n"
							+ "2.Cargar directamente y confiar en tus instintos para atraer la atención de Zabuza \n"
							+ "  (arriesgando que te encuentres con él antes de que Shikamaru termine su análisis). \n"
							+ "3.Quedarte quieto y permitir que Shikamaru haga su trabajo mientras proteges al equipo \n"
							+ "  desde una posición central (arriesgando perder tiempo valioso). ");

					vidaP = 220;
					chakraP = 2900;
					dañoP[1] = 90;
					dañoP[2] = 170;
					dañoP[3] = 70;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {
						// NARUTO - FORTALEZA DE LAS SOMBRAS - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println("Usas clones de sombra para explorar el terreno pero caes en una\n"
										+ " trampa ilusoria y os descubre Obito");
								System.out.println("Empieza el combate \n" + "Tu oponente es Obito");
								System.out.println("Vida: " + vidaE);

								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Obito recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Obito bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Obito esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Obito: " + dañoFinal);
											System.out.println("Vida restante de Obito: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Obito ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;
											System.out.println("Obito ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out
											.println("¡Has derrotado a Obito y se han disipado las trampas ilusorias!");
									System.out
											.println("Has conseguido un Artefacto (Pergamino de las Sombras de Obito)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									combate = false;

								}
								continue;

							}
							break;

						// NARUTO - FORTALEZA DE LAS SOMBRAS - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println("" + "Eliges dejar que Shikamaru use su experiencia  mientras tú "
										+ " resuelves el enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Shikamaru consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra. \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Pergamino de las Sombras de Obito sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Obito os echa de la Fortaleza y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// NARUTO - FORTALEZA DE LAS SOMBRAS - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;
								System.out.println(
										"Te quedas quieto protegiendo al equipo mientras Shikamaru busca el artefacto sin\n"
												+ "ser detectado por las trampas ilusorias ni por Obito");
								System.out.println("Has conseguido un Artefacto (Pergamino de las Sombras de Obito)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				// SASUKE - FORTALEZA DE LAS SOMBRAS
				if (personaje.equalsIgnoreCase("Sasuke")) {
					System.out.println("Shikamaru: Sasuke, esta niebla está diseñada para explotar\n"
							+ "           nuestras debilidades. Necesitamos más estrategia y \n"
							+ "           menos ego aquí.\n" + " \n"
							+ "Sasuke: No tengo tiempo para juegos. Dime qué necesitas.\n" + " \n" + "Opciones:\n"
							+ " \n" + "1.Usar tu Sharingan para detectar los movimientos en la niebla y guiar a\n"
							+ "  Shikamaru (arriesgando agotar tu visión si las trampas son demasiado numerosas).\n"
							+ "2.Permitir que Shikamaru manipule las sombras mientras tú te concentras\n"
							+ "  en enfrentar a Zabuza directamente (arriesgando caer en una\n"
							+ "  emboscada mientras lo haces).\n"
							+ "3.Combinar tus habilidades: tú enfrentas las ilusiones mientras Shikamaru desactiva\n"
							+ "  las trampas (arriesgando un enfrentamiento prolongado si no actúan rápido).\n");

					vidaP = 190;
					chakraP = 2500;
					dañoP[1] = 90;
					dañoP[2] = 150;
					dañoP[3] = 110;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();
						switch (opciones) {
						// SASUKE - FORTALEZA DE LAS SOMBRAS - CASO 1
						case 1:
							if (opciones == 1) {
								if (chakraP > 100)
									System.out.println("Usas tu Sharingan para detectar las trampas y guiar a\n"
											+ "Shikamaru pero Obito os descubre\n");
								System.out.println("Empieza el combate \n" + "\n" + "Tu oponente es Obito");
								vidaE = 80;

								System.out.println("Vida: " + vidaE);

								do {
									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {
										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Obito recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Obito bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Obito esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Obito: " + dañoFinal);
											System.out.println("Vida restante de Obito: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Obito ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;

											System.out.println("Obito ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}
									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3.");
									}
								} while (vidaP > 0 && vidaE > 0);

								// Volvemos al menú de exploración si el jugador ganó
								if (vidaP > 0 && vidaE == 0) {

									combate = false;

									System.out
											.println("¡Has derrotado a Obito y se han disipado las trampas ilusorias!");
									System.out
											.println("Has conseguido un Artefacto (Pergamino de las Sombras de Obito)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
								}
								continue;
							}

							break;

						// SASUKE - FORTALEZA DE LAS SOMBRAS - CASO 2
						case 2:

							if (chakraP > 100)
								System.out.println("Eliges dejar que Shikamaru use su experiencia  mientras tú "
										+ " resuelves el Enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Shikamaru consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra. \n"
											+ "Tu chakra es: " + chakraP + "  \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Pergamino de las Sombras de Itachi sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Obito os echa de la Fortaleza y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// SASUKE - FORTALEZA DE LAS SOMBRAS - CASO 3
						case 3:
							if (opciones == 3) {
								if (chakraP > 100) {

									vidaE = 0;

									System.out.println(
											"Eliges atacar juntos, mientras te desaces de las ilusiones y Shikamaru de las trampas");
									System.out.println(
											"Gracias a la sincronización con Shikamaru consigues capturar a Obito con vida sin recibir daño \n");
									System.out
											.println("Has conseguido un Artefacto (Pergamino de las Sombras de Obito)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");

									if (vidaE == 0) {
										combate = false;
									}
								}
							}
							break;
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				// GAARA - FORTALEZA DE LAS SOMBRAS
				if (personaje.equalsIgnoreCase("Gaara")) {
					System.out.println("Shikamaru: Gaara, estas trampas están diseñadas para confundirnos. Si no \n"
							+ "           sincronizamos nuestras habilidades, podríamos quedarnos atrapados aquí \n"
							+ "           para siempre.\n" + " \n"
							+ "Gaara: Mi control sobre la arena puede abrir el camino, pero necesitaré \n"
							+ "       tus estrategias para hacerlo de manera eficiente. \n" + " \n" + "Opciones:\n"
							+ " \n" + "1.Usar tu arena para mover las esferas mientras Shikamaru analiza las trampas \n"
							+ "  y las neutraliza (arriesgando consumir tu chakra si las trampas son demasiadas \n"
							+ "  para cubrir todo)\n"
							+ "2.Dejar que Shikamaru se encargue de las trampas mientras tú te concentras en \n "
							+ "  estabilizar las estructuras del templo (arriesgando que las trampas sean más \n"
							+ "  rápidas que el análisis de Shikamaru).\n"
							+ "3.Trabajar en conjunto: Shikamaru identifica los patrones mientras tú ajustas \n"
							+ "  la arena para activar los mecanismos correctos (arriesgando que el trabajo en \n "
							+ "  equipo sea más lento que actuar por separado).");

					vidaP = 150;
					chakraP = 2100;
					dañoP[1] = 70;
					dañoP[2] = 120;
					dañoP[3] = 90;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();
						switch (opciones) {
						// GAARA - FORTALEZA DE LAS SOMBRAS - CASO 1
						case 1:
							if (opciones == 1) {
								if (chakraP > 100)
									System.out.println(
											"Utilizas tu arena para mover las esferas mientras Shikamaru analiza\n"
													+ "  las trampas y las neutraliza pero Obito os ha descubierto \n");
								System.out.println("Empieza el combate \n" + "\n" + "Tu oponente es Obito");
								vidaE = 80;

								System.out.println("Vida: " + vidaE);

								do {
									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {
										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Obito recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Obito bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Obito esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Obito: " + dañoFinal);
											System.out.println("Vida restante de Obito: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Obito ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;

											System.out.println("Obito ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}
									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3.");
									}
								} while (vidaP > 0 && vidaE > 0);

								// Volvemos al menú de exploración si el jugador ganó
								if (vidaP > 0 && vidaE == 0) {

									combate = false;

									System.out
											.println("Has conseguido un Artefacto (Pergamino de las Sombras de Obito)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
								}
								continue;
							}

							break;

						// GAARA - FORTALEZA DE LAS SOMBRAS - CASO 2
						case 2:

							if (chakraP > 100)
								System.out.println("" + "Eliges dejar que Shikamaru use su experiencia  mientras tú "
										+ " resuelves el Enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Shikamaru consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra. \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Pergamino de las Sombras de Obito sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Obito os echa de la Fortaleza y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// GAARA - FORTALEZA DE LAS SOMBRAS - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out
										.println("Eliges atacar juntos, para que Shikamaru identifique los patrones\n");
								System.out.println(
										"Gracias a la sincronización con Shikamaru consigues capturar a Obito con vida sin recibir daño \n");
								System.out.println("Has conseguido un Artefacto (Pergamino de las Sombras de Obito)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}

							break;
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				break;

			// SANTUARIO DE LA ARENA DESOLADA
			case 5:
				ataquesE[1] = "Limbo";
				ataquesE[2] = "Susanoo";
				ataquesE[3] = "Amenominaka";
				dañoE[1] = 100;
				dañoE[2] = 130;
				dañoE[3] = 140;
				vidaE = 180;
				System.out.println("Has entrado al Santuario de la Arena Desolada. \n"
						+ "Está controlado por Madara Uchiha. Es un desierto interminable\n"
						+ "rodea un templo lleno de trampas de arena viva y guardianes\n"
						+ "de piedra.Deberas Los héroes deben encontrar y alinear \n"
						+ "una serie de esferas de obsidiana enterradas en el templo,\n "
						+ "las cuales actúan como puntos focales para controlar la arena.\n");
				System.out.println("");
				System.out.println("Al entrar te has encontrado con Sakura.");

				// NARUTO - SANTUARIO DE LA ARENA DESOLADA
				if (personaje.equalsIgnoreCase("Naruto")) {
					System.out.println("Sakura: Naruto, estas esferas están diseñadas para trabajar juntas,"
							+ "        y moverlas requiere precisión.  Si nos apresuramos, podríamos activar \n"
							+ "        una trampa. \n" + " \n"
							+ "Naruto: Lo entiendo, Sakura, pero no podemos perder tiempo. ¿Cuál es el plan? \n" + " \n"
							+ "Opciones: \n" + " \n"
							+ "1.Ayudar a Sakura con clones de sombra para mover las esferas más rápido (arriesgando que \n"
							+ "  los clones activen trampas si no son precisos). \n"
							+ "2.Dejar que Sakura use su fuerza mientras tú resuelves el enigma \n"
							+ "  (arriesgando que derroten a Sakura si los guardianes son demasiado fuertes). \n"
							+ "3.Trabajar en equipo: tú guías las esferas con Kurama mientras Sakura usa su precisión para \n"
							+ "  alinear el mecanismo (arriesgando que la coordinación entre ambos sea lenta si no logran \n"
							+ "  sincronizarse bien). \n");

					vidaP = 230;
					chakraP = 2900;
					dañoP[1] = 100;
					dañoP[2] = 170;
					dañoP[3] = 90;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {

						// NARUTO - SANTUARIO DE LA ARENA DESOLADA - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println(
										"Ayudar a Sakura con clones de sombra para mover las esferas más rápido \n");
								System.out.println("Empieza el combate \n" + "Tu oponente es Madara");
								System.out.println("Vida: " + vidaE);

								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Madara recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Madara bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Madara esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Madara: " + dañoFinal);
											System.out.println("Vida restante de Madara: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Madara ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;
											System.out.println("Madara ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out.println("¡Has derrotado a Madara y el Santuario se desmorona!");
									System.out.println("Has conseguido un Artefacto (Esfera de Arena de Madara)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									combate = false;

								}
								continue;

							}
							break;

						// NARUTO - SANTUARIO DE LA ARENA DESOLADA - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println(
										"Eliges Dejar que Sakura use su fuerza mientras tú resuelves el enigma\n");

							System.out.println(
									"Gracias a Sakura consigues llegar hasta el Enigma sin ser detectados pero gasta mucho chakra. \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Esfera de Arena de Madara sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Madara os echa del Santuario y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// NARUTO - SANTUARIO DE LA ARENA DESOLADA - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println(
										"Eliges Trabajar en equipo: tú guías las esferas con Kurama mientras Sakura usa  \n"
												+ "su precisión para alinear el mecanismo");
								System.out.println(
										"Gracias a la sincronización con Sakura consigues capturar a Madara con vida sin recibir daño ");
								System.out.println("Has conseguido un Artefacto (Esfera de Arena de Madara)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				// SASUKE - SANTUARIO DE LA ARENA DESOLADA
				if (personaje.equalsIgnoreCase("Sasuke")) {
					System.out.println("Sakura: Sasuke, estas ilusiones no son normales.\n"
							+ "        Madara quiere desestabilizarnos con recuerdos y futuros que no comprendemos.\n"
							+ " \n" + "Sasuke: Esto no es un juego, Sakura. Conozco a Itachi mejor que nadie,\n"
							+ "        pero aceptaré tu ayuda si tienes algo útil.\n" + " \n" + "Opciones:\n" + " \n"
							+ "1.Enfrentar directamente a Madara y sus ilusiones, confiando en tu Rinnegan\n"
							+ "  para mantener el control (arriesgando quedar atrapado en un bucle temporal si fallas).\n"
							+ "2.Dejar que Sakura mantenga al equipo estable con su chakra mientras tú\n"
							+ "  te concentras en resolver el enigma (arriesgando que las ilusiones\n"
							+ "  afecten emocionalmente al grupo mientras Sakura se centra en apoyar).\n"
							+ "3.Trabajar juntos para enfrentar las ilusiones y resolver los acertijos,\n"
							+ "  combinando tu fuerza con la estabilidad de Sakura (arriesgando que Madara explote \n"
							+ "  cualquier desacuerdo entre ambos).\n");

					vidaP = 200;
					chakraP = 2700;
					dañoP[1] = 95;
					dañoP[2] = 160;
					dañoP[3] = 100;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {
						// SASUKE - SANTUARIO DE LA ARENA DESOLADA - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println(
										"Enfrentas directamente a Madara y sus ilusiones, confiando en tu Rinnegan\n"
												+ " para mantener el control \n");
								System.out.println("Empieza el combate \n" + "Tu oponente es Madara");
								System.out.println("Vida: " + vidaE);

								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Madara recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Madara bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Madara esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Madara: " + dañoFinal);
											System.out.println("Vida restante de Madara: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Madara ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;
											System.out.println("Madara ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out.println("¡Has derrotado a Madara y el Santuario se desmorona!");
									System.out.println("Has conseguido un Artefacto (Esfera de Arena de Madara)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									combate = false;

								}
								continue;

							}
							break;

						// SASUKE - SANTUARIO DE LA ARENA DESOLADA - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println(
										"Eliges Dejar que Sakura mantenga al equipo estable con su chakra mientras tú \n"
												+ "te concentras en resolver el enigma\n");

							System.out.println(
									"Gracias a Sakura consigues llegar hasta el Enigma sin ser detectados pero gasta mucho chakra. \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Esfera de Arena de Madara sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Madara os echa del Santuario y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// SASUKE - SANTUARIO DE LA ARENA DESOLADA - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println(
										"Eliges Trabajar juntos para enfrentar las ilusiones combinando tu fuerza con la estabilidad de Sakura");
								System.out.println(
										"Gracias a la sincronización con Sakura consigues capturar a Madara con vida sin recibir daño ");
								System.out.println("Has conseguido un Artefacto (Esfera de Arena de Madara)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				// GAARA - SANTUARIO DE LA ARENA DESOLADA
				if (personaje.equalsIgnoreCase("Gaara")) {
					System.out.println("Sakura: Gaara, esas esferas son enormes. Moverlas no será fácil, \n"
							+ " incluso con tu control de la arena. \n" + " \n"
							+ "Gaara: \"Es cierto. La sincronización será clave. Pero dependeremos \n"
							+ "también de tu fuerza y precisión. \n" + "\n" + "Opciones: \n" + " \n"
							+ "1.Concentrarte en mover las esferas mientras Sakura golpea el terreno \n"
							+ "  para guiar el flujo de arena (arriesgando que la fuerza de Sakura sea \n"
							+ "  insuficiente para las trampas ocultas).\n"
							+ "2.Permitir que Sakura cree los pasajes primero y luego enfocar tu \n"
							+ "  energía en resolver el enigma (arriesgando que el tiempo no sea \n"
							+ "  suficiente para completar el mecanismo).\n"
							+ "3.Dividir los esfuerzos, moviendo ambos la arena y las esferas \n"
							+ "  simultáneamente (arriesgando errores por falta de coordinación).");

					vidaP = 160;
					chakraP = 2300;
					dañoP[1] = 80;
					dañoP[2] = 130;
					dañoP[3] = 90;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {
						// GAARA - SANTUARIO DE LA ARENA DESOLADA - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println(
										"Concentrarte en mover las esferas mientras Sakura golpea el terreno para guiar el flujo de arena \n");
								System.out.println("Empieza el combate \n" + "Tu oponente es Madara");
								System.out.println("Vida: " + vidaE);

								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Madara recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Madara bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Madara esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Madara: " + dañoFinal);
											System.out.println("Vida restante de Madara: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Madara ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;
											System.out.println("Madara ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out.println("¡Has derrotado a Madara y el Santuario se desmorona!");
									System.out.println("Has conseguido un Artefacto (Esfera de Arena de Madara)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									combate = false;

								}
								continue;

							}
							break;

						// GAARA - SANTUARIO DE LA ARENA DESOLADA - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println(
										"Eliges Permitir que Sakura cree los pasajes primero y luego enfocar tu energía en resolver el enigma \n");

							System.out.println(
									"Gracias a Sakura consigues llegar hasta el Enigma sin ser detectados pero gasta mucho chakra. \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Esfera de Arena de Madara sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Madara os echa del Santuario y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// GAARA - SANTUARIO DE LA ARENA DESOLADA - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println(
										"Eliges Dividir los esfuerzos, moviendo ambos la arena y las esferas simultáneamente");
								System.out.println(
										"Gracias a la sincronización con Sakura consigues capturar a Madara con vida sin recibir daño ");
								System.out.println("Has conseguido un Artefacto (Esfera de Arena de Madara)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				break;

			// PALACIO CELESTIAL
			case 6:
				ataquesE[1] = "Rinne-Sharingan";
				ataquesE[2] = "Dimensiones Espaciales";
				ataquesE[3] = "Técnicas de la Luna";
				dañoE[1] = 115;
				dañoE[2] = 130;
				dañoE[3] = 160;
				vidaE = 220;

				System.out.println("Has entrado al Palacio Celestial. Está controlado\n"
						+ "por Kaguya Ōtsutsuki. Es una dimensión fracturada donde cada\n"
						+ "paso puede llevar a los héroes a un nuevo plano de existencia.\n"
						+ "Deberás descifrar un patrón lógico para estabilizar la dimensión\n"
						+ "y enfrentarse a Kaguya.");
				System.out.println("");
				System.out.println("Al entrar te has encontrado con Killer Bee.");

				// NARUTO - PALACIO CELESTIAL
				if (personaje.equalsIgnoreCase("Naruto")) {
					System.out.println("Killer Bee: Yo, Naruto, este plano es un caos, mi bro. Si pierdes \n"
							+ "            el ritmo, te llevará el flow. \n" + " \n"
							+ "Naruto: ¡Bee, no tengo tiempo para acertijos rimados! ¿Qué hago para \n"
							+ "         mantener a Kurama bajo control y salir de aquí? \n" + " \n" + "Opciones: \n"
							+ " \n"
							+ "1.Sincronizarte con Kurama y liberar su poder en pequeñas ráfagas para estabilizar el entorno \n"
							+ "  (arriesgando una reacción violenta de Kurama si lo fuerzas demasiado). \n"
							+ "2.Pedir mi ayuda para usar el chakra y cubrirte mientras resuelves el enigma (arriesgando \n"
							+ "  perder contra Kaguya). \n"
							+ "3.Ignorar el caos y centrarte únicamente en avanzar rápidamente conmigo (arriesgando dejar \n"
							+ "  atrás partes importantes de esta dimensión).");

					vidaP = 240;
					chakraP = 3000;
					dañoP[1] = 110;
					dañoP[2] = 180;
					dañoP[3] = 100;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {
						// NARUTO - PALACIO CELESTIAL - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println(
										"Has utilizado Sincronizarte con Kurama y liberar su poder en pequeñas ráfagas para estabilizar el entorno \n");
								System.out.println("Empieza el combate \n" + "Tu oponente es Kaguya");
								System.out.println("Vida: " + vidaE);

								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Kaguya recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Kaguya bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Kaguya esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Kaguya: " + dañoFinal);
											System.out.println("Vida restante de Kaguya: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Kaguya ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;
											System.out.println("Kaguya ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out.println("¡Has derrotado a Kaguya y el palacio empieza a derrumbarse!");
									System.out.println("Has conseguido un Artefacto (Cristal Fractal de Kaguya)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									combate = false;

								}
								continue;

							}
							break;

						// NARUTO - PALACIO CELESTIAL - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println(
										"" + "Eliges dejar que Killer Bee use su chakra para cubrirte mientras tú "
												+ " resuelves el enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Killer Bee consigues llegar hasta el Enigma sin ser detectados pero gasta mucho chakra. \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Cristal Fractal de Kaguya sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Kaguya os echa del Palacio y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// NARUTO - PALACIO CELESTIAL - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println(
										"Eliges Ignorar el caos y centrarte únicamente en avanzar rápidamente con Killer Bee");
								System.out.println(
										"Gracias a la sincronización con Killer Bee consigues capturar a Kaguya con vida sin recibir daño ");
								System.out.println("Has conseguido un Artefacto (Cristal Fractal de Kaguya)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				// SASUKE - PALACIO CELESTIAL
				if (personaje.equalsIgnoreCase("Sasuke")) {
					System.out.println("Killer Bee: Yo, Sasuke, este plano es más loco que un genjutsu\n"
							+ "           invertido. Necesitamos ritmo, mi bro de mirada fría.\n" + " \n"
							+ "Sasuke: Céntrate, Bee. No estoy aquí para juegos. ¿Tienes algo útil que decir?\n" + " \n"
							+ "Opciones:\r\n" + " \n" + "1.Usar el Rinnegan para rastrear patrones dimensionales y\n"
							+ "  y avanzar rápidamente (arriesgando agotar tus habilidades visuales\n"
							+ "  si los patrones cambian demasiado rápido).\n"
							+ "2.Permitir que Killer Bee use su control de chakra para estabilizar\n"
							+ "  la dimensión mientras tú resuelves el enigma (arriesgando que\n"
							+ "  las criaturas te abrumen mientras Bee te cubre).\n"
							+ "3.Trabajar juntos: Bee mantiene el equilibrio dimensional y tú\n"
							+ "  te concentras en abrir un camino con tus habilidades de espacio-tiempo\n"
							+ "  (arriesgando que un error en la coordinación ralentice el avance).\n");

					vidaP = 210;
					chakraP = 2850;
					dañoP[1] = 100;
					dañoP[2] = 170;
					dañoP[3] = 105;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {
						// SASUKE - PALACIO CELESTIAL - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println(
										"Usar el Rinnegan para rastrear patrones dimensionales y avanzar rapidamente \n");
								System.out.println("Empieza el combate \n" + "Tu oponente es Kaguya");
								System.out.println("Vida: " + vidaE);

								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Kaguya recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Kaguya bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Kaguya esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;
											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Kaguya: " + dañoFinal);
											System.out.println("Vida restante de Kaguya: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Kaguya ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;
											System.out.println("Kaguya ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out.println("¡Has derrotado a Kaguya y el palacio empieza a derrumbarse!");
									System.out.println("Has conseguido un Artefacto (Cristal Fractal de Kaguya)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									combate = false;

								}
								continue;

							}
							break;

						// SASUKE - PALACIO CELESTIAL - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println(
										"Eliges que Killer Bee use su control de chakra para estabilizar la dimensión mientras tú resuelves el enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Killer Bee consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra. \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Cristal Fractal de Kaguya sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Kaguya os echa del Palacio y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// SASUKE - PALACIO CELESTIAL - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println(
										"  Eliges trabajar junto a Bee mantiene el equilibrio dimensional y tú \n"
												+ "  te concentras en abrir un camino con tus habilidades de espacio-tiempo");
								System.out.println(
										"Gracias a la sincronización con Killer Bee consigues capturar a Kaguya con vida sin recibir daño ");
								System.out.println("Has conseguido un Artefacto (Cristal Fractal de Kaguya)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				// GAARA - PALACIO CELESTIAL
				if (personaje.equalsIgnoreCase("Gaara")) {
					System.out.println("Killer Bee: Yo, Gaara, este lugar es un lío. Las reglas no existen,"
							+ " ¡ni siquiera el piso es fijo, mi bro!\n" + " \n"
							+ "Gaara: \"Mantén el ritmo, Killer Bee. Solo necesito un plan que maximice "
							+ "nuestros puntos fuertes. \n" + " \n" + "Opciones: \n" + " \n"
							+ "1.Usar tu arena para estabilizar el entorno mientras Killer Bee combate a "
							+ "  las criaturas dimensionales (arriesgando consumir tus recursos antes de "
							+ "  llegar al núcleo del plano).\n"
							+ "2.Dejar que Killer Bee use su chakra de Gyūki para cubrirte "
							+ "  mientras tú resuelves el enigma (arriesgando que las criaturas sean "
							+ "  más rápidas de lo esperado).\n"
							+ "3.Coordinar ataques y defensas: tú controlas el terreno mientras Killer"
							+ "  Bee sincroniza los movimientos para mantener el avance (arriesgando que"
							+ "  un error en la sincronización retrase el progreso).");

					vidaP = 175;
					chakraP = 2500;
					dañoP[1] = 90;
					dañoP[2] = 140;
					dañoP[3] = 100;

					combate = true;
					while (combate) {

						opciones = scanner.nextInt();

						switch (opciones) {

						// GAARA - PALACIO CELESTIAL - CASO 1
						case 1:
							if (chakraP > 100) {
								System.out.println(
										"Usar tu arena para estabilizar el entorno mientras Killer Bee combate a \n"
												+ "las criaturas dimensionales \n");
								System.out.println("Empieza el combate \n" + "Tu oponente es Kaguya");
								System.out.println("Vida: " + vidaE);

								do {

									System.out.println("Elige un ataque:");
									System.out.println("1. " + ataquesP[1] + " (Daño: " + dañoP[1] + ", Chakra: "
											+ chakraPA[1] + ")");
									System.out.println("2. " + ataquesP[2] + " (Daño: " + dañoP[2] + ", Chakra: "
											+ chakraPA[2] + ")");
									System.out.println("3. " + ataquesP[3] + " (Daño: " + dañoP[3] + ", Chakra: "
											+ chakraPA[3] + ")");

									opcionesCombate = scanner.nextInt();

									if (opcionesCombate >= 1 && opcionesCombate <= 3) {

										if (chakraP >= chakraPA[opcionesCombate]) {
											System.out.println(personaje + " ataca con " + ataquesP[opcionesCombate]);
											chakraP -= chakraPA[opcionesCombate];

											// Generar la defensa del enemigo
											Random random = new Random();
											int defensa = random.nextInt(3) + 1;

											int dañoFinal = dañoP[opcionesCombate];
											switch (defensa) {
											case 1:
												System.out.println("Kaguya recibe completamente el ataque!");
												dañoFinal = dañoP[opcionesCombate];
												break;
											case 2:
												System.out.println("Kaguya bloquea parte del ataque!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("Kaguya esquiva el ataque!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											// Aplicar daño al enemigo
											vidaE -= dañoFinal;

											if (vidaE <= 0) {
												vidaE = 0;
											}

											// Mostrar resultado
											System.out.println("Daño causado a Kaguya: " + dañoFinal);
											System.out.println("Vida restante de Kaguya: " + vidaE);

											// Verifica si el enemigo ha sido derrotado
											if (vidaE <= 0) {
												vidaE = 0;
												System.out.println("¡Kaguya ha sido derrotado!");
												combate = false;
											}
										} else {
											System.out.println(
													"No tienes suficiente chakra para ese ataque. Elige otro.");
										}

										if (vidaE > 0) {
											Random random = new Random();
											ataqueE = random.nextInt(3) + 1;
											System.out.println("Kaguya ataca con " + ataquesE[ataqueE] + "!");
											int defensaJugador = random.nextInt(3) + 1;
											int dañoFinal = dañoE[ataqueE];

											switch (defensaJugador) {
											case 1:
												System.out.println(
														"¡" + personaje + " recibe completamente el ataque enemigo!");
												vidaP -= dañoE[ataqueE];
												break;
											case 2:
												System.out.println(
														"¡" + personaje + " bloquea parcialmente el ataque enemigo!");
												dañoFinal /= 2;
												break;
											case 3:
												System.out.println("¡" + personaje + " esquiva el ataque enemigo!");
												dañoFinal = 0;
												break;
											default:
												break;
											}

											vidaP -= dañoFinal;

											if (vidaP <= 0) {
												vidaP = 0;
											}

											System.out.println("Daño recibido por " + personaje + ": " + dañoFinal);
											System.out.println("Vida restante de " + personaje + ": " + vidaP);

											if (vidaP <= 0) {
												vidaP = 0;
												System.out.println(personaje + " ha sido derrotado.");
												combate = false;
												exploracion = false;
											}
										}

									} else {
										System.out.println("Opción incorrecta. Elige 1, 2 o 3:");
									}

								} while (vidaP > 0 && vidaE > 0);

								if (vidaP > 0 && vidaE == 0) {
									combate = false;
									System.out.println("¡Has derrotado a Kaguya y el palacio empieza a derrumbarse!");
									System.out.println("Has conseguido un Artefacto (Cristal Fractal de Kaguya)");
									++artefacto;
									System.out.println("Artefactos: " + artefacto);
									System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
									System.out
											.println("Regresas al punto de exploración para decidir tu próximo paso.");
									combate = false;

								}
								continue;

							}
							break;

						// GAARA - PALACIO CELESTIAL - CASO 2
						case 2:
							if (chakraP > 100)
								System.out.println(
										"Dejar que Killer Bee use su chakra de Gyūki para cubrirte mientras tú resuelves el enigma \n");
							chakraP = 1500;
							System.out.println(
									"Gracias a Killer Bee consigues llegar hasta el Enigma sin ser detectados pero gastas mucho chakra. \n");

							boolean enigmaResuelto = false;
							String respuestaEnigma = "";

							Random random = new Random();
							int opcion = random.nextInt(enigmas.length);
							String enigmaActual = enigmas[opcion];

							System.out.println("Enigma:");
							System.out.println(enigmaActual);

							System.out.println("Tu respuesta: ");
							scanner.nextLine();
							respuestaEnigma = scanner.nextLine();

							if (respuestaEnigma.equalsIgnoreCase("Plátano") || respuestaEnigma.equalsIgnoreCase("Pato")
									|| respuestaEnigma.equalsIgnoreCase("Hilo")
									|| respuestaEnigma.equalsIgnoreCase("Esteban")
									|| respuestaEnigma.equalsIgnoreCase("Rana")) {

								System.out.println("¡Correcto! Has resuelto el enigma.\n");
								enigmaResuelto = true;
								combate = false;
								System.out.println(
										"Has conseguido salir ileso y robar el artefacto Cristal Fractal de Kaguya sin pelear!!");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");

								vidaE = 0;

							} else {
								System.out.println(
										"Respuesta incorrecta. Kaguya os echa del Palacio y no consigues el artefacto.");
								enigmaResuelto = true;
								combate = false;
							}

							break;

						// GAARA - PALACIO CELESTIAL - CASO 3
						case 3:
							if (chakraP > 100) {

								vidaE = 0;

								System.out.println(
										" Eliges coordinar ataques y defensas, tú controlas el terreno mientras Killer\n"
												+ " Bee sincroniza los movimientos para mantener el avance ");
								System.out.println(
										"Gracias a la sincronización con Killer Bee consigues capturar a Kaguya con vida sin recibir daño ");
								System.out.println("Has conseguido un Artefacto (Cristal Fractal de Kaguya)");
								++artefacto;
								System.out.println("Artefactos: " + artefacto);
								System.out.println("¡¡¡Ha aumentado tu vida, tu daño y tu chakra!!!");
								System.out.println("Regresas al punto de exploración para decidir tu próximo paso.");

								if (vidaE == 0) {
									combate = false;
									exploracion = false;

									if (artefacto == 0) {
										System.out.println("!! Fin del juego ¡¡");
										System.out.println("");
									}
								}
							}
						}
						if (opciones == 1 || opciones == 2 || opciones == 3) {
							System.out.println("  ");
						} else {
							System.out.println("¡Opción incorrecta! Por favor elige 1, 2 o 3.");
						}
					}

				}

				break;

			}
		}
		
		System.out.println("Tu aventura ha llegado a su fin.");
		System.out.println("Evaluando los artefactos recolectados...");

		if (artefacto == 0) {
		    System.out.println("Lamentablemente, caíste en la última batalla y no lograste recolectar ningún artefacto. La amenaza prevalece.");
		} else if (artefacto == 1 ) {
		    System.out.println("Con 1 artefactos, logras debilitar la amenaza, pero el mundo shinobi sigue en peligro.");
		} else if (artefacto == 2 ) {
		    System.out.println("Con 2 artefactos, logras debilitar la amenaza, pero el mundo shinobi sigue en peligro.");
		} else if (artefacto == 3 )  {
		    System.out.println("Con 3 artefactos, consigues estabilizar la paz, pero quedan rastros de la energía oscura.");
		} else if (artefacto == 4 )  {
		    System.out.println("Con 4 artefactos, consigues estabilizar la paz, pero quedan rastros de la energía oscura.");
		} else if (artefacto == 5)  {
		    System.out.println("Has recolectado 5 artefactos y restaurado la paz completamente. Eres un héroe reconocido en todo el mundo ninja.");
		} else if (artefacto == 6) {
			 System.out.println("Has recolectado 6 artefactos y restaurado la paz completamente. Eres un héroe reconocido en todo el mundo ninja.");
		} else {
		    System.out.println("Sorprendentemente, al recolectar más artefactos, descubres un poder oculto que trasciende el tiempo y el espacio. Ahora eres el guardián eterno del equilibrio del mundo shinobi.");
		}

		System.out.println("Gracias por jugar. ¡Nos vemos en la próxima aventura!");
		
	}
}

