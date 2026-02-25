package juego_luchas;

import java.util.Random;

public class Federico_Fernandez {
    Random rd = new Random();
    private String nombre;
    private int vida;
    private int daño;
    private int mana;

    public Personajes(String nombre, int vida, int daño, int mana){
        this.nombre = "Federico Fernandez";
        this.vida = 150;
        this.daño = rd.nextInt(15, 30);
        this.mana = 60;
    }
    public String getNombre() {return nombre;}
    public int getVida() {return vida;}
    public int getMana() {return mana;}
    public int getDaño() {return daño;}
}
