package br.com.etechoracio.playLivros.test;

import br.com.etechoracio.playLivros.enums.VersaoEnum;
import br.com.etechoracio.playLivros.model.Livro;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class CarrinhoDeCompras {
    static void main() {
        Livro primeiroLivro = new Livro();
        primeiroLivro.titulo = "O Poder do Hábito";
        primeiroLivro.autor = "Charles Duhigg";
        primeiroLivro.narrador = "Carlos Seidl";
        primeiroLivro.editora = "Objetiva";
        primeiroLivro.duracao = LocalTime.of(10, 45);
        primeiroLivro.versao = VersaoEnum.ESTENDIDA;
        primeiroLivro.preco = 29.90;
        primeiroLivro.resumo = "Explora como os hábitos funcionam e como podem ser transformados.";
    }
}
