package br.com.etechoracio.playLivros.test;


import br.com.etechoracio.playLivros.model.Avaliacao;
import br.com.etechoracio.playLivros.model.Usuario;

import java.time.LocalDateTime;

public class TestaAvaliacao {
    static void main(){
        Usuario horacio = new Usuario("Horacio Augusto da Silveira");

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setTitulo("Livro");


        avaliacao.setData(LocalDateTime.now());
        avaliacao.setUsuario(horacio);
        avaliacao.adicionar(5);
        avaliacao.setComentario("Livro excelente, chegou no prazo.");
        avaliacao.aprovar();
        avaliacao.exibiraval();

    }
}
