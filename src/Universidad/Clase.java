package Universidad;

import Personas.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Clase {
    private String nombre;
    private String aula;
    private List<Estudiante> estudiantes = new ArrayList<Estudiante>();

    public Clase(String nombre, String aula) {
        this.nombre = nombre;
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
}
