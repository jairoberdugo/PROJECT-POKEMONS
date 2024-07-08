/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROJECT;

/**
 *
 * @author Jberdugo
 */
public class pokemon {
     private int power, f, c;
    private String tipo, nombre;
   

    public pokemon(int power, String tipo, String nombre) {
        this.power = power;
        this.tipo = tipo;
        this.nombre = nombre;
        f = (int) (Math.random()*6)+1;
        c = (int) (Math.random()*6)+1;
    }

    public int getPower() {
        return power;
    }

    public int getF() {
        return f;
    }

    public int getC() {
        return c;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "pokemon" + "\npower=" + power + "\n posicion=" + f + "," + c + "\n tipo=" + tipo + "\n nombre=" + nombre ;
    }
}
