package SocialNetwork;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {


    public static void main(String[] args) {

        JFrame ventana = new JFrame("JAVAGRAM");

        ventana.setSize(1200,800);

        ventana.setLocationRelativeTo(null);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setVisible(true);

    }








    /**
     * Crea un menu al iniciar el programa con el que Usuario puede interactuar con la red social
     * @param sn SocianNetwork (abreviado en sn)
     */
    public static void menu(Socialnetwork sn) {
        Scanner scan = new Scanner(System.in); // Scanner para la opcion del Usuario activo
        Usuario usuarioActivo = sn.getUsuarioActivo().get(0); // se obtiene al Usuario activo
        boolean salir = false; //Condicion para mantener el ciclo while mientras el Usuario activo selecciona una opcion correcta

        while(!salir) {

            System.out.println("\n ### BIENVENIDO A JAVAGRAM ### ");
            System.out.println("\n\t## Registrado como: " + usuarioActivo.getNombre() + " ##");
            System.out.println("\n\tEscoja su opcion: ");
            System.out.println("\t1. Realizar publicacion");
            System.out.println("\t2. Seguir a un usuario ");
            System.out.println("\t3. Compartir publicacion ");
            System.out.println("\t4. Realizar comentario ");
            System.out.println("\t5. Realizar un ME GUSTA ");
            System.out.println("\t6. Visualizar red social ");
            System.out.println("\t7. Cerrar sesion ");
            System.out.println("\t8. Salir del programa \n ");
            System.out.println("\tINTRODUZCA SU OPCION: \n");

            try {
                int opcion = scan.nextInt(); // Se escanea la opcion del usuario activo
                switch(opcion) {
                    case 1: // Opcion Realizar publicacion
                        System.out.println("\n\n--> Ha elegido la opcion Realizar publicacion <--");
                        usuarioActivo.post(sn);
                        break;
                    case 2: // Opcion Seguir a un usuario
                        System.out.println("--> Ha elegido la opcion Seguir a un usuario <--");
                        usuarioActivo.follow(sn);
                        break;
                    case 3: // Opcion Compartir publicacion
                        System.out.println("--> Ha elegido la opcion Compartir publicacion <--");
                        usuarioActivo.share(sn);
                        break;
                    case 4: // Opcion Realizar comentario
                        System.out.println("--> Ha elegido la opcion Realizar un Comentario <--");
                        usuarioActivo.comment(sn);
                        break;
                    case 5: // Opcion Realizar un ME GUSTA
                        System.out.println("--> Ha elegido la opcion Realizar un ME GUSTA <--");
                        usuarioActivo.like(sn);
                        break;
                    case 6: // Opcion Visualizar red social
                        System.out.println("--> Ha elegido la opcion Visualizar red social <--\n\n");
                        usuarioActivo.PrintSocialNetwork(sn);
                        break;
                    case 7: // Opcion Cerrar sesion
                        System.out.println("\n\n--> Ha elegido la opcion Cerrar sesion <--\n\n");
                        usuarioActivo.logout(sn);
                        salir = true; // Se interrumpe el ciclo while
                        break;
                    case 8:
                        System.out.println("--> Ha elegido la opcion Salir del programa <--");
                        System.exit(0); // El programa termina de ejecutarse
                        break;
                    default: // Muestra error si Usuario activo escoje un numero no valido en las opciones
                        System.out.println("\n*****  Ingrese un numero entre 1 y 8 *****");
                    }
                } catch (InputMismatchException fail) {  // Muestra error si Usuario activo no ingresa un numero
                    System.out.println("\n***** Debe ingresar un numero *****");
                    scan.next();
                }
            }
        }



    }







