package es.ies;

import es.ies.packages.model.Desarrollador;
import es.ies.packages.model.Diseniador;
import es.ies.packages.model.Gerente;

public class Programa {
    public static void main(String[] args) {
        Desarrollador desarrollador=new Desarrollador("Pedro", 15, "1", 20);
        System.out.println(desarrollador);
        System.out.println(desarrollador.calcularSalarioFinal());
        Gerente gerente=new Gerente("Pedro", 15, "2", 20);
        System.out.println(gerente);
        System.out.println(gerente.calcularSalarioFinal());
        Diseniador diseñador=new Diseniador("JA", 32, "1", 20);
        System.out.println(diseñador);
        System.out.println(diseñador.calcularSalarioFinal());
        System.out.println("¿"+desarrollador+"es igual a"+gerente+"?"+desarrollador.equals(gerente));
        System.out.println("¿"+desarrollador+"es igual a"+diseñador+"?"+desarrollador.equals(diseñador));
    }
}
