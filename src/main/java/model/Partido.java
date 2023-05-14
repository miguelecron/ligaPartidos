package model;

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
}
