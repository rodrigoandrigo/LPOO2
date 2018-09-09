package exercicio4;

import javax.swing.JOptionPane;

class Imovel {

    protected double valor;
    protected String endereco;

    public Imovel(double valor, String endereco) {
        this.valor = valor;
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}

class Novo extends Imovel {

    private double add, total;

    public Novo(double valor, String endereco) {
        super(valor, endereco);
        setAdd(20000.00);
    }

    public double getAdd() {
        return add;
    }

    public void setAdd(double add) {
        this.add = add;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void valorTotal() {
        total = valor + add;
        JOptionPane.showMessageDialog(null, "Valor do imovel: " + total + "\n");
    }

}

class Velho extends Imovel {

    double descont, total;

    public Velho(double valor, String endereco) {
        super(valor, endereco);
        setdescont(54000.00);
    }

    public double getdescont() {
        return descont;
    }

    public void setdescont(double descont) {
        this.descont = descont;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;

    }

    public void valorTotal() {
        total = valor - descont;
        JOptionPane.showMessageDialog(null, "Valor do imovel: " + total + "\n");
    }
}

public class Exercicio4 {

    public static void main(String[] args) {
        Imovel[] tipo = new Imovel[2];
        Novo no = new Novo(343199.00, "Rua Doutor Nildo Alff");
        tipo[0] = new Novo(343199.00, "Rua Doutor Nildo Alff");
        Velho ve = new Velho(223639.00, "Avenida Parnamirim 295");
        tipo[1] = new Velho(223639.00, "Avenida Parnamirim 295");
        String imovel = JOptionPane.showInputDialog("Escreva 1 para Imovel Novo e 2 para Imovel Antigo");
        if (imovel == "1") {
            no.valorTotal();
        }
        if (imovel == "2") {
            ve.valorTotal();
        }
    }

}
