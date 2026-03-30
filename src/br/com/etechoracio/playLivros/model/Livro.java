package br.com.etechoracio.playLivros.model;

import br.com.etechoracio.playLivros.enums.VersaoEnum;

import java.time.LocalTime;
//public static void main (String[] argstring[]){  }
//é um int main da linguagem C
public class Livro {
    //para criar uma variavel colocamos
    //tipo nomeVariavel;
    //double é uma variavel que armazena numeros reais ou unidades fracionarias.
    //no java, tudo q vamos criar sao classes.
    // para criar um objeto, criamos uma classe. E apartir da classe, criamos um objeto.
    // criar novo objeto Ex: new Aluno();
    public String titulo;
    public String autor;
    public String narrador;
    public String editora;
    public VersaoEnum versao;
    public double preco;
    public String resumo;
    public LocalTime duracao;
}