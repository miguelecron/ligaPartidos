package model;

import java.util.HashSet;
import java.util.Set;

public class Liga {

    private Set<Partido> partidos;

    public Liga() {
        this.partidos = new HashSet<>();
    }

    public boolean agregarPartido(Partido partido){
        return partidos.add(partido);
    }
}
