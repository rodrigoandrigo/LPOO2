package exercicio.pkg3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Porta {

    boolean aberto, aberta;
    String cor;
    double dimensaoX, dimensaoY, dimensaoZ;

    public void abre() {
        aberto = true;
    }

    public void fecha() {
        aberto = false;
    }

    public void pinta(String s) {
        this.cor = s;
    }

    public boolean estaAberta() {
        if (aberto == true) {
            aberto = true;
        } else {
            aberto = false;
        }
        return aberta;
    }

}

class Casa {

    String cor;
    double porta1, porta2, porta3;
    boolean p1, p2, p3;

    public void pinta(String s) {
        this.cor = s;
    }

    public int quantasPortasEstaoAbertas() {
        int a = 0;
        if (p1 == true) {
            a += 1;
        }
        if (p2 == true) {
            a += 1;
        }
        if (p3 == true) {
            a += 1;
        }

        return a;
    }

    public int TotaldePorta() {
        int t = 0;
        if (porta1 != 0) {
            t += 1;
        }
        if (porta2 != 0) {
            t += 1;
        }
        if (porta3 != 0) {
            t += 1;
        }
        return t;
    }

}

class Edificio {

    String cor;
    int totalDePortas, totalDeAndares, portas, andar;
    boolean porta;
    List<Porta> ListadePortas = new ArrayList();
    int portased[];

    public void pinta(String s) {
        this.cor = s;
    }

    public void adicionarPorta(Porta P) {
        portas += 1;
    }

    public int quantasPortasEstaoAbertas() {
        int portasabertas = 0;
        if (porta == true) {
            portasabertas += 1;
        }
        return portasabertas;
    }

    public int TotaldePorta() {
        System.out.printf("Total de portas \f", portas);

        return portas;
    }

    public void adicionarAndar() {
        andar += 1;
    }

    public int totalDeAndares() {

        return andar;
    }

}

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    }
}
