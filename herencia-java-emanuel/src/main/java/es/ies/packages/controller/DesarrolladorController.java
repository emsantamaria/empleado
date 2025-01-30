package es.ies.packages.controller;

import es.ies.packages.file.DesarrolladorFile;
import es.ies.packages.model.Desarrollador;
import es.ies.packages.view.DesarrolladorView;

public class DesarrolladorController {
    DesarrolladorFile pDesarrolladorFile;
    public DesarrolladorController(){
        this.pDesarrolladorFile=new DesarrolladorFile();
    }
    public boolean add(String nombre, String contrasenia, String codigo) {
        if (nombre == null || nombre.isEmpty()) {
            return false;
        }
        if (contrasenia == null || contrasenia.isEmpty()) {
            return false;
        }
        if (codigo == null || codigo.isEmpty()) {
            return false;
        }
        return true;
    }

    public Desarrollador getById(String codigo) {
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        Desarrollador desarrollador = new Desarrollador(codigo);
        DesarrolladorView desarrolladorView = new DesarrolladorView(desarrollador.getNombre(), desarrollador.getEdad(), desarrollador.getIdentificador(), desarrollador.getSalarioBase());
        return desarrolladorView;
    }
}
