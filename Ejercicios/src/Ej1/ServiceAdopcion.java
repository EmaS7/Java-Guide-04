/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej1;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.*;

/*
  @author $EmaS7
 */
public class ServiceAdopcion {
    static Scanner read = new Scanner(System.in).useDelimiter("\n");
    static ArrayList<String> personas = new ArrayList();
    static ArrayList<String> perros = new ArrayList();
        
    public static Persona creaPersonas(Persona p){
        System.out.println("Ingrese el nombre: "); p.setNombre(read.next());
        System.out.println("Ingrese apellido: "); p.setApellido(read.next());
        System.out.println("Ingrese DNI: "); p.setDni(read.nextLong());
        return p;
    }
    
    public static Perro creaPerro(Perro p){
        System.out.println("Ingrese su nombre: "); p.setNombre(read.next());
        System.out.println("Ingrese su edad(en años): "); p.setEdad(read.nextInt());
        System.out.println("Ingrese su raza: "); p.setRaza(read.next());
        System.out.println("Ingrese su tamaño: "); p.setTamanio(read.next());
        p.setAdoptado(false);
        return p;
    }
    
    public static void muestraPersonas(ArrayList<Persona> p){
        System.out.println("Personas cargadas:");
        for (Persona aux : p) {
            System.out.println(aux.toString());
        }
    }
    public static void muestraPerros(ArrayList<Perro> p){
        System.out.println("Perros cargados:");
        for (Perro aux : p) {
            System.out.println(aux.toString());
        }
    }
    
    public static void preguntaPerro(ArrayList<Perro> perros, ArrayList<Persona> personas){
        String resp;
        Iterator it = perros.iterator();
        System.out.print("Personas\t\tPerros");
        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }
        for (Perro aux : perros) {
            System.out.println("\t\t"+aux.toString());
        }
        for (Persona per : personas) {
            System.out.println(per+"Seleccione un perro que quiere adoptar: "); resp = read.next();
            if(resp.equals(perros)){
                
                System.out.println("Perro ");
            }
        }
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


