package es.ies;

public class Gerente extends Empleado{
    private int bonus;
    public Gerente() {
        super();
    }
    public Gerente(String nombre, int edad, String identificador, double salarioBase){
        super(nombre, edad, identificador, salarioBase);
        this.bonus=30;
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
