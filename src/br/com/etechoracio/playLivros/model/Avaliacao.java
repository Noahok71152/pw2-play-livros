package br.com.etechoracio.playLivros.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Avaliacao {
    private String titulo;
    private Usuario usuario;
    private int estrelas;
    private LocalDateTime data;
    private String comentario;
    private boolean aprovado;

    //Titulo


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Usuario

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    //Data

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    //Comentario

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


    public void exibiraval(){
        if(aprovado) {
            System.out.println("Título: " + titulo);
            System.out.println("Usuário: " + usuario.getNome());
            System.out.println("Estrelas: " + estrelas + " estrelas");
            System.out.println("Data de Avaliação: " + obterDataPorExtenso());
            System.out.println("Comentário: " + comentario);
        }
    }

    public String obterDataPorExtenso(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("d  'de' MMMM 'de' yyyy");
        String resultado = formatador.format(data);
        return resultado;

    }

    public void adicionar(int nota){
        this.estrelas = nota;
    }

    public void aprovar(){
        this.aprovado = true;
    }


}