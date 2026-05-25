package br.com.etechoracio.playLivros.model;

public class Usuario {
    private String foto;
    private String nome;

    public Usuario(String nome){
        this.nome = nome;
    }


    public String getNome() {
        return nome.toUpperCase();
    }
    public void setNome(String ul){

    }
}
