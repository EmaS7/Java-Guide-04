/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/

/*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
va a tener que contar con muchas personas y muchos perros. El programa deberá
preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/

package Ej1;

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
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
//
//        String resp;
//       do{
//          Persona p = new Persona();
//          ServiceAdopcion.creaPersonas(p);
//          personas.add(p);
//          System.out.println("Desea aniadir otra persona s/n: "); resp = read.next();
//        }while(resp.equalsIgnoreCase("s"));
// 
//        for (Persona aux : personas) {
//            System.out.println(aux.toString());
//        }
//        do{
//           Perro perro = new Perro();
//           ServiceAdopcion.creaPerro(perro);
//           perros.add(perro);
//           System.out.println("Desea aniadir otro perro? s/n: "); resp = read.next();
//        }while(resp.equalsIgnoreCase("s"));
//        ServiceAdopcion.muestraPersonas(personas);
//        ServiceAdopcion.muestraPerros(perros);
//        ServiceAdopcion.limpiar();
//    }

      Perro perro1 = new Perro();
      Perro perro2 = new Perro();
      Persona pers1 = new Persona();
      Persona pers2 = new Persona();
      
      



    }

}
