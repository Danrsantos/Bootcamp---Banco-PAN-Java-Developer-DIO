package com.Danilo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Danilo")
    void validarAlgoSomenteNoUsuarioDanilo(){
        Assertions.assertEquals(10,5 + 5);
    }

    @EnabledOnOs(OS.WINDOWS)
    void validarAlgo(){
        Assertions.assertEquals(10,5 + 5);
    }

}
