package juego_luchas;

public class Jose_Negreira extends Personajes {

    public Jose_Negreira() {
        super("Jose", 130, 120, 18);
    }

    @Override
    public void habilidad1(Personajes enemigo) {
        if (mana >= 10) {
            enemigo.vida -= 20;
            if (enemigo.vida < 0) enemigo.vida = 0;
            mana -= 10;
            System.out.println(nombre + " usa Ataque Veloz (20 daño)");
        } else {
            System.out.println("No hay suficiente mana");
        }
    }

    @Override
    public void habilidad2(Personajes enemigo) {
        if (mana >= 15) {
            enemigo.vida -= 25;
            if (enemigo.vida < 0) enemigo.vida = 0;
            mana -= 15;
            System.out.println(nombre + " usa Combo Rápido (25 daño)");
        } else {
            System.out.println("No hay suficiente mana");
        }
    }

    @Override
    public String getHabilidad1Nombre() {
        return "Ataque Veloz";
    }

    @Override
    public String getHabilidad2Nombre() {
        return "Combo Rápido";
    }
}