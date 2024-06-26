package com.github.dangelcrack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDistanciaTransportistaFedu {
    static DistanciaManhattan distanciaTransportistaFedu;

    @BeforeAll
    public static void setDistanciaTransportistaFedu() {
        distanciaTransportistaFedu = new DistanciaManhattan();
    }
//ab
    @Test
    @DisplayName("DistanciaManhattan")
    void testDistanciaManhattan() {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 4);
        assertEquals(7, distanciaTransportistaFedu.medir(p1, p2));

        Punto p3 = new Punto(0, 0);
        Punto p4 = new Punto(10, 20);
        assertEquals(30, distanciaTransportistaFedu.medir(p3, p4));

        Punto p5 = new Punto(0, 0);
        Punto p6 = new Punto(50, 60);
        assertEquals(110, distanciaTransportistaFedu.medir(p5, p6));
    }
}