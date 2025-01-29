package es.ies;

public class Diseñador extends Empleado {
private int bonus;
    public Diseñador() {
        super();
    }
    public Diseñador(String nombre, int edad, String identificador, double salarioBase){
        super(nombre, edad, identificador, salarioBase);
        this.bonus=10;
    }
    @Override
    public double calcularSalarioFinal() {
       if(this.bonus<0){
        return this.getSalarioBase();
       }
       double adicion=getSalarioBase()*bonus/100;
       return getSalarioBase()+adicion;
    }
}
