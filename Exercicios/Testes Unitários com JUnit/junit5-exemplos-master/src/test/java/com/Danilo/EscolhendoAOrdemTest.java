package com.Danilo;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.class)
public class EscolhendoAOrdemTest {
    @Order(4)
    @Test
    void validadeFluxoA(){
        Assertions.assertTrue(true);
    }
    @Order(3)
    @Test
    void validadeFluxoB(){
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void validadeFluxoC(){
        Assertions.assertTrue(true);
    }
    @Order(1)
    @Test
    void validadeFluxoD(){
        Assertions.assertTrue(true);
    }

}
