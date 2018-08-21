package exercicio.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

class Contacorrente {

    String nome;
    double saldo, limite = 2000.00;
    boolean status;
    int numero;

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return this.nome;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public void setstatus(boolean status) {
        this.status = status;
    }

    public boolean getstatus() {
        return this.status;
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public int getnumero() {
        return this.numero;
    }

    public void setlimite(double limite) {
        this.limite = limite;
    }

    public double getlimite() {
        return this.limite;
    }

}

class Banco {

    double saldo, valor1;

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public void saque() {
        if (valor1 < 2000.00) {
            saldo -= valor1;
            System.out.println("Saque realizado com sucesso");
        }
        if (valor1 > 2000.00) {
            System.out.println("Nao pode sacar mais de 2000,00 por dia");
        }
    }

    public void deposito() {
        saldo += valor1;
        System.out.println("Deposito realizado com sucesso");
    }

    public void SaldoExtrato() {
        System.out.println("saldo disponivel:" + saldo);
    }

}

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int numero = 0001, contas;
        String nome, pref;
        boolean status;

        System.out.println("Escreva a quantidade de contas que deseja criar");
        contas = e.nextInt();

        ArrayList<Contacorrente> Banco = new ArrayList<Contacorrente>();
        Contacorrente b = new Contacorrente();
        for (int x = 0; x < contas; x++) {
            System.out.println("Escreva o nome do proprietario");
            nome = e.nextLine();
            b.setnome(nome);
            System.out.println("Escreva sim para preferencial e nao para nao mesmo");
            pref = e.nextLine();
            if (pref == "sim") {
                status = true;
            } else {
                status = false;
            }
            b.setstatus(status);
            b.setnumero(numero);
            Banco.add(b);
            numero++;
            System.out.println();
        }
    }
}
