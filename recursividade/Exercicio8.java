package exercicio.pkg8;

import javax.swing.JOptionPane;

public class Exercicio8 {

    int n3 = 1;

    int multip_Recur(int n1, int n2) {
        if (n3 == n2) {
            return n1;
        } else {
            n1 += n1;
            n3++;
            return multip_Recur(n1, n2);
        }

    }

    public static void main(String[] args) {
        Exercicio8 ex8 = new Exercicio8();
        boolean vai = true;

        do {
            try {
                int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o numro que quer multiplicar"));
                int n2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva quantas vezes quer multiplicar esse numero"));
                int resultado = ex8.multip_Recur(n1, n2);
                JOptionPane.showMessageDialog(null, "A multiplicaçao de " + n1 + " * " + n2 + " = " + resultado);
                vai = false;
            } catch (NumberFormatException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Escreva um numero inteiro(nao double e nao string)");
            }
        } while (vai);

    }

}
