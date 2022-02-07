/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej2;

import java.util.*;


/*
  @author $EmaS7
 */
public class SeviceRuletaRusa {
    static Scanner read = new Scanner(System.in);
     public static ArrayList crearJugador() {
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Cuantos jugadores van a jugar?");
        int num = read.nextInt();
        if (num > 6 || num < 1) { //por defecto
            num = 6;
        }
        for (int i = 0; i < num; i++) {
            Jugador jugador = new Jugador();
            jugador.setId(i + 1); //1 al 6 seteo automatico
            System.out.println("Ingrese el nombre del jugador " + (i + 1));
            jugador.setNombre("Jugador: " + jugador.getId() + " - " + read.next());
            jugador.setMojado(false); //seteo automatico
            jugadores.add(jugador);  //PROBLEMA - ERROR
        }
        return jugadores;
    }
     
    public static RevolverAgua crearRevolver() {
        RevolverAgua revolver = new RevolverAgua();
        Integer pos = (int) (Math.random() * 6) + 1; //devolvemos entre 1 y 6
        revolver.setPosicionActual(pos);
        Integer pos2 = (int) (Math.random() * 6) + 1; //devolvemos entre 1 y 6
        revolver.setPosicionAgua(pos2);
        return revolver;
    }
}
