/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.

disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */

package Ej2;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Objects;


/*
  @author $EmaS7
 */
public class Jugador {
    private Integer id;
    private String nombre;
    protected boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String jugador, boolean mojado) {
        this.id = id;
        this.nombre = jugador;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String jugador) {
        this.nombre = jugador;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + (this.mojado ? 1 : 0);
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
        final Jugador other = (Jugador) obj;
        if (this.mojado != other.mojado) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    public boolean disparo(RevolverAgua r) throws AWTException{
        boolean mojado;
        r.llenarRevolver();
        System.out.println("Revolver lleno");
        limpiar();
        System.out.println("Disparo efectuado");
        mojado = r.mojar();
        r.siguienteChorro();
        if(mojado==false){
            return true;
        }else
            return false;
    }
    
    public static void limpiar() throws AWTException {
        System.out.println("\nPresione Enter para continuar..."); //si uso esto, no usar pressbot.delay
        new java.util.Scanner(System.in).nextLine(); //si uso esto, no usar pressbot.delay

        Robot pressbot = new Robot();
        pressbot.setAutoDelay(1);
        //pressbot.delay(10000); por si lo quiero tener automatico sin tocar tecla, sacar las dos primeras lineas
        pressbot.keyPress(17);//orden para apretar CTRL key
        pressbot.keyPress(76);//orden para apretar L key
        pressbot.keyRelease(17); //orden para soltar CTRL key
        pressbot.keyRelease(76); //orden para soltar  key
    }
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", jugador=" + nombre + ", mojadouwu=" + mojado + '}';
    }
    
    

}
