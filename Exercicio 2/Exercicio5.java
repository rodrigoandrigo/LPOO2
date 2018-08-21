package exercicio.pkg5;

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

class Empregado extends Pessoa {

    protected double salario;

    public Empregado(String nome, int idade, double altura, String sexo, double salario) {
        super(nome, idade, altura, sexo);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double obterLucro() {
        return salario;
    }
}

class Vendedor extends Empregado {

    double valorVendas, comissao;

    public Vendedor(String nome, int idade, double altura, String sexo, double salario, double valorVendas, double comissao) {
        super(nome, idade, altura, sexo, salario);
        setValorVendas(valorVendas);
        setComissao(comissao);
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double obterLucro() {
        salario = comissao + valorVendas;
        return salario;
    }
}

class testeVendedor {

    Scanner e = new Scanner(System.in);
    String nome;
    int idade;
    String sexo;
    double altura, salario, valorVendas, comissao;

    public void informacoesVendedor() {
        ArrayList<Vendedor> Ve = new ArrayList<Vendedor>();
        Vendedor v = new Vendedor(nome, idade, altura, sexo, salario, valorVendas, comissao);
        System.out.println("Escreva as informacoes do Vendedor");
        System.out.println("Escreva o nome do Vendedor");
        nome = e.nextLine();
        v.setNome(nome);
        System.out.println("Escreva a idade do Vendedor");
        idade = e.nextInt();
        v.setIdade(idade);
        System.out.println("Escreva a altura do Vendedor");
        altura = e.nextDouble();
        v.setAltura(altura);
        System.out.println("Escreva o sexo do Vendedor");
        sexo = e.next();
        v.setSexo(sexo);
        System.out.println("Escreva o salario do Vendedor");
        salario = e.nextDouble();
        v.setSalario(salario);
        System.out.println("Escreva o valor das vendas do Vendedor");
        valorVendas = e.nextDouble();
        v.setValorVendas(valorVendas);
        System.out.println("Escreva a comissao do Vendedor");
        comissao = e.nextDouble();
        v.setComissao(comissao);
        Ve.add(v);
    }
}

public class Exercicio5 {

    public static void main(String[] args) {
        testeVendedor v = new testeVendedor();
        v.informacoesVendedor();
    }

}
