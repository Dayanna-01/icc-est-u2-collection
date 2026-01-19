package maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class EjerciciosMapas {

    // Ejercicio 1
    public Map<Integer, Integer> contarDuplicados(List<Integer> list) {
        Map<Integer, Integer> conteo = new HashMap<>();

        for (Integer num : list) {
            if (conteo.containsKey(num)) {
                conteo.put(num, conteo.get(num) + 1);
            } else {
                conteo.put(num, 1);
            }
        }

        Map<Integer, Integer> ordenado = new TreeMap<>(conteo);
        for (Map.Entry<Integer, Integer> entry : ordenado.entrySet()) {
            System.out.println("Numero: " + entry.getKey() + " -> " + entry.getValue() + " veces");
        }

        return ordenado;
    }

    // Ejercicio 2
    public Integer primerNoRepetido(List<Integer> list) {
        Map<Integer, Integer> conteo = new HashMap<>();

        for (Integer num : list) {
            if (conteo.containsKey(num)) {
                conteo.put(num, conteo.get(num) + 1);
            } else {
                conteo.put(num, 1);
            }
        }

        for (Integer num : list) {
            if (conteo.get(num) == 1) {
                return num;
            }
        }

        return null;
    }

    // Ejercicio 3
    public void rankingPuntajes(List<String[]> entradas) {

        Map<String, Integer> jugadores = new HashMap<>();

        for (int i = 0; i < entradas.size(); i++) {
            String nombre = entradas.get(i)[0];
            int puntaje = Integer.parseInt(entradas.get(i)[1]);

            if (!jugadores.containsKey(nombre)) {
                jugadores.put(nombre, puntaje);
            } else {
                if (puntaje > jugadores.get(nombre)) {
                    jugadores.put(nombre, puntaje);
                }
            }
        }

        Map<Integer, String> ranking = new TreeMap<>(
            new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    return b - a;
                }
            }
        );

        for (String nombre : jugadores.keySet()) {
            ranking.put(jugadores.get(nombre), nombre);
        }

        for (Integer puntaje : ranking.keySet()) {
            System.out.println(ranking.get(puntaje) + " -> " + puntaje);
        }
    }

}
