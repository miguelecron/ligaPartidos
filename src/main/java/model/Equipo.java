package model;

public class Equipo {

    private String nombre;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Equipo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
