

package Ej3;

import java.awt.AWTException;
import java.util.*;

/**
 *
 * @author $EmaS7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        ArrayList<Cartas> cartas = new ArrayList();
        ArrayList<Cartas> cartasDadas = new ArrayList();
        Cartas c = new Cartas();
        
        ServiceCarta.menu(cartas, cartasDadas);
        

    }

}
