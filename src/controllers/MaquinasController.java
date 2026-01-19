package controllers;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Maquina;

public class MaquinasController {

    public Set<Maquina> ordenarPorSubRed(List<Maquina> maquinas) {
        Set<Maquina> resultado = new TreeSet<>();

        for (Maquina m : maquinas) {
            resultado.add(m);
        }

        return resultado;
    }
}
