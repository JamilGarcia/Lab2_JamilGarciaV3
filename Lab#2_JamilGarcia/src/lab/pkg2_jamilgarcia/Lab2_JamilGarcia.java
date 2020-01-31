package lab.pkg2_jamilgarcia;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab2_JamilGarcia {

    static Scanner jg = new Scanner(System.in);
    static Random r = new Random();
    static ArrayList per = new ArrayList();

    public static void main(String[] args) {
        //Preparacion de variables

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

        while (resp == 's') {

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
                    String Tipo = " ";
                    String Nombre = " ";
                    String Raza = " ";
                    double Estatura = 0.00;
                    double Peso = 0.00;
                    int Años = 0;
                    String Descripcion = " ";
                    String Nacion = " ";
                    int HP = 0;
                    int CS = 0;
                    int AC = 0;
                    System.out.println("Elige un tipo de personaje: ");
                    System.out.println("1. Clerigo");
                    System.out.println("2. Barbaro");
                    System.out.println("3. Mago");
                    System.out.println("4. Picaro");
                    int tip = jg.nextInt();

                    switch (tip) {
                        case 1:
                            Tipo = "Clerigo";
                            CS = 97;
                            AC = 40;
                            break;
                        case 2:
                            Tipo = "Barbaro";
                            CS = 93;
                            AC = 65;
                            break;
                        case 3:
                            Tipo = "Mago";
                            CS = 101;
                            AC = 20;
                            break;
                        case 4:
                            Tipo = "Picaro";
                            CS = 80;
                            AC = 50;
                            break;
                        default:
                            System.out.println("Entrada erronea");
                            break;
                    }
                    System.out.println();
                    System.out.println("Nombre del personaje: ");
                    Nombre = jg.nextLine();
                    Nombre = jg.nextLine();

                    System.out.println("Elige una raza: ");
                    System.out.println("1. Mediano");
                    System.out.println("2. Enano");
                    System.out.println("3. Elfo");
                    System.out.println("4. Humano");
                    int raz = jg.nextInt();

                    switch (raz) {
                        case 1:
                            Raza = "Mediano";
                            HP = 50 + r.nextInt(60);
                            break;
                        case 2:
                            Raza = "Enano";
                            HP = 80 + r.nextInt(100);
                            break;
                        case 3:
                            Raza = "Elfo";
                            HP = 50 + r.nextInt(70);
                            break;
                        case 4:
                            Raza = "Humano";
                            HP = 40 + r.nextInt(75);
                            break;
                        default:
                            System.out.println("Entrada erronea");
                            break;
                    }
                    System.out.println();
                    System.out.println("Ingrese la estatura: ");
                    Estatura = jg.nextDouble();

                    System.out.println();
                    System.out.println("Ingrese el peso: ");
                    Peso = jg.nextDouble();

                    System.out.println();
                    System.out.println("Escriba una descripcion: ");
                    Descripcion = jg.nextLine();
                    Descripcion = jg.nextLine();

                    System.out.println();
                    System.out.println("Escriba la edad del personaje: ");
                    Años = jg.nextInt();

                    System.out.println("Elige una nacionalidad: ");
                    System.out.println("1. Norfair");
                    System.out.println("2. Brinstar");
                    System.out.println("3. Maridia");
                    System.out.println("4. Zebes");
                    System.out.println("5. Crateria");
                    System.out.println();
                    int Nacionalidad = jg.nextInt();
                    switch (Nacionalidad) {
                        case 1:
                            Nacion = "Norfair";
                            break;
                        case 2:
                            Nacion = "Brinstar";
                            break;
                        case 3:
                            Nacion = "Maridia";
                            break;
                        case 4:
                            Nacion = "Zebes";
                            break;
                        case 5:
                            Nacion = "Crateria";
                            break;
                        default:
                            System.out.println("Entrada incorrecta");
                            break;
                    }
                    per.add(new Personajes(Tipo, Nombre, Raza, Estatura, Peso, Años, Descripcion, Nacion, HP, CS, AC));
                    break;
                case 2:
                    Tipo = " ";
                    Nombre = " ";
                    Raza = " ";
                    Estatura = 0.00;
                    Peso = 0.00;
                    Años = 0;
                    Descripcion = " ";
                    Nacion = " ";
                    HP = 0;
                    CS = 0;
                    AC = 0;
                    System.out.println("Ingrese el numero de personaje que quiere editar: ");
                    int i = jg.nextInt();
                    System.out.println("Elige un tipo de personaje: ");
                    System.out.println("1. Clerigo");
                    System.out.println("2. Barbaro");
                    System.out.println("3. Mago");
                    System.out.println("4. Picaro");
                    tip = jg.nextInt();

                    switch (tip) {
                        case 1:
                            Tipo = "Clerigo";
                            CS = 97;
                            AC = 40;
                            break;
                        case 2:
                            Tipo = "Barbaro";
                            CS = 93;
                            AC = 65;
                            break;
                        case 3:
                            Tipo = "Mago";
                            CS = 101;
                            AC = 20;
                            break;
                        case 4:
                            Tipo = "Picaro";
                            CS = 80;
                            AC = 50;
                            break;
                        default:
                            System.out.println("Entrada erronea");
                            break;
                    }
                    System.out.println();
                    System.out.println("Nombre del personaje: ");
                    Nombre = jg.nextLine();
                    Nombre = jg.nextLine();

                    System.out.println("Elige una raza: ");
                    System.out.println("1. Mediano");
                    System.out.println("2. Enano");
                    System.out.println("3. Elfo");
                    System.out.println("4. Humano");
                    raz = jg.nextInt();

                    switch (raz) {
                        case 1:
                            Raza = "Mediano";
                            HP = 50 + r.nextInt(60);
                            break;
                        case 2:
                            Raza = "Enano";
                            HP = 80 + r.nextInt(100);
                            break;
                        case 3:
                            Raza = "Elfo";
                            HP = 50 + r.nextInt(70);
                            break;
                        case 4:
                            Raza = "Humano";
                            HP = 40 + r.nextInt(75);
                            break;
                        default:
                            System.out.println("Entrada erronea");
                            break;
                    }
                    System.out.println();
                    System.out.println("Ingrese la estatura: ");
                    Estatura = jg.nextDouble();

                    System.out.println();
                    System.out.println("Ingrese el peso: ");
                    Peso = jg.nextDouble();

                    System.out.println();
                    System.out.println("Escriba una descripcion: ");
                    Descripcion = jg.nextLine();
                    Descripcion = jg.nextLine();

                    System.out.println();
                    System.out.println("Escriba la edad del personaje: ");
                    Años = jg.nextInt();

                    System.out.println("Elige una nacionalidad: ");
                    System.out.println("1. Norfair");
                    System.out.println("2. Brinstar");
                    System.out.println("3. Maridia");
                    System.out.println("4. Zebes");
                    System.out.println("5. Crateria");
                    System.out.println();
                    Nacionalidad = jg.nextInt();
                    switch (Nacionalidad) {
                        case 1:
                            Nacion = "Norfair";
                            break;
                        case 2:
                            Nacion = "Brinstar";
                            break;
                        case 3:
                            Nacion = "Maridia";
                            break;
                        case 4:
                            Nacion = "Zebes";
                            break;
                        case 5:
                            Nacion = "Crateria";
                            break;
                        default:
                            System.out.println("Entrada incorrecta");
                            break;
                    }
                    ((Personajes) per.get(i)).setAC(AC);
                    ((Personajes) per.get(i)).setAños(Años);
                    ((Personajes) per.get(i)).setCS(CS);
                    ((Personajes) per.get(i)).setDescripcion(Descripcion);
                    ((Personajes) per.get(i)).setEstatura(Estatura);
                    ((Personajes) per.get(i)).setHP(HP);
                    ((Personajes) per.get(i)).setNacion(Nacion);
                    ((Personajes) per.get(i)).setNombre(Nombre);
                    ((Personajes) per.get(i)).setPeso(Peso);
                    ((Personajes) per.get(i)).setRaza(Raza);
                    ((Personajes) per.get(i)).setTipo(Tipo);

                    break;
                case 3:
                    for (int j = 0; j < per.size(); j++) {
                        System.out.println();
                        System.out.println(j + 1 + ".- " + per.get(j));
                    }
                    break;
                case 4:
                    System.out.println("Elija el numero de personaje que desea borrar: ");
                    int borrar = jg.nextInt();
                    per.remove(borrar);
                    break;
                case 5:
                    int desc,
                     desc2,
                     ran,
                     DG,
                     hp,
                     cs,
                     ranC;
                    boolean Combat = true;
                    System.out.println("Ingrese el numero de personaje que desea usar: ");
                    int person = jg.nextInt();
                    int person2 = r.nextInt(per.size());
                    while (Combat == true) {
                        System.out.println("Elige:");
                        System.out.println("1. Atacar");
                        System.out.println("2. Defender");
                        desc = jg.nextInt();

                        switch (desc) {
                            case 1:
                                System.out.println("Atacando: ");
                                ran = r.nextInt(100);
                                if (ran > ((Personajes) per.get(person2)).getAC()) {
                                    System.out.println("Acierto");
                                    DG = 5 + r.nextInt(30);
                                    hp = ((Personajes) per.get(person2)).getHP();
                                    cs = ((Personajes) per.get(person2)).getCS();
                                    if (cs < DG) {
                                        System.out.println("Critico");
                                        hp = hp - DG * 2;
                                    } else {
                                        hp = hp - DG;
                                        ((Personajes) per.get(person2)).setHP(hp);
                                    }
                                    if (hp < 0) {
                                        System.out.println("Haz ganado");
                                        Combat = false;
                                    }
                                } else {
                                    System.out.println("Fallo");
                                }
                                break;
                            case 2:
                                System.out.println("Defendiendo: ");
                                hp = ((Personajes) per.get(person)).getHP();
                                hp = hp + 15;
                                ((Personajes) per.get(person)).setHP(hp);
                                break;
                        }

                        System.out.println(per.get(person));

                        System.out.println("Turno de la compuatdora: ");
                        desc2 = r.nextInt(3);
                        switch (desc2) {
                            case 1:
                                System.out.println("Atacando: ");
                                ran = r.nextInt(100);
                                if (ran > ((Personajes) per.get(person)).getAC()) {
                                    System.out.println("Acierto");
                                    DG = 5 + r.nextInt(30);
                                    hp = ((Personajes) per.get(person)).getHP();
                                    cs = ((Personajes) per.get(person)).getCS();
                                    if (cs < DG) {
                                        System.out.println("Critico");
                                        hp = hp - DG * 2;
                                    } else {
                                        hp = hp - DG;
                                        ((Personajes) per.get(person2)).setHP(hp);
                                    }
                                    if (hp < 0) {
                                        System.out.println("Haz perdido");
                                        Combat = false;
                                    }
                                } else {
                                    System.out.println("Fallo");
                                }
                                break;
                            case 2:
                                System.out.println("Defendiendo: ");
                                hp = ((Personajes) per.get(person2)).getHP();
                                hp = hp + 15;
                                ((Personajes) per.get(person2)).setHP(hp);
                                break;
                        }

                        System.out.println(per.get(person2));

                    }
                    break;
                case 0:
                    System.out.println("Gracias por usar el programa. ");
                    resp = 'n';
                    break;
                default:
                    System.out.println("Ingrese un valor correcto!!!");
                    ;
            }
        }
    }

}
