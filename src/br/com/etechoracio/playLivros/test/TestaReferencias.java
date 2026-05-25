package br.com.etechoracio.playLivros.test;

import br.com.etechoracio.playLivros.model.Livro;

public class TestaReferencias {

    //Livro nomelivro = ;
        //para criar uma variavel em java, é parecido com C
        // var é um tipo indefinido
        //variaveis são guardadas em endereços, não em uma "caixa"
        //sintaxe:
        //Livro favorito = new Livro();  //new livro é a criação do objeto, ou seja, não é só definir Livro, e sim cria-lo dentro do endereço.
        //new livro é o endereço do objeto como um ID, e não é de fato o objeto.
        //Ex "minha pipa" é o controle do objeto
        //New pipa é o objeto.

    static void main() {
        Livro livroA = new Livro();
        livroA.setTitulo("Meu Livro A");
        System.out.println(livroA.getTitulo());

        Livro livroB = livroA;
        livroB.setTitulo("Meu Livro B");
        System.out.println(livroB.getTitulo());

        System.out.println(livroA.getTitulo());
    }


    //main = static void main() {
    //  }
    //sout = System.out.println();
   // livroB.titulo nesse caso, definimos a variavel e qual classe queremos exibir
}