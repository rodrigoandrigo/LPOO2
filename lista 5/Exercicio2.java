package exercicio.pkg2;

import javax.swing.JOptionPane;

class Animal {

    String nome, raca, passos;

    public Animal() {
    }

    public void animal(String nome) {
        nome = JOptionPane.showInputDialog("Escreva o nome do animal");
    }

    public String caminha() {
        JOptionPane.showMessageDialog(null, " 2 kms e ainda caminhando \n");
        return passos;
    }
}

class Cachorro extends Animal {

    String som;

    public String late() {
        JOptionPane.showMessageDialog(null, "Au,Au!!! \n");
        return som;
    }

}

class Gato extends Animal {

    String som;

    public String mia() {
        JOptionPane.showMessageDialog(null, "miau!!! \n");
        return som;
    }
}

class Pessoa {

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

class Rica extends Pessoa {

    double dinheiro;

    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        setDinheiro(dinheiro);
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void fazCompras() {

    }
}

class Pobre extends Pessoa {

    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    public void trabalha() {

    }
}

class Miseravel extends Pessoa {

    public Miseravel(String nome, int idade) {
        super(nome, idade);
    }

    public void mendiga() {

    }
}

public class Exercicio2 {

    public static void main(String[] args) {
        Animal[] dupla = new Animal[2];
        dupla[0] = new Cachorro();
        dupla[1] = new Gato();
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        c.late();
        for (int x = 1; x < dupla.length; x++) {
            dupla[x].caminha();
        }
        g.mia();
        for (int x = 1; x < dupla.length; x++) {
            dupla[x].caminha();
        }
        Pessoa[] tipo = new Pessoa[3];
        tipo[0] = new Rica("Nathan", 27, 923572.86);
        tipo[1] = new Pobre("Bernardo", 18);
        tipo[2] = new Miseravel("Pietro", 22);
    }
}
