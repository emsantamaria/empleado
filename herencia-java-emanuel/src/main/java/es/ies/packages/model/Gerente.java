package es.ies.packages.model;

public class Gerente extends Empleado{
    private int bonus;
    public Gerente() {
        super();
    }
    public Gerente(String identificador){
        super(identificador);
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

    public Gerente(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Gerente bonus(int bonus) {
        setBonus(bonus);
        return this;
    }
}
