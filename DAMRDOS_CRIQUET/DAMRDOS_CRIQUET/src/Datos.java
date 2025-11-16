/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafae
 */

public class Datos {
       int puntaje;
       int [] tablero=new int[7]; 

    public Datos() {
        this.puntaje=0;
        tablero[0]=0;
        tablero[1]=0;
        tablero[3]=0;
        tablero[4]=0;
        tablero[5]=0;
        tablero[6]=0;
        this.tablero=tablero;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int[] getTablero() {
        return tablero;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public void setTablero(int[] tablero) {
        this.tablero = tablero;
    }
        
}
