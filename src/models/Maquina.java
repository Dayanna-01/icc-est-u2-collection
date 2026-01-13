package models;

import java.util.List;

public class Maquina implements Comparable<Maquina> {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;

    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = calcularSubred();
    }

    public String getNombre() {
        return nombre;
    }

    public String getIp() {
        return ip;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public int getSubred() {
        return subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public int calcularSubred() { //192.168.11.1 -> Sub red 100
        String[] octetos = ip.split("\\."); // [ 172, 16, 55, 90]
        String subred = octetos[2];
        return Integer.parseInt(subred);
    }
    public int calcularRiesgo() {
        return 0;
    }

    @Override
    public int compareTo(Maquina o) {
        // Comparar por subred
        if (this.subred < o.getSubred()) {
            return -1;
        }
        if (this.subred > o.getSubred()) {
            return 1;
        }
        
        int resultado = this.nombre.compareTo(o.getNombre());

        return resultado;
    }
}
