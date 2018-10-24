package exercicio.pkg7;

import javax.swing.JOptionPane;

public class Exercicio7 {

    int sumMatches(int n, int k, int i) {
        if (n % 10 == k) {
            i++;
        }
        if (n % 10 == n) {
            return i;
        }
        return sumMatches(n / 10, k, i);
    }

    public static void main(String[] args) {
        Exercicio7 ex7 = new Exercicio7();
        boolean vai = true;

        do {
            try {
                int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
                int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que quer verificar"));
                int vr = ex7.sumMatches(n1, n2, 0);
                JOptionPane.showMessageDialog(null, "O numero se repete " + vr + " Vezes");
                vai = false;
            } catch (NumberFormatException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Escreva um numero inteiro(nao double e nao string)");
            }
        } while (vai);
    }

}
