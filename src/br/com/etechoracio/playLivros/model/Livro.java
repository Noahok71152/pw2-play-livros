package br.com.etechoracio.playLivros.model;

import br.com.etechoracio.playLivros.enums.DisponibilidadeEnum;
import br.com.etechoracio.playLivros.enums.VersaoEnum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//public static void main (String[] argstring[]){  }
//é um int main da linguagem C
public class Livro {
    //para criar uma variavel colocamos
    //tipo nomeVariavel;
    //double é uma variavel que armazena numeros reais ou unidades fracionarias.
    //no java, tudo q vamos criar sao classes.
    // para criar um objeto, criamos uma classe. E apartir da classe, criamos um objeto.
    // criar novo objeto Ex: new Aluno();
    private String titulo;
    private String autor;
    private String narrador;
    private String editora;
    private VersaoEnum versao;
    protected double preco;
    private String resumo;
    private LocalTime duracao;
    private LocalDateTime dataDeLancamento;

    //Titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Narrador

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    //Editora


    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    //Versao


    public VersaoEnum getVersao() {
        return versao;
    }

    public void setVersao(VersaoEnum versao) {
        this.versao = versao;
    }



    // Preco

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



    //Resumo

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }



    //Data

    public LocalDateTime getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDateTime dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    //Duracao


    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Narrador: " + narrador);
        System.out.println("Editora: " + editora);
        System.out.println("Preço: " + preco);
        System.out.println("Resumo: " + resumo);
        System.out.println("Duração: " + duracao + " mins");
        System.out.println("Disponibilidade: " + obterDisponibilidade());

        System.out.println("-----------------");
    }

    public String dataAtual(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d  'de' MMMM 'de' yyyy");
        String resultado = formatador.format(dataDeLancamento);
        return resultado;

    }

    public DisponibilidadeEnum obterDisponibilidade(){
        java.time.LocalDateTime dataAtual = LocalDateTime.now();
        if(dataDeLancamento == null){
            return DisponibilidadeEnum.INDISPONIVEL;
        } else if(dataDeLancamento.isAfter(dataAtual)){
            return DisponibilidadeEnum.EM_PRE_VENDA;
        } else if (dataDeLancamento.isBefore(dataAtual.minusDays(30))) {
            return DisponibilidadeEnum.LANCAMENTO_RECENTE;
        }
        else {
            return
                    DisponibilidadeEnum.DISPONIVEL;
        }
    }
    public
}