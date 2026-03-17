package juego_luchas;

public class Hernesto_Jesus extends Personajes {

    public Hernesto_Jesus() {
        super("Hernesto", 150, 100, 20);
    }

    @Override
    public void habilidad1(Personajes enemigo) {
        if (mana >= 20) {
            enemigo.vida -= 35;
            if (enemigo.vida < 0) enemigo.vida = 0;
            mana -= 20;
            System.out.println(nombre + " usa Golpe Fuerte (35 daño)");
        } else {
            System.out.println("No hay suficiente mana");
        }
    }

    @Override
    public void habilidad2(Personajes enemigo) {
        if (mana >= 30) {
            vida += 30;
            mana -= 30;
            System.out.println(nombre + " se cura 30 HP");
        } else {
            System.out.println("No hay suficiente mana");
        }
    }

    @Override
    public String getHabilidad1Nombre() {
        return "Golpe Fuerte";
    }

    @Override
    public String getHabilidad2Nombre() {
        return "Curación";
    }
}