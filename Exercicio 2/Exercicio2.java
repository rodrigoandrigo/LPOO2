package exercicio.pkg2;

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

class testeEmpregado {

    Scanner s = new Scanner(System.in);

    String nome, sexo;
    int idade;
    double altura, salario;

    public void informacaoEmpregado() {
        ArrayList<Empregado> em = new ArrayList<Empregado>();
        Empregado e = new Empregado(nome, idade, altura, sexo, salario);
        System.out.println("Escreva as informacoes do empregado");
        System.out.println("Escreva o nome do empregado");
        nome = s.nextLine();
        e.setNome(nome);
        System.out.println("Escreva a idade do empregado");
        idade = s.nextInt();
        e.setIdade(idade);
        System.out.println("Escreva a altura do empregado");
        altura = s.nextDouble();
        e.setAltura(altura);
        System.out.println("Escreva o sexo do empregado");
        sexo = s.next();
        e.setSexo(sexo);
        System.out.println("Escreva o salario do empregado");
        salario = s.nextDouble();
        e.setSalario(salario);
        em.add(e);
    }

}

public class Exercicio2 {

    public static void main(String[] args) {
        testeEmpregado e = new testeEmpregado();
        e.informacaoEmpregado();
    }
}
