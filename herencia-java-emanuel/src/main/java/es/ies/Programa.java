package es.ies;

public class Programa {
    public static void main(String[] args) {
        Desarrollador desarrollador=new Desarrollador("Pedro", 15, "1", 20);
        System.out.println(desarrollador);
        System.out.println(desarrollador.calcularSalarioFinal());
        Gerente gerente=new Gerente("Pedro", 15, "2", 20);
        System.out.println(gerente);
        System.out.println(gerente.calcularSalarioFinal());
        Diseñador diseñador=new Diseñador("JA", 32, "1", 20);
        System.out.println(diseñador);
        System.out.println(diseñador.calcularSalarioFinal());
        System.out.println("¿"+desarrollador+"es igual a"+gerente+"?"+desarrollador.equals(gerente));
        System.out.println("¿"+desarrollador+"es igual a"+diseñador+"?"+desarrollador.equals(diseñador));
    }
}
