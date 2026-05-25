package br.com.etechoracio.playLivros.model;

public class LivroImpresso extends Livro{
    private int paginas;

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getTaxaEnvio(){
        return preco * 0.07;
    }
}
