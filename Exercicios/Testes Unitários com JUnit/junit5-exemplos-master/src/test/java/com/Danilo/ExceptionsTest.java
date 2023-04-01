package com.Danilo;

import com.github.willyancaetano.junit.Conta;
import com.github.willyancaetano.junit.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("6666666", 0);
        Conta contaDestino = new Conta("333333", 110);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaDestino, contaOrigem,10));

    }
}
