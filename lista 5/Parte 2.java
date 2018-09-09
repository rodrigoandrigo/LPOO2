package exercicio.pkg1;

import javax.swing.JOptionPane;

class Produto {

    String nomeloja, descricao;
    double perco;

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public String getDescricao() {
        return "Produto de informatica";
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPerco() {
        return perco;
    }

    public void setPerco(double perco) {
        this.perco = perco;
    }

}

class Mouse extends Produto {

    String tipo;

    public Mouse() {
        this.tipo = "Mouse ótico,Saida USB,1.600 dpi";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return "Mouse ótico,Saida USB,1.600 dpi";
    }
}

class Livro extends Produto {

    String autor;

    public Livro() {
        this.autor = "Aurelio monteiro";
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return "Aurelio monteiro";
    }
}

class Exercicio1 {

    public static void main(String[] args) {

        Produto[] carrinho = new Produto[24];
        carrinho[0] = new Livro();
        carrinho[1] = new Mouse();
        carrinho[2] = new Mouse();
        carrinho[3] = new Livro();
        carrinho[4] = new Mouse();
        carrinho[5] = new Mouse();
        carrinho[6] = new Mouse();
        carrinho[7] = new Mouse();
        carrinho[8] = new Mouse();
        carrinho[9] = new Livro();
        carrinho[10] = new Mouse();
        carrinho[11] = new Livro();
        carrinho[12] = new Mouse();
        carrinho[13] = new Mouse();
        carrinho[14] = new Mouse();
        carrinho[15] = new Livro();
        carrinho[16] = new Livro();
        carrinho[17] = new Mouse();
        carrinho[18] = new Livro();
        carrinho[19] = new Mouse();
        carrinho[20] = new Livro();
        for (Produto carrinho1 : carrinho) {
            JOptionPane.showMessageDialog(null, carrinho1.getDescricao());
        }

    }
}
