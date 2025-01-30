package es.ies.packages.view;

import es.ies.packages.model.Desarrollador;

public class DesarrolladorView extends Desarrollador{
    private int bonus;
    public DesarrolladorView() {
        super();
    }
    public DesarrolladorView(String identificador){
        super(identificador);
    }
    public DesarrolladorView(String nombre, int edad, String identificador, double salarioBase){
        super(nombre, edad, identificador, salarioBase);
    }  

    public DesarrolladorView(int bonus) {
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
}
