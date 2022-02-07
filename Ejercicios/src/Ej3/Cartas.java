/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej3;


/*
  @author $EmaS7
 */
public class Cartas {
    protected Numero numero;
    protected Palo palo;

    public Cartas() {
    }

    public Cartas(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta:" + "\nNumero = " + numero + "\nPalo = " + palo;
    }
    
    

}
