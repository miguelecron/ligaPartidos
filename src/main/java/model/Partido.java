package model;

import java.util.Objects;

public class Partido {

    private Equipo local;
    private Equipo visitante;
    private int golesAFavor;
    private int golesEncontra;

    public Partido(Equipo local, Equipo visitante, int golesAFavor, int golesEncontra) {
        this.local = local;
        this.visitante = visitante;
        this.golesAFavor = golesAFavor;
        this.golesEncontra = golesEncontra;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEncontra() {
        return golesEncontra;
    }

    public void setGolesEncontra(int golesEncontra) {
        this.golesEncontra = golesEncontra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partido partido = (Partido) o;

        if (!Objects.equals(local, partido.local)) return false;
        return Objects.equals(visitante, partido.visitante);
    }

    @Override
    public int hashCode() {
        int result = local != null ? local.hashCode() : 0;
        result = 31 * result + (visitante != null ? visitante.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Partido{");
        sb.append("local=").append(local);
        sb.append(", visitante=").append(visitante);
        sb.append(", golesAFavor=").append(golesAFavor);
        sb.append(", golesEncontra=").append(golesEncontra);
        sb.append('}');
        return sb.toString();
    }
}
