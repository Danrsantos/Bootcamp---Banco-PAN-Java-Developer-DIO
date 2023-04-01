package com.Danilo;

import com.github.willyancaetano.junit.GerenciadorDeConexaoComBancoDeDados;
import com.github.willyancaetano.junit.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosDePessoasTest {
    @BeforeAll
    static void confuguraConexao(){
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
        //System.out.println("Rodou congiguraConexao");
    }

    @BeforeEach
    void insereDadosParaTeste(){
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("Zé", LocalDateTime.now()));
    }

    @AfterEach
    void removeDadosDoTeste(){
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("Zé", LocalDateTime.now()));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
        //System.out.println("Rodou finalizarconexao");
    }
}
