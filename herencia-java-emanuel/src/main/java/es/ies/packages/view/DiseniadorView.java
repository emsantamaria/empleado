package es.ies.packages.view;

import es.ies.packages.model.Diseniador;

public class DiseniadorView extends Diseniador{
        private int bonus;
    public DiseniadorView() {
        super();
    }
    public DiseniadorView(String identificador){
        super(identificador);
    }
    public DiseniadorView(String nombre, int edad, String identificador, double salarioBase){
        super(nombre, edad, identificador, salarioBase);
    }  

    public DiseniadorView(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}
