package br.com.etechoracio.playLivros.test;

import br.com.etechoracio.playLivros.enums.DisponibilidadeEnum;
import br.com.etechoracio.playLivros.enums.VersaoEnum;
import br.com.etechoracio.playLivros.model.AudioBook;
import br.com.etechoracio.playLivros.model.Livro;
import br.com.etechoracio.playLivros.model.LivroImpresso;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestaLivros {
    static void main() {
        AudioBook primeiroLivro = new AudioBook();
        primeiroLivro.setTitulo("O Poder do Hábito");
        primeiroLivro.setAutor("Charles Duhigg");
        primeiroLivro.setNarrador("Carlos Seidl");
        primeiroLivro.setEditora("Objetiva");
        primeiroLivro.setDuracao( LocalTime.of(10, 45));
        primeiroLivro.setVersao(VersaoEnum.ESTENDIDA);
        primeiroLivro.setPreco(29.90);
        primeiroLivro.setResumo("Explora como os hábitos funcionam e como podem ser transformados.");
        primeiroLivro.setDataDeLancamento(LocalDateTime.of(2026, 4, 5, 5, 45));
        primeiroLivro.exibir();
        primeiroLivro.obterDisponibilidade();
        primeiroLivro.dataAtual();



//miau
        // Segundo livro
        Livro segundoLivro = new Livro();
        segundoLivro.setTitulo("O Poder do Hábito");
        segundoLivro.setAutor("Charles Duhigg");
        segundoLivro.setNarrador("Carlos Seidl");
        segundoLivro.setEditora("Objetiva");
        segundoLivro.setDuracao(LocalTime.of(6, 45));
        segundoLivro.setVersao(VersaoEnum.ESTENDIDA);
        segundoLivro.setPreco(24.90);
        segundoLivro.setResumo("Explora como os hábitos funcionam e como podem ser transformados.");
        segundoLivro.setDataDeLancamento(LocalDateTime.of(2026,7, 18, 5, 45));
        segundoLivro.exibir();
        segundoLivro.obterDisponibilidade();
        segundoLivro.dataAtual();

        // Terceiro livro
        Livro terceiroLivro = new Livro();
        terceiroLivro.setTitulo("O Poder do Hábito");
        terceiroLivro.setAutor("Charles Duhigg");
        terceiroLivro.setNarrador("Carlos Seidl");
        terceiroLivro.setEditora("Objetiva");
        terceiroLivro.setDuracao(LocalTime.of(8, 55));
        terceiroLivro.setVersao(VersaoEnum.ESTENDIDA);
        terceiroLivro.setPreco(19.90);
        terceiroLivro.setResumo("Explora como os hábitos funcionam e como podem ser transformados.");
        terceiroLivro.setDataDeLancamento(LocalDateTime.now());
        terceiroLivro.exibir();
        terceiroLivro.obterDisponibilidade();
        terceiroLivro.dataAtual();


        // Quarto Livro Impresso
        LivroImpresso quartoLivro = new LivroImpresso();
        quartoLivro.setTitulo("Pai Rico, Pai Pobre");
        quartoLivro.setAutor("Robert Kiyosaki");
        quartoLivro.setNarrador("Marcelo Sanches");
        quartoLivro.setEditora("Alla Books");
        quartoLivro.setDuracao(LocalTime.of(6, 15));
        quartoLivro.setVersao(VersaoEnum.INTEGRAL);
        quartoLivro.setPreco(19.90);
        quartoLivro.setPaginas(197);
        quartoLivro.setResumo("Ensina conceitos fundamentais sobre educação financeira.");
    }


}