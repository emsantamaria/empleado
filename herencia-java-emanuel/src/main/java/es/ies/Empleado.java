package es.ies;
import java.util.Objects;

public abstract class Empleado  {
    private String nombre;
    private int edad; 
    private String identificador;
    private double salarioBase;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, String identificador, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificador = identificador;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Empleado nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Empleado edad(int edad) {
        setEdad(edad);
        return this;
    }

    public Empleado identificador(String identificador) {
        setIdentificador(identificador);
        return this;
    }

    public Empleado salarioBase(double salarioBase) {
        setSalarioBase(salarioBase);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return Objects.equals(identificador, empleado.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, identificador, salarioBase);
    }
    /**
     * Metodo que permite calcular el salario final de un empleado
     * @return salariofinal
     */
    public abstract double calcularSalarioFinal();
    /**
     * Metodo que permite mostrar informacion
     * @return toString()
     */
    public String mostrarInformacion(){
        return toString();
    }
    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            ", identificador='" + getIdentificador() + "'" +
            ", salarioBase='" + getSalarioBase() + "'" +
            "}";
    }
    
}
