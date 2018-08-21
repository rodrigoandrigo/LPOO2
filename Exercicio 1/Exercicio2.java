package exercicio.pkg2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Pais {

    String nome, nome1, capital, capital1;
    int dimensao, dimensao1;
    boolean equals;
    List<Pais> ListadePaises;

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return this.nome;
    }

    public void setcapital(String capital) {
        this.capital = capital;
    }

    public String getcapital() {
        return this.capital;
    }

    public void setdimensao(int dimensao) {
        this.dimensao = dimensao;
    }

    public int getdimensao() {
        return this.dimensao;
    }

    public void setnome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getnome1() {
        return this.nome1;
    }

    public void setcapital1(String capital1) {
        this.capital1 = capital1;
    }

    public String getcapital1() {
        return this.capital1;
    }

    public void setdimensao1(int dimensao1) {
        this.dimensao1 = dimensao1;
    }

    public int getdimensao1() {
        return this.dimensao1;
    }

    public void setequals(boolean equals) {
        this.equals = equals;
    }

    public boolean getequals() {
        return this.equals;
    }

    public Pais() {
        this.ListadePaises = new ArrayList();
        Pais novopais = new Pais();
        nome1 = "Brasil";
        capital1 = "Brasilia";
        dimensao1 = 8516000;
        for (int x = 0; x <= 10; x++) {
            Pais p = new Pais();
            if (x == 0) {
                novopais.setnome("Guianafranceca");
                novopais.setcapital("Caiena");
                novopais.setdimensao(83846);
                ListadePaises.add(novopais);
            }
            if (x == 1) {
                novopais.setnome("Guiana");
                novopais.setcapital("Geogetown");
                novopais.setdimensao(214970);
                ListadePaises.add(novopais);
            }
            if (x == 2) {
                novopais.setnome("Suriname");
                novopais.setcapital("Paramaribo");
                novopais.setdimensao(163821);
                ListadePaises.add(novopais);
            }
            if (x == 3) {
                novopais.setnome("Venezuela");
                novopais.setcapital("Caracas");
                novopais.setdimensao(916445);
                ListadePaises.add(novopais);
            }
            if (x == 4) {
                novopais.setnome("Colombia");
                novopais.setcapital("Bogota");
                novopais.setdimensao(1138914);
                ListadePaises.add(novopais);
            }
            if (x == 5) {
                novopais.setnome("Peru");
                novopais.setcapital("Lima");
                novopais.setdimensao(1285220);
                ListadePaises.add(novopais);
            }
            if (x == 6) {
                novopais.setnome("Bolivia");
                novopais.setcapital("La Paz");
                novopais.setdimensao(1098581);
                ListadePaises.add(novopais);
            }
            if (x == 7) {
                novopais.setnome("Paraguai");
                novopais.setcapital("Assuncao");
                novopais.setdimensao(406752);
                ListadePaises.add(novopais);
            }
            if (x == 8) {
                novopais.setnome("Argentina");
                novopais.setcapital("Buenos Aires");
                novopais.setdimensao(2780400);
                ListadePaises.add(novopais);
            }
            if (x == 9) {
                novopais.setnome("Uruguai");
                novopais.setcapital("Montevideu");
                novopais.setdimensao(176215);
                ListadePaises.add(novopais);
            }
        }
    }

    public boolean equals() {
        if (nome1 == nome && capital1 == capital) {
            equals = true;
        } else {
            equals = false;
        }
        return equals;
    }

    public void fronteira() {
        if (dimensao != dimensao) {
            System.out.println("Esse pais pode fazer fronteira");
        } else {
            System.out.println("Esse pais nao pode fazer fronteira");
        }
    }

    public void listafronteiras() {
        for (int lp = 0; lp < ListadePaises.size(); lp++) {
            System.out.println(ListadePaises.get(lp).getnome());
            System.out.println(ListadePaises.get(lp).getcapital());
            System.out.println(ListadePaises.get(lp).getdimensao());
        }
    }
}

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String nome, capital;
        int dimensao;
    }
}
