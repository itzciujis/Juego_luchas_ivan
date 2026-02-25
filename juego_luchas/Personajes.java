package juego_luchas;

import java.util.Set;

public class Personajes {
    private String nombre;
    private int vida;
    private int mana;
    private int daño;

    public juego_luchas(String nombre, int vida, int mana, int daño) {
        this.nombre = nombre;
        this.vida = vida;
        this.mana = mana;
        this.daño = daño;
    }
    public String getNombre() {return nombre;}
    public int getVida() {return vida;}
    public int getMana() {return mana;}
    public int getDaño() {return daño;}

}


