package Personas;

public class Profesor extends Persona{
    private double salarioB;
    private int aniosDeExperiencia;
    private boolean tiempoCompleto; //Medio tiempo o tiempo completo

    public Profesor() {
    }

    public Profesor(String nombre, String identificacion, int edad, double salarioB, int aniosDeExperiencia, boolean tiempoCompleto) {
        super(nombre, identificacion, edad);
        this.salarioB = salarioB;
        this.aniosDeExperiencia = aniosDeExperiencia;
        this.tiempoCompleto = tiempoCompleto;
    }

    public double getSalarioB() {
        return salarioB;
    }

    public void setSalarioB(double salarioB) {
        this.salarioB = salarioB;
    }

    public int getAniosDeExperiencia() {
        return aniosDeExperiencia;
    }

    public void setAniosDeExperiencia(int aniosDeExperiencia) {
        this.aniosDeExperiencia = aniosDeExperiencia;
    }

    public boolean isTiempoCompleto() {
        return tiempoCompleto;
    }

    public void setTiempoCompleto(boolean tiempoCompleto) {
        this.tiempoCompleto = tiempoCompleto;
    }
}
