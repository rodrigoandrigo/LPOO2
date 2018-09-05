package pkg29082018;

import javax.swing.JOptionPane;

abstract class Habitacao {

    protected int numeroDeComodos;
    protected String endereco;

    public Habitacao(int numeroDeComodos, String endereco) {
        setNumeroDeComodos(numeroDeComodos);
        setEndereco(endereco);
    }

    public int getNumeroDeComodos() {
        return numeroDeComodos;
    }

    public void setNumeroDeComodos(int numeroDeComodos) {
        this.numeroDeComodos = numeroDeComodos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public abstract double calculaIptu();
}

class Casa extends Habitacao {

    double tamanhoQuintal;

    public Casa(int numeroDeComodos, String endereco, double tamanhoQuintal) {
        super(numeroDeComodos, endereco);
    }

    public double calculaIptu() {
        double Iptu;
        Iptu = (numeroDeComodos * 900) + (tamanhoQuintal * 200);
        return Iptu;
    }

    public double getTamanhoQuintal() {
        return tamanhoQuintal;
    }

    public void setTamanhoQuintal(double tamanhoQuintal) {
        this.tamanhoQuintal = tamanhoQuintal;
    }
}

class Apartamento extends Habitacao {

    private double valorCondominio;

    public Apartamento(int numeroDeComodos, String endereco, double valorCondominio) {
        super(numeroDeComodos, endereco);
        setValorCondominio(valorCondominio);
    }

    public double calculaIptu() {
        double Iptu;
        Iptu = (numeroDeComodos * 400) + (valorCondominio * 200);
        return Iptu;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }
}

public class Main {

    public static void main(String[] args) {
        int numeroDeComodos = 0;
        String endereco = null, Escolha = null;
        double valorCondominio = 0, tamanhoQuintal = 0;
        Apartamento a = new Apartamento(numeroDeComodos, endereco, valorCondominio);
        Casa c = new Casa(numeroDeComodos, endereco, tamanhoQuintal);
        Escolha = JOptionPane.showInputDialog("Escreva se voce mora em 'casa' ou em 'apartamento'");
        if (Escolha == "casa") {
            endereco = JOptionPane.showInputDialog("Escreva o seu endereco");
            c.setEndereco(endereco);
            numeroDeComodos = Integer.parseInt(JOptionPane.showInputDialog("Escreva o numero de comodos da casa"));
            c.setNumeroDeComodos(numeroDeComodos);
            tamanhoQuintal = Double.parseDouble(JOptionPane.showInputDialog("Escreva o tamanho do quintal"));
            c.setTamanhoQuintal(tamanhoQuintal);
        }
        if (Escolha == "apartamento") {
            endereco = JOptionPane.showInputDialog("Escreva o seu endereco");
            a.setEndereco(endereco);
            numeroDeComodos = Integer.parseInt(JOptionPane.showInputDialog("Escreva o numero de comodos da casa"));
            a.setNumeroDeComodos(numeroDeComodos);
            valorCondominio = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor do condominio"));
            a.setValorCondominio(valorCondominio);
        }

    }
}
