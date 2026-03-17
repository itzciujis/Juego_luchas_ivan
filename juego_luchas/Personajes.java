package juego_luchas;

public class Personajes {

    protected String nombre;
    protected int vida;
    protected int mana;
    protected int daño;

    public Personajes(String nombre, int vida, int mana, int daño) {
        this.nombre = nombre;
        this.vida = vida;
        this.mana = mana;
        this.daño = daño;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public int getMana() { return mana; }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void atacar(Personajes enemigo) {
        enemigo.vida -= daño;
        if (enemigo.vida < 0) enemigo.vida = 0;

        System.out.println(nombre + " ataca y hace " + daño + " de daño");
    }

    // Habilidades
    public void habilidad1(Personajes enemigo) {
        System.out.println("Sin habilidad");
    }

    public void habilidad2(Personajes enemigo) {
        System.out.println("Sin habilidad");
    }

    public String getHabilidad1Nombre() {
        return "Habilidad 1";
    }

    public String getHabilidad2Nombre() {
        return "Habilidad 2";
    }

    // Curarse (todos)
    public void curarse() {
        if (mana >= 20) {
            vida += 30;
            mana -= 20;
            System.out.println(nombre + " se cura 30 HP");
        } else {
            System.out.println("No hay suficiente mana");
        }
    }

    // Regenerar mana cada turno
    public void regenerarMana() {
        mana += 10;
        if (mana > 150) mana = 150;
        System.out.println(nombre + " recupera 10 de mana");
    }
}