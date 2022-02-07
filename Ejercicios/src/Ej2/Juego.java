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
public class Juego {
    private ArrayList<Jugador> jugadores = new ArrayList();
    private RevolverAgua revolver;
   // private Jugador j;

    public Juego() {
    }

    public Juego(ArrayList<Jugador>jugadores, RevolverAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.jugadores);
        hash = 23 * hash + Objects.hashCode(this.revolver);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juego other = (Juego) obj;
        if (!Objects.equals(this.jugadores, other.jugadores)) {
            return false;
        }
        if (!Objects.equals(this.revolver, other.revolver)) {
            return false;
        }
        return true;
    }

    
//    public void llenarJuego(ArrayList<Jugador>jugadores,RevolverAgua r){
//        int numPlayers; Scanner read = new Scanner(System.in).useDelimiter("\n");
//        int i=1; //Jugador j=null;
//        System.out.println("Ingrese la cantidad de jugadores(Min:2 - Max:6"); numPlayers = read.nextInt();
//        if(numPlayers>6){
//            numPlayers = 6;
//        }
//        do{
//           System.out.println("Ingreses los datos del jugador "+i);
//           System.out.println("Nombre: "); j.setJugador(read.next());
//           j.setId("Jugador"+i); j.setMojado(false);
//           i+=1;
//    } while(i>numPlayers); 
//}

    
    @Override
    public String toString() {
        return "Juego - jugadores= " + jugadores + "\nRevolver= " + revolver;
    }
    
    

}
