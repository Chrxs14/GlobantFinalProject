package Universidad;

import Personas.Estudiante;
import Personas.Profesor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.FileWriter;
import java.io.IOException;

public class Universidad {
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;
    private List<Clase> clases;
    private Scanner sc = new Scanner(System.in);

    public Universidad(){
        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();
        clases = new ArrayList<>();
    }

    public void mostrarProfesores(){
        if(profesores.size() == 0){
            System.out.println("----- No hay profesores registrados... -----");
        }
        for(Profesor profesor: profesores){
            System.out.println("Nombre: " + profesor.getNombre());
            System.out.println("Identificacion: " + profesor.getIdentificacion());
            System.out.println("Edad: " + profesor.getEdad());
            System.out.println("Años de experiencia: " + profesor.getAniosDeExperiencia());
            System.out.println("Salario: " + profesor.getSalarioB());
            System.out.println("Tiempo completo: "+ profesor.isTiempoCompleto());
        }
    }

    public void addEstudiante(){
        Scanner datos = new Scanner(System.in);
        String nombre;
        String identificacion;
        int edad;

        System.out.println("Ingrese su nombre: ");
        nombre = datos.nextLine();
        System.out.println("Ingrese su identificacion: ");
        identificacion = datos.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = datos.nextInt();

        Estudiante estudiante = new Estudiante(nombre,identificacion, edad);
        estudiantes.add(estudiante);
    }

    public void addProfesor(){
        Scanner datos = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        String nombre;
        String identificacion;
        int edad;
        double salarioB;
        int aniosDeExperiencia;
        boolean tiempoCompleto;
        String opcion;

        System.out.println("Ingrese su nombre: ");
        nombre = datos.nextLine();
        System.out.println("Ingrese su identificacion: ");
        identificacion = datos.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = datos.nextInt();
        System.out.println("Ingrese el salario: ");
        salarioB = datos.nextDouble();
        System.out.println("Ingrese los años de experiencia: ");
        aniosDeExperiencia = datos.nextInt();
        System.out.println("¿Es tiempo completo? [s/n]: ");
        opcion = op.nextLine();

        if(opcion.equals("s")){
            tiempoCompleto = true;
        }else{
            tiempoCompleto = false;

        }

        Profesor profesor = new Profesor(nombre,identificacion, edad,salarioB,aniosDeExperiencia,tiempoCompleto);
        profesores.add(profesor);



    }
}
