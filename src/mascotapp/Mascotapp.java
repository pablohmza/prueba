/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;
import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author Pablo
 */
public class Mascotapp {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ServicioMascota sm = new ServicioMascota();

        Mascota pichicho1 = sm.crearMascota();

        System.out.println(pichicho1.toString());

       

    }

}
