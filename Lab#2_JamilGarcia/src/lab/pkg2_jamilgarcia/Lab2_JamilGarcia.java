package lab.pkg2_jamilgarcia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_JamilGarcia {

    static Scanner jg = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args) {
        //Preparacion de variables
        ArrayList per = new ArrayList();
        //Generacion de los personajes predefinidos
        
        
        char resp = 's';
        while (resp == 's'){
            
            System.out.println("Menu: ");
            System.out.println("1. Creacion de Personajes ");
            System.out.println("2. Modificar Personajes");
            System.out.println("3. Ver Atributos de un Personaje");
            System.out.println("4. Eliminar Personaje");
            System.out.println("5. Combate");
            System.out.println("0. Salir");
            System.out.println();
            System.out.println("Ingrese una opcion: ");
            int opcion = jg.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa. ");
                    resp = 'n';
                    break;
                default:
                    System.out.println("Ingrese un valor correcto!!!");;
            }
        }
    }
    
}
