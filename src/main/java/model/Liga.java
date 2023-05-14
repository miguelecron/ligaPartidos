package model;

import java.util.*;


public class Liga {

    private Set<Partido> partidos;
    private Set<Equipo> equipos;
    private final int GANADOR = 3;
    private final int EMPATE = 1;

    public Liga() {
        this.partidos = new HashSet<>();
        this.equipos = new HashSet<>();
    }

    public boolean agregarPartido(Partido partido) {
        return partidos.add(partido);
    }

    private void anadirEquipos(Partido partido) {
        if (!(equipos.contains(partido.getLocal()))) {
            equipos.add(partido.getLocal());
        }
        if (!(equipos.contains(partido.getVisitante()))) {
            equipos.add(partido.getVisitante());
        }
    }

    private void generarClasificacion() {
        Equipo local;
        Equipo visitante;
        int golesAFavor;  //Goles marcados por el equipo local
        int golesEnContra;     // Goles marcados por el equipo visitante
        for (Partido partido : partidos) {
            local = buscarEquipo(partido.getLocal());
            visitante = buscarEquipo(partido.getVisitante());
            golesAFavor = partido.getGolesAFavor();
            golesEnContra = partido.getGolesEncontra();
            anadirEquipos(partido);
            calcularPuntos(local, visitante, golesAFavor, golesEnContra);
            sumarGoles(local, visitante, golesAFavor, golesEnContra);
        }
    }

    private Equipo buscarEquipo(Equipo equipoBuscado) {
        if (equipos.contains(equipoBuscado)) {
            for (Equipo equipo : equipos) {
                if (equipo.equals(equipoBuscado)) {
                    return equipo;
                }
            }
        } else {
            equipos.add(equipoBuscado);
        }
        return equipoBuscado;
    }

    private void calcularPuntos(Equipo local, Equipo visitante, int golesAFavor, int golesEnContra) {
        if (golesAFavor > golesEnContra) {
            local.sumarPuntos(GANADOR);
        } else if (golesEnContra > golesAFavor) {
            visitante.sumarPuntos(GANADOR);
        } else {
            local.sumarPuntos(EMPATE);
            visitante.sumarPuntos(EMPATE);
        }
    }

    private void sumarGoles(Equipo local, Equipo visitante, int golesAFavor, int golesEnContra) {
        local.sumarGolesAFavor(golesAFavor);
        local.sumarGolesEnContra(golesEnContra);
        visitante.sumarGolesAFavor(golesEnContra);
        visitante.sumarGolesEnContra(golesAFavor);
    }


    public String clasificacion() {
        generarClasificacion();
        List<Equipo> equiposClasificados = new ArrayList<>(equipos);
        Collections.sort(equiposClasificados);

        StringBuilder sb = new StringBuilder();

        // Encabezados de la tabla
        sb.append(String.format("%-10s %-15s %-8s %-4s %-4s%n", "Posicion", "Equipo", "Puntos", "GF", "GC"));
        sb.append("-------------------------------------------\n");

        // Contenido de la tabla
        int posicion = 1;
        for (Equipo equipo : equiposClasificados) {
            sb.append(String.format("%-10s %-15s %-8s %-4s %-4s%n", posicion, equipo.getNombre(), equipo.getPuntos(), equipo.getGolesAFavor(), equipo.getGolesEnContra()));
            posicion++;
        }

        return sb.toString();
    }

}

