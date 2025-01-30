package es.ies.packages.model;

public class Diseniador extends Empleado {
private int bonus;
    public Diseniador() {
        super();
    }
    public Diseniador(String identificador){
        super(identificador);
    }
    public Diseniador(String nombre, int edad, String identificador, double salarioBase){
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
