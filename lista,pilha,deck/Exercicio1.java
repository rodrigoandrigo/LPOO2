package exercicio.pkg1;

import java.util.EmptyStackException;
import javax.swing.*;

class ListaR {

    int valor;
    ListaR prox;

    public ListaR(int valor, ListaR prox) {
        this.valor = valor;
        this.prox = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public ListaR getProx() {
        return prox;
    }

    public void setProx(ListaR prox) {
        this.prox = prox;
    }

}

class ctr {

    private String va = "";
    private ListaR pr;//primeiro
    private int tm;//tamanho

    public ctr() {
        this.pr = null;
        this.tm = 0;
    }

    public ctr(ctr c) {
        pr = c.getPr();
        tm = c.getTm();
    }

    public ListaR getPr() {
        return pr;
    }

    public int getTm() {
        return tm;
    }

    public boolean listvoid() {//verifica se a lista esta vazia
        if (getTm() == 0) {
            return true;
        }
        return false;
    }

    public void IML() {//imprime os elementos da lista
        ListaR pont = pr;
        while (pont != null) {
            va += Integer.toString(pont.valor) + "-";
            //System.out.printf(pont.valor + "\n");
            pont = pont.prox;
        }
        JOptionPane.showMessageDialog(null, va);
    }

    public void IML2() {//imprime os elementos da lista tambem
        for (ListaR pont = pr; pont != null; pont = pont.prox) {
            va += Integer.toString(pont.valor) + "-";
        }
        JOptionPane.showMessageDialog(null, va);

    }

    public int Posi(int valor) {//verifica se o elemento existe
        int tam = 0;//tamanho 2
        ListaR pont;
        for (pont = pr; pont != null && pont.valor != valor; pont = pont.prox) {
            tam++;
        }
        if (pont == null) {
            tam = -1;
        }
        return tam;
    }

    public void adic(int valor) { //adicionar na proxima posiçao
        pr = new ListaR(valor, pr);
        tm++;
        va += Integer.toString(valor) + "-";
    }

    public void adic(int valor, int tam) { //adicionar na posiçao selecionada
        if (tam == 0) {
            pr = new ListaR(valor, pr);
        } else {
            ListaR pont = pr;
            for (int x = 0; x < tam - 1; x++) {
                pont = pont.prox;
            }
            pont.prox = new ListaR(valor, pr.prox);
        }
        tm++;
    }

    public void rempi() { //remover normal
        pr = pr.prox;
        tm--;
    }

    public void rem(int tam) throws EmptyStackException {//remove de uma determinada posicao
        if (listvoid()) {
            throw new EmptyStackException();
        }
        if (tam == 0) {
            pr = pr.prox;
        } else {
            ListaR pont = pr;
            for (int x = 0; x < tam - 1; x++) {
                pont = pont.prox;
            }
            pont.prox = pont.prox.prox;
        }
        tm--;
    }

    public int pegar(int tam) {//retorna o valor de uma determinada posicao
        ListaR pont = pr;
        for (int x = 0; x < tam - 1; x++) {
            pont = pont.prox;
        }
        return pont.valor;
    }

    public void ver() {//ver lista 
        JOptionPane.showMessageDialog(null, va);

    }

}

class Exercicio1 {

    public static void main(String[] args) {
        int tam = 1;
        ctr c = new ctr();
        int inic = Integer.parseInt(JOptionPane.showInputDialog("escreva o primeiro elemento"));
        c.adic(inic);
        int quant = Integer.parseInt(JOptionPane.showInputDialog("escreva a quantidade de numeros que quer inserir"));
        for (int f = 1; f <= quant; f++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("escreva um numero"));
            c.adic(num, tam);
            ++tam;
        }
        c.IML();

    }

}
