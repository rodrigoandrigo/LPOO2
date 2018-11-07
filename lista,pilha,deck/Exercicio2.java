package exercicio.pkg2;

import java.util.EmptyStackException;
import javax.swing.*;

class ListaR { // Nó da primeira lista///////////////////////////////////////////////////////////////////////////////////////////////////////////

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

class ListaR2 { // Nó da segunda lista///////////////////////////////////////////////////////////////////////////////////////////////////////////

    int valor;
    ListaR2 prox;
    
    public ListaR2(int valor, ListaR2 prox) {
        this.valor = valor;
        this.prox = null;
    }
    
    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public ListaR2 getProx() {
        return prox;
    }
    
    public void setProx(ListaR2 prox) {
        this.prox = prox;
    }
    
}

class ctr {// primeira lista/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    String va = "";
    ListaR pr;//primeiro
    int tm;//tamanho

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
    
    public void IMP() {//escreve os valores inseridos na lista
        ListaR pont = pr;
        while (pont != null) {
            va += Integer.toString(pont.valor) + "-";
            //System.out.printf(pont.valor + "\n");
            pont = pont.prox;
        }
        ver();
        
    }
    
    public void IMP2() {//escreve os valores inseridos na lista(2)
        for (ListaR pont = pr; pont != null; pont = pont.prox) {
            System.out.println(pont.valor);
        }
    }
    
    public int Posi(int valor) {
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
        //va += Integer.toString(pont.valor) + "-";
        tm++;
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
    
    public void inter() {
        
    }
    
}

class ctr2 {//segunda lista//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    String va = "";
    ListaR2 pr;//primeiro
    int tm;//tamanho

    public ctr2() {
        this.pr = null;
        this.tm = 0;
    }
    
    public ctr2(ctr2 c) {
        pr = c.getPr();
        tm = c.getTm();
    }
    
    public ListaR2 getPr() {
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
    
    public void IMP() {//escreve os valores inseridos na lista
        ListaR2 pont = pr;
        while (pont != null) {
            va += Integer.toString(pont.valor) + "-";
            //System.out.printf(pont.valor + "\n");
            pont = pont.prox;
        }
        ver();
        
    }
    
    public void IMP2() {//escreve os valores inseridos na lista(2)
        for (ListaR2 pont = pr; pont != null; pont = pont.prox) {
            System.out.println(pont.valor);
        }
    }
    
    public int Posi(int valor) {
        int tam = 0;//tamanho 2
        ListaR2 pont;
        for (pont = pr; pont != null && pont.valor != valor; pont = pont.prox) {
            tam++;
        }
        if (pont == null) {
            tam = -1;
        }
        return tam;
    }
    
    public void adic(int valor) { //adicionar na proxima posiçao
        pr = new ListaR2(valor, pr);
        //va += Integer.toString(pont.valor) + "-";
        tm++;
    }
    
    public void adic(int valor, int tam) { //adicionar na posiçao selecionada
        if (tam == 0) {
            pr = new ListaR2(valor, pr);
        } else {
            ListaR2 pont = pr;
            for (int x = 0; x < tam - 1; x++) {
                pont = pont.prox;
            }
            pont.prox = new ListaR2(valor, pr.prox);
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
            ListaR2 pont = pr;
            for (int x = 0; x < tam - 1; x++) {
                pont = pont.prox;
            }
            pont.prox = pont.prox.prox;
        }
        tm--;
    }
    
    public int pegar(int tam) {//retorna o valor de uma determinada posicao
        ListaR2 pont = pr;
        for (int x = 0; x < tam - 1; x++) {
            pont = pont.prox;
        }
        return pont.valor;
    }
    
    public void ver() {//ver lista 
        JOptionPane.showMessageDialog(null, va);
        
    }
    
}

public class Exercicio2 {
    
    ctr c = new ctr();
    ctr2 d = new ctr2();
    
    public void intercalar(ctr e, ctr2 f) {
        if ((!c.listvoid()) && (!d.listvoid())) {
            ListaR l1 = e.getPr();
            ListaR2 l3 = f.getPr();
            ListaR l2 = e.getPr().getProx();
            ListaR2 l4 = f.getPr().getProx();
            
            while ((l2 != null) && (l4 != null)) {
                l1.setProx(l3);
                l3.setProx(l2);
                l1 = l2;
                l2 = l2.getProx();
                l3 = l4;
                l4 = l4.getProx();
            }
            
            l1.setProx(l3);
            if (l4 == null) {
                l3.setProx(l2);
                l2.setProx(null);
            }
            
        }
        
    }
    
    public void concatenar(ctr e, ctr2 f) {
        if ((!c.listvoid()) && (!d.listvoid())) {
            ListaR no = e.pr;
            while (no.getProx() != null) {
                no = no.getProx();
                no.setProx(f.getPr());
                f.pr = null;
            }
        }
        
    }
    
    public static void main(String[] args) {
        Exercicio2 ex2 = new Exercicio2();
        int escolha = 1;
        boolean imo = true, imo2 = true;
        ctr c = new ctr();
        ctr2 d = new ctr2();
        
        c.adic(17);
        c.adic(25);
        c.adic(34);
        c.adic(89);
        c.adic(43);
        d.adic(11);
        d.adic(24);
        d.adic(36);
        d.adic(49);
        d.adic(58);
        
        do {
            do {
                try {
                    escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n"
                            + "1 - Verificar se um número pertence lista \n"
                            + "2 - Inserir um novo elemento na lista mantendo a ordem \n"
                            + "3 - Remover um elemento da lista \n"
                            + "4 - Imprimir os valores da lista \n"
                            + "5 - Copiar uma lista l1 para uma lista l2 \n"
                            + "6 - Concatenar uma lista l1 com uma lista l2 \n"
                            + "7 - Intercalar l1 e l2 \n"
                            + "8 - Sair"));
                    
                    do {
                        if (escolha <= 0 || escolha > 8) {
                            escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n"
                                    + "1 - Verificar se um número pertence lista \n"
                                    + "2 - Inserir um novo elemento na lista mantendo a ordem \n"
                                    + "3 - Remover um elemento da lista \n"
                                    + "4 - Imprimir os valores da lista \n"
                                    + "5 - Copiar uma lista l1 para uma lista l2 \n"
                                    + "6 - Concatenar uma lista l1 com uma lista l2 \n"
                                    + "7 - Intercalar l1 e l2 \n"
                                    + "8 - Sair"));
                            imo2 = true;
                        } else {
                            imo2 = false;
                        }
                    } while (imo2);
                    
                    imo = false;
                } catch (NumberFormatException e) {
                    System.err.println(e);
                    JOptionPane.showMessageDialog(null, "Escolha entre 1 e 8");
                }
            } while (imo);
            
            switch (escolha) { //Opcoes do menu

                case 1:
                    JOptionPane.showMessageDialog(null, "Funçao indisponivel");
                    
                    break;
                
                case 2:
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero"));
                    c.adic(num);
                    
                    break;
                
                case 3:
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva a posiçao do elemento que vai retirar"));
                    c.rem(num2);
                    
                    break;
                
                case 4:
                    c.IMP();
                    
                    break;
                
                case 5:
                    JOptionPane.showMessageDialog(null, "Funçao indisponivel");
                    
                    break;
                
                case 6:
                    ex2.concatenar(c, d);
                    
                    break;
                
                case 7:
                    ex2.intercalar(c, d);
                    
                    break;
                
                case 8:
                    System.exit(0);
                    
                    break;
                
                default:
                    
                    JOptionPane.showMessageDialog(null, "Opcao invalida");
                    
                    break;
            }
            
        } while (escolha
                != 8);
        
    }
}
