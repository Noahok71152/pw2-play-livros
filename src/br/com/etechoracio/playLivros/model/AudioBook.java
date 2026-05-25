package br.com.etechoracio.playLivros.model;

import br.com.etechoracio.playLivros.enums.VersaoEnum;

import java.time.LocalTime;

public class AudioBook extends Livro{
    private String narrador;
    private LocalTime duracao;
    private VersaoEnum versao;

//narrador

    @Override
    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }


//duracao

    @Override
    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }


//versao


    @Override
    public void setVersao(VersaoEnum versao) {
        this.versao = versao;
    }
}
