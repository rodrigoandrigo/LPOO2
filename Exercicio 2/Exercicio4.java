package exercicio4;

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

class Administrador extends Empregado {

    private double ajudasDeCusto;

    public Administrador(String nome, int idade, double altura, String sexo, double salario, double ajudasDeCusto) {
        super(nome, idade, altura, sexo, salario);
        setAjudasDeCusto(ajudasDeCusto);
    }

    public double getAjudasDeCusto() {
        return ajudasDeCusto;
    }

    public void setAjudasDeCusto(double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }

    public double obterLucro() {
        double obterLucro = ajudasDeCusto + salario;
        return obterLucro;
    }

}

class testeAdministrador {

    Scanner e = new Scanner(System.in);
    String nome, sexo;
    int idade;
    double altura, salario, ajudasDeCusto;

    public void informacoesAdministrador() {
        ArrayList<Administrador> ad = new ArrayList<Administrador>();
        Administrador a = new Administrador(nome, idade, altura, sexo, salario, ajudasDeCusto);
        System.out.println("Escreva as informacoes do Administrador");
        System.out.println("Escreva o nome do Administrador");
        nome = e.nextLine();
        a.setNome(nome);
        System.out.println("Escreva a idade do Administrador");
        idade = e.nextInt();
        a.setIdade(idade);
        System.out.println("Escreva a altura do Administrador");
        altura = e.nextDouble();
        a.setAltura(altura);
        System.out.println("Escreva o sexo do Administrador");
        sexo = e.next();
        a.setSexo(sexo);
        System.out.println("Escreva o salario do Administrador");
        salario = e.nextDouble();
        a.setSalario(salario);
        System.out.println("Escreva as ajudas de custos do Administrador");
        ajudasDeCusto = e.nextDouble();
        a.setAjudasDeCusto(ajudasDeCusto);
        ad.add(a);
    }
}

public class Exercicio4 {

    public static void main(String[] args) {
        testeAdministrador a = new testeAdministrador();
        a.informacoesAdministrador();
    }

}
