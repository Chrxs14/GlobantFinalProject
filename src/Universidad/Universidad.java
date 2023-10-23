package Universidad;

import Personas.Estudiante;
import Personas.Profesor;

import java.util.ArrayList;
import java.util.List;
public class Universidad {
    private List<Profesor> profesores;
    private List<Estudiante> estudiantes;
    private List<Clase> clases;

    public Universidad(){
        profesores = new ArrayList<>();
        estudiantes = new ArrayList<>();
        clases = new ArrayList<>();
    }
}
