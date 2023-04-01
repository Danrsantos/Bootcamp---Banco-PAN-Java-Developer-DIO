package com.Danilo;

import com.github.willyancaetano.junit.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa Pedro = new Pessoa("Pedro", LocalDateTime.of(2001,2,20, 14,0,0));
        Assertions.assertEquals(22,Pedro.getIdade());
    }

    @Test
    void deveRetornarSeEhmaiorDeIdade(){
        Pessoa Pedro = new Pessoa("Pedro", LocalDateTime.of(2001,2,20, 14,0,0));
        Assertions.assertTrue(Pedro.ehMaiorDeIdade());

        Pessoa Maria = new Pessoa("Maria", LocalDateTime.of(2022,2,20, 14,0,0));
        Assertions.assertFalse(Maria.ehMaiorDeIdade());
    }
}
