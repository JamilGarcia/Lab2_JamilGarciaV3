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
        
        //Personaje 1
        per.add(new Personajes());
        ((Personajes) per.get(0)).setTipo("Clerigo");
        ((Personajes) per.get(0)).setNombre("Clerigo Maestro");
        ((Personajes) per.get(0)).setRaza("Humano");
        ((Personajes) per.get(0)).setEstatura(1.80);
        ((Personajes) per.get(0)).setPeso(140.56);
        ((Personajes) per.get(0)).setAños(34);
        ((Personajes) per.get(0)).setDescripcion("Tal como su nombre lo dice, es un Clerigo Maestro, yo que tu no lo subestimaria, no sabemos si tiene trucos bajo la manga");
        ((Personajes) per.get(0)).setNacion("Zebes");
        ((Personajes) per.get(0)).setHP(50);
        ((Personajes) per.get(0)).setCS(97);
        ((Personajes) per.get(0)).setAC(40);
        
        //Personaje 2
        per.add(new Personajes());
        ((Personajes) per.get(1)).setTipo("Barbaro");
        ((Personajes) per.get(1)).setNombre("Barabro Enrrabiado");
        ((Personajes) per.get(1)).setRaza("Enano");
        ((Personajes) per.get(1)).setEstatura(1.30);
        ((Personajes) per.get(1)).setPeso(80.96);
        ((Personajes) per.get(1)).setAños(27);
        ((Personajes) per.get(1)).setDescripcion("Será un enano pero por su altura, juventud, peso y rabiadez su agilidad es muy buena, ten cuidado!!!");
        ((Personajes) per.get(1)).setNacion("Norfair");
        ((Personajes) per.get(1)).setHP(50);
        ((Personajes) per.get(1)).setCS(93);
        ((Personajes) per.get(1)).setAC(65);
        
        //Personaje 3
        per.add(new Personajes());
        ((Personajes) per.get(2)).setTipo("Mago");
        ((Personajes) per.get(2)).setNombre("MessiGishian");
        ((Personajes) per.get(2)).setRaza("Mediano");
        ((Personajes) per.get(2)).setEstatura(1.73);
        ((Personajes) per.get(2)).setPeso(134.90);
        ((Personajes) per.get(2)).setAños(32);
        ((Personajes) per.get(2)).setDescripcion("Si es un mago, si es uno de los mejores del mundo, ten cuidado su habilidad de sus pies no es algo que cualquier defensa pueda controlar");
        ((Personajes) per.get(2)).setNacion("Crateria");
        ((Personajes) per.get(2)).setHP(56);
        ((Personajes) per.get(2)).setCS(101);
        ((Personajes) per.get(2)).setAC(20);
        
        //Personaje 4
        per.add(new Personajes());
        ((Personajes) per.get(3)).setTipo("Picaro");
        ((Personajes) per.get(3)).setNombre("Él...");
        ((Personajes) per.get(3)).setRaza("Elfo");
        ((Personajes) per.get(3)).setEstatura(2.30);
        ((Personajes) per.get(3)).setPeso(200.99);
        ((Personajes) per.get(3)).setAños(68);
        ((Personajes) per.get(3)).setDescripcion("Él simplemente es Él, no necesita Presentacion, solo teme");
        ((Personajes) per.get(3)).setNacion("Brinstar");
        ((Personajes) per.get(3)).setHP(70);
        ((Personajes) per.get(3)).setCS(80);
        ((Personajes) per.get(3)).setAC(50);
        
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
