import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("----- Globant University -----");
            System.out.println("[1] Imprimir todos los profesores con sus datos.");
            System.out.println("[2] Imprimir todas las clases.");
            System.out.println("[3] Crear un nuevo estudiante.");
            System.out.println("[4] Crear una nueva clase.");
            System.out.println("[5] Enumerar todas las clases por estudiante.");
            System.out.println("[0] Salir");
            System.out.print("----- Ingrese su opcion: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("----- Profesores registrados -----");
                    break;
                case 2:
                    System.out.println("----- Clases -----");
                    break;
                case 3:
                    System.out.println("----- Crear un nuevo estudiante -----");
                    break;
                case 4:
                    System.out.println("----- Crear una nueva clase. -----");
                    break;
                case 5:
                    System.out.println("----- Consulta de clases registradas por estudiante -----");
                    break;
                case 0:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
            }
        }while(opcion != 0);
    }
}