package com.github.dangelcrack;

public class DistanciaManhattan extends Distancia {
    @Override
    public double medir(Punto origen, Punto destino) {
       return Math.abs(destino.getX() - origen.getX()) + Math.abs(destino.getY() - origen.getY());
    }
}