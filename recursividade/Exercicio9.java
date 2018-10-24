package exercicio.pkg9;

import javax.swing.JOptionPane;

public class Exercicio9 {

    int n2 = 0;

    void naturais(int n1) {
        if (n2 == n1) {
            JOptionPane.showMessageDialog(null, n2);
        } else {
            JOptionPane.showMessageDialog(null, n2);
            n2++;
            naturais(n1);
        }

    }

    public static void main(String[] args) {
        Exercicio9 ex9 = new Exercicio9();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero"));
        ex9.naturais(n1);
    }

}
