package exercicio.pkg10;

import javax.swing.JOptionPane;

public class Exercicio10 {

    void naturais(int n1) {
        if (n1 == 0) {
            JOptionPane.showMessageDialog(null, n1);
        } else {
            JOptionPane.showMessageDialog(null, n1);
            n1--;
            naturais(n1);
        }

    }

    public static void main(String[] args) {
        Exercicio10 ex9 = new Exercicio10();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero"));
        ex9.naturais(n1);
    }

}
