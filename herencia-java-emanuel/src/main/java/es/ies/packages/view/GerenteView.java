package es.ies.packages.view;

import es.ies.packages.model.Gerente;

public class GerenteView extends Gerente {
    private int bonus;
    public GerenteView() {
        super();
    }
    public GerenteView(String identificador){
        super(identificador);
    }
    public GerenteView(String nombre, int edad, String identificador, double salarioBase){
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

    public GerenteView(int bonus) {
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
