package Universidad;

import Personas.Estudiante;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public Menu() {
    }

    public void mostrarMenu(Universidad u){
        u.defaultValues();

        int opcion;
        boolean exit = false;
        do{
            System.out.println("----- Globant University -----");
            System.out.println("[1] Imprimir todos los profesores con sus datos.");
            System.out.println("[2] Imprimir todas las clases.");
            System.out.println("[3] Registrar un nuevo estudiante.");
            System.out.println("[4] Registrar un nuevo profesor.");
            System.out.println("[5] Crear una nueva clase.");
            System.out.println("[0] Salir");

            System.out.print("----- Ingrese su opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("----- Profesores registrados -----");
                    u.mostrarProfesores();
                    exit = menuExit();
                    break;
                case 2:
                    System.out.println("----- Clases -----");
                    u.mostrarClases();
                    exit = menuExit();
                    break;
                case 3:
                    System.out.println("----- Registrar un nuevo estudiante -----");
                    u.addEstudiante();
                    exit = menuExit();
                    break;
                case 4:
                    System.out.println("----- Registrar un nuevo profesor -----");
                    u.addProfesor();
                    exit = menuExit();
                    break;
                case 5:
                    System.out.println("----- Crear una nueva clase. -----");
                    u.addClase();
                    exit = menuExit();
                    break;
                case 0:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("----- La opcion ingresada no es valida -----");
                    break;
            }

            if(exit){
                break;
            }else{
                continue;
            }

        }while(opcion != 0);
    }
    public Boolean menuExit(){
        int exit;
        System.out.println("[9] Regresar al menu principal");
        System.out.println("[0] Salir");
        System.out.print("----- Ingrese la opcion:");
        exit = sc.nextInt();
        do{
            switch (exit){
                case 0:
                    System.out.println("Cerrando programa...");
                    return true;
                case 9:
                    System.out.println("Regresando al menu principal...");
                    return false;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(true);
    }
}
