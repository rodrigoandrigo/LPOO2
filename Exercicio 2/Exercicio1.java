package exercicio.pkg1;

import java.util.Scanner;

class Animal {

    protected String tipo, cor;

    public Animal(String tipo, String cor) {
        setTipo(tipo);
        setCor(cor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}

class Cachorro extends Animal {

    protected String nome, raca;

    public Cachorro(String tipo, String cor, String nome, String raca) {
        super(tipo, cor);
        setRaca(raca);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void toString(String nome, String raca) {
    }
}

class Cocker extends Cachorro {

    private boolean tosa;

    public Cocker(String tipo, String cor, String nome, String raca, boolean tosa) {
        super(tipo, cor, nome, raca);
        setTosa(tosa);
    }

    public boolean isTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    public void precisaTosa() {
        if (this.tosa == true) {
            System.out.println("Precisa de tosa");
        } else {
            System.out.println("Nao precisa de tosa");
        }
    }
}

class CockerTeste {

    Scanner s = new Scanner(System.in);
    String tipo, cor, nome, raca, tosa1;
    Boolean tosa;

    public void informacoesdoCocker() {
        Cocker c = new Cocker(tipo, cor, nome, raca, tosa);
        System.out.println("Escreva a Nome do Cocker");
        nome = s.nextLine();
        c.setNome(nome);
        System.out.println("Escreva a Cor do Cocker");
        cor = s.nextLine();
        c.setCor(cor);
        System.out.println("Escreva o Tipo do Cocker");
        tipo = s.nextLine();
        c.setTipo(tipo);
        this.raca = "Cocker";
        System.out.println("Escreva sim para tosar ou escreva nao");
        tosa1 = s.nextLine();
        if (tosa1 == "sim") {
            c.setTosa(true);
        } else {
            c.setTosa(false);
        }

    }

}

public class Exercicio1 {

    public static void main(String[] args) {
        CockerTeste c = new CockerTeste();
        c.informacoesdoCocker();
    }
}
