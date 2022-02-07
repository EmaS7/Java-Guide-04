/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej2;


/*
  @author $EmaS7
 */
public class RevolverAgua {
    private Integer posicionActual;
    private Integer posicionAgua;

    public RevolverAgua() {

    }

    public RevolverAgua(Integer posicionActual, Integer posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    
    public void llenarRevolver(){
        posicionActual = (int)(Math.random()*6+1);
        posicionAgua = (int)(Math.random()*6+1);
    }
    public boolean mojar(){
        if(posicionAgua == posicionActual){
            return true;
        }else
            return false;
    }
    public void siguienteChorro(){
        posicionActual+=1;
    }

    @Override
    public String toString() {
        return "Posicion Actual = " + posicionActual + "\nPosicion del Agua = " + posicionAgua;
    }
    

}
