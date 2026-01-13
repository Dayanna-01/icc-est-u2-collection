package controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinasController {
    // METODO que ordene un listado de maquinas
    // Por su subred y leugo por el nombre
    // si ambas son iguales se consideren maquinas
    // y se descartan

    public Set<Maquina> ordenarPorSubRed(List<Maquina> maquinas) {
        Set<Maquina> maquinas0 = new TreeSet(maquinas);
        for (Maquina maquina : maquinas) {
            maquinas0.add(maquina);
        }
        return maquinas0;
    }

}
