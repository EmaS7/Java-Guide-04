/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej3;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.*;


/*
  @author $EmaS7
 */
public class ServiceCarta {
    static Scanner read = new Scanner(System.in);
   //ArrayList<Cartas> barajas = new ArrayList();
    
    public static void crear(ArrayList<Cartas> cartas){
        for (Palo pal : Palo.values()) {
            for (Numero num: Numero.values()) {
                cartas.add(new Cartas(num, pal));
            }
        }
    }
    public static void barajar(ArrayList<Cartas> cartas){
        Random r = new Random();
        Collections.shuffle(cartas, r);
        System.out.println("Cartas mezcladas!");
    }
    public static void siguienteCarta(ArrayList<Cartas> cartas, ArrayList<Cartas> cartasdadas){
        Iterator it = cartas.iterator();
       // Iterator it2 = cartasdadas.iterator();
        if(it.hasNext()){
            System.out.println("Carta dada: "+it.next());
            cartasdadas.add((Cartas) cartasdadas.iterator());
        }else{
            System.out.println("No hay mas cartas :c");
        }
    }
    public static void cartasDisponibles(ArrayList<Cartas> cartas){
        System.out.println("Cartas disponibles: "+cartas.size());
    }
    public static void darCartas(ArrayList<Cartas> cartas, Integer cantidad, ArrayList<Cartas> cartasdadas){
        if(cantidad<cartas.size()){
            for (int i = 0; i < cantidad; i++) {
                cartasdadas.add(cartas.get(i));
                System.out.println(cartas);
            }
        }else
            System.out.println("Hay menos cartas de las solicitadas");
    }
    public static void cartasMonton(ArrayList<Cartas> cartasdadas){
        System.out.println("Cartas que ya han salido: ");
        for (Cartas aux : cartasdadas) {
            System.out.println(aux);
        }
    }
    public static void mostrarBaraja(ArrayList<Cartas> cartas){
        System.out.println("Baraja entera");
        for (Cartas aux : cartas) {
            System.out.println(aux);
        }
    }
    public static void menu(ArrayList<Cartas> cartas,ArrayList<Cartas> cartasdadas) throws AWTException{
        int opc;
        do{
        System.out.println("Que desea hacer?");
        System.out.println("1)Barajar cartas");
        System.out.println("2)Pedir una carta");
        System.out.println("3)Mostrar numero de cartas disponibles");
        System.out.println("4)Pedir una cantidad especifica de cartas");
        System.out.println("5)Mostrar cartas pedidas");
        System.out.println("6) Mostrar barajas(Excepto las pedidas");
        opc = read.nextInt();
        switch(opc){
            case 1: 
                barajar(cartas);
                break;
            case 2:
                siguienteCarta(cartas,cartasdadas);
                break;
            case 3:
                cartasDisponibles(cartas);
                break;
            case 4:
                System.out.println("Cuantas cartas quieres pedir?(40 max): ");
                Integer cantidad = read.nextInt();
                darCartas(cartas,cantidad, cartasdadas);
                break;
            case 5:
                cartasMonton(cartasdadas);
                break;
            case 6:
                mostrarBaraja(cartas);
                break;
            case 7:
                System.out.println("Saliendo...");
        }
        limpiar();
        }while(opc!=7);  
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
}
