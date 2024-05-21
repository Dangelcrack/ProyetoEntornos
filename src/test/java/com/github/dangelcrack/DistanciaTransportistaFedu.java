package com.github.dangelcrack;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanciaTransportistaFedu {
    static DistanciaTransportistaFedu distanciaTransportistaFedu;
    @BeforeAll
    public static void setDistanciaTransportistaFedu(){
        distanciaTransportistaFedu  = new DistanciaTransportistaFedu();};

    @Test
    @DisplayName("DistanciaManhattan")
    void testDistanciaManhattan(){
        assertEquals(7, distanciaTransportistaFedu.medir(3,4));
        assertEquals(30, distanciaTransportistaFedu.medir(10,20));
        assertEquals(110, distanciaTransportistaFedu.medir(50,60));
    }

}
