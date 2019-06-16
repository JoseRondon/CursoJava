package rankingfichero;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Mañana
 */
public class Jugador {
    private String nombre;
    private int intentos;

    public Jugador(String nombre, int intentos) {
        this.nombre = nombre;
        this.intentos = intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIntentos() {
        return intentos;
    }

    @Override
    public String toString() {
        return nombre+", "+intentos+"\n";
    }
    
   
}
