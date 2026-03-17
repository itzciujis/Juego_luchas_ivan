package juego_luchas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Personajes[] personajes = {
                new Antinio_Lopez(),
                new Hernesto_Jesus(),
                new Federico_Fernandez(),
                new Jose_Negreira()
        };

        System.out.println("=== PERSONAJES DISPONIBLES ===");
        for (int i = 0; i < personajes.length; i++) {
            System.out.println(i + " - " + personajes[i].getNombre());
        }

        System.out.print("\nJugador 1 elige: ");
        int e1 = sc.nextInt();
        Personajes j1 = personajes[e1];

        System.out.print("Jugador 2 elige: ");
        int e2 = sc.nextInt();

        while (e2 == e1) {
            System.out.println("Ese personaje ya fue elegido. Elige otro.");
            e2 = sc.nextInt();
        }

        Personajes j2 = personajes[e2];

        boolean turno = true;

        while (j1.estaVivo() && j2.estaVivo()) {

            Personajes actual = turno ? j1 : j2;
            Personajes enemigo = turno ? j2 : j1;

            System.out.println("\nTurno de " + actual.getNombre());
            System.out.println("1 - Atacar");
            System.out.println("2 - " + actual.getHabilidad1Nombre());
            System.out.println("3 - " + actual.getHabilidad2Nombre());
            System.out.println("4 - Curarse");

            int op = sc.nextInt();

            if (op == 1) actual.atacar(enemigo);
            else if (op == 2) actual.habilidad1(enemigo);
            else if (op == 3) actual.habilidad2(enemigo);
            else if (op == 4) actual.curarse();

            // regenerar mana
            actual.regenerarMana();

            System.out.println(j1.getNombre() + ": " + j1.getVida() + " HP | " + j1.getMana());
            System.out.println(j2.getNombre() + ": " + j2.getVida() + " HP | " + j2.getMana());

            turno = !turno;
        }

        System.out.println("\nGana " + (j1.estaVivo() ? j1.getNombre() : j2.getNombre()));

        sc.close();
    }
}