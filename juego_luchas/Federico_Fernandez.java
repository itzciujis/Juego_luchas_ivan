package juego_luchas;

public class Federico_Fernandez extends Personajes {

    public Federico_Fernandez() {
        super("Federico", 200, 80, 15);
    }

    @Override
    public void habilidad1(Personajes enemigo) {
        if (mana >= 15) {
            enemigo.vida -= 25;
            if (enemigo.vida < 0) enemigo.vida = 0;
            mana -= 15;
            System.out.println(nombre + " usa Golpe Pesado (25 daño)");
        } else {
            System.out.println("No hay suficiente mana");
        }
    }

    @Override
    public void habilidad2(Personajes enemigo) {
        if (mana >= 25) {
            vida += 40;
            mana -= 25;
            System.out.println(nombre + " se cura 40 HP");
        } else {
            System.out.println("No hay suficiente mana");
        }
    }

    @Override
    public String getHabilidad1Nombre() {
        return "Golpe Pesado";
    }

    @Override
    public String getHabilidad2Nombre() {
        return "Curación Grande";
    }
}