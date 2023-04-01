package com.Danilo;

import com.github.willyancaetano.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTest {
    @Test
    void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1,5, 2, 3, 10};

        Assertions.assertNotEquals(primeiroLancamento,segundoLancamento);
    }

    @Test
    void validarSeobjetoEstaNulo(){
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Mario", LocalDateTime.now());
        Assertions.assertNotNull(pessoa);
    }

    @Test

    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);
    }


}
