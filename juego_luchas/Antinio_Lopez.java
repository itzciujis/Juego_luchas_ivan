package juego_luchas;

public class Antinio_Lopez extends Personajes {

    public Antinio_Lopez() {
        super("Antinio", 120, 100, 25);
    }

    @Override
    public void habilidad1(Personajes enemigo) {
        if (mana >= 25) {
            enemigo.vida -= 50;
            if (enemigo.vida < 0) enemigo.vida = 0;
            mana -= 25;
            System.out.println(nombre + " usa Golpe Destructor (50 daño)");
        } else {
            System.out.println("No hay suficiente mana");
        }
    }

    @Override
    public void habilidad2(Personajes enemigo) {
        if (mana >= 20) {
            enemigo.vida -= 30;
            if (enemigo.vida < 0) enemigo.vida = 0;
            mana -= 20;
            System.out.println(nombre + " usa Ataque Rápido (30 daño)");
        } else {
            System.out.println("No hay suficiente mana");
        }
    }

    @Override
    public String getHabilidad1Nombre() {
        return "Golpe Destructor";
    }

    @Override
    public String getHabilidad2Nombre() {
        return "Ataque Rápido";
    }
}