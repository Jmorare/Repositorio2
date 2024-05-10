/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subs.twitch;
import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class SubsTwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mostramos el mensaje de presentacion del canal
        System.out.println("Hola, mi canal de twitch es Paquito92 y voy a jugar a videojuegos y hacer vlogs. Espero que os guste!!");
        
        //Declaro variables
        int subs;
        int ganancias;

        int entornos;
        
        //Pido el numero de subs por consola y se calcula la ganancia
        System.out.println("Cuantos subs tengo?");
        Scanner leer = new Scanner(System.in);
        subs = leer.nextInt();
        
        ganancias = subs * 3;
        
        //Realizamos las condiciones de dinero e imprimimos por pantalla
        
        if (ganancias >=0 && ganancias <=1200) {
            System.out.println("Eres pobre, tus ganacias son: " + ganancias + " euros");
        } else if (ganancias > 1200 && ganancias <=2000) {
            System.out.println("Puedes vivir de Twitch, tus ganacias son: " + ganancias + " euros");
        } else if (ganancias > 2000 && ganancias <=5000) {
            System.out.println("Sos medio rico boludo, tus ganacias son: " + ganancias + " euros");
        } else if (ganancias<0) {
            System.out.println("Como vas a tener subs negativos y ganar " + ganancias + " euros");    
        } else {
            System.out.println("A vivir a Andorra, adios, tus ganancias son: " + ganancias + " euros");
        } 
        

    }
    
}
