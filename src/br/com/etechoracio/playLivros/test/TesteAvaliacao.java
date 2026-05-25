package br.com.etechoracio.playLivros.test;

import br.com.etechoracio.playLivros.model.Avaliacao;
import br.com.etechoracio.playLivros.model.Usuario;

import java.time.LocalDateTime;

public class TesteAvaliacao {
    static void main() {
        Usuario horacio = new Usuario("Horácio Augusto da Silveira");

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setTitulo("Livro 1");
        avaliacao.setData(LocalDateTime.now());
        avaliacao.setUsuario(horacio);
        avaliacao.adicionar(3);
        avaliacao.setComentario("\"Livro excelente,porém para mim que tenho filho maior que 5 anos, não achei interessante");
        avaliacao.aprovar();
        avaliacao.exibiraval();

    }
}
