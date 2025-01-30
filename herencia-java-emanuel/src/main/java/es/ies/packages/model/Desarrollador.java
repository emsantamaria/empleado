package es.ies.packages.model;

public class Desarrollador extends Empleado {
private int bonus;
    public Desarrollador() {
        super();
    }
    public Desarrollador(String identificador){
        super(identificador);
    }
    public Desarrollador(String nombre, int edad, String identificador, double salarioBase){
        super(nombre, edad, identificador, salarioBase);
        this.bonus=20;
    }  

    public Desarrollador(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Desarrollador bonus(int bonus) {
        setBonus(bonus);
        return this;
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
