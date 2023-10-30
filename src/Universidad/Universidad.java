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

    public void mostrarClases(){
        if(clases.size() == 0){
            System.out.println("----- No hay clases registradas... -----");
        }
        for(Clase clase: clases){
            System.out.println("Nombre: " + clase.getNombre());
            System.out.println("Aula: " + clase.getAula());

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

    public void addClase(){
        Scanner datos = new Scanner(System.in);
        String nombre;
        String aula;
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        System.out.println("Ingrese su nombre: ");
        nombre = datos.nextLine();
        System.out.println("Ingrese su aula: ");
        aula = datos.nextLine();

        Clase clase = new Clase(nombre,aula);
        clases.add(clase);
    }
    public void defaultValues(){
        Profesor profesor1 = new Profesor("Chris","899998989",20,300,1,true);
        Profesor profesor2 = new Profesor("Mark","89912331298989",24,600,5,true);

        profesores.add(profesor1);
        profesores.add(profesor2);

        Estudiante estudiante1 = new Estudiante("Christopher","989898980",20);
        Estudiante estudiante2 = new Estudiante("Jazmin","989898980",20);
        Estudiante estudiante3 = new Estudiante("Joel","989898980",20);
        Estudiante estudiante4 = new Estudiante("Felipe","989898980",20);
        Estudiante estudiante5 = new Estudiante("Antonio","989898980",20);
        Estudiante estudiante6 = new Estudiante("Mark","989898980",20);
        Estudiante estudiante7 = new Estudiante("Omar","989898980",20);

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);
        estudiantes.add(estudiante6);

        Clase clase1 = new Clase("CLASE1","203");
        Clase clase2 = new Clase("CLASE2","204");
        Clase clase3 = new Clase("CLASE3","205");
        Clase clase4 = new Clase("CLASE3","207");

        clases.add(clase1);
        clases.add(clase2);
        clases.add(clase3);
        clases.add(clase4);

        clase1.addEstudiante(estudiante1);
        clase1.addEstudiante(estudiante2);

        clase2.addEstudiante(estudiante3);
        clase2.addEstudiante(estudiante4);

        clase3.addEstudiante(estudiante5);
        clase3.addEstudiante(estudiante6);

        clase4.addEstudiante(estudiante7);
        clase4.addEstudiante(estudiante1);
    }
}


