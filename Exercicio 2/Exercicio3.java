package exercicio.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {

    protected String nome, sexo;
    protected int idade;
    protected double altura;

    public Pessoa(String nome, int idade, double altura, String sexo) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}

class Fornecedor extends Pessoa {

    private double creditoMaximo, valorEmDivida;

    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public Fornecedor(String nome, int idade, double altura, String sexo, double creditoMaximo, double valorEmDivida) {
        super(nome, idade, altura, sexo);
        setCreditoMaximo(creditoMaximo);
        setValorEmDivida(valorEmDivida);
    }

    public double obterSaldo() {
        double saldo = creditoMaximo - valorEmDivida;
        return saldo;
    }
}

class testeFornecedo {

    Scanner e = new Scanner(System.in);
    String nome, sexo;
    int idade;
    double altura, creditoMaximo, valorEmDivida;

    public void informacaoFornecedor() {
        ArrayList<Fornecedor> fo = new ArrayList<Fornecedor>();
        Fornecedor f = new Fornecedor(nome, idade, altura, sexo, creditoMaximo, valorEmDivida);
        System.out.println("Escreva as informacoes do Fornecedo");
        System.out.println("Escreva o nome do Fornecedo");
        nome = e.nextLine();
        f.setNome(nome);
        System.out.println("Escreva a idade do Fornecedo");
        idade = e.nextInt();
        f.setIdade(idade);
        System.out.println("Escreva a altura do Fornecedo");
        altura = e.nextDouble();
        f.setAltura(altura);
        System.out.println("Escreva o sexo do Fornecedo");
        sexo = e.next();
        f.setSexo(sexo);
        System.out.println("Escreva o credito maximo do Fornecedo");
        creditoMaximo = e.nextDouble();
        f.setCreditoMaximo(creditoMaximo);
        System.out.println("Escreva a divida do Fornecedo");
        valorEmDivida = e.nextDouble();
        f.setValorEmDivida(valorEmDivida);
        fo.add(f);
    }

}

public class Exercicio3 {

    public static void main(String[] args) {
        testeFornecedo t = new testeFornecedo();
        t.informacaoFornecedor();

    }
}
