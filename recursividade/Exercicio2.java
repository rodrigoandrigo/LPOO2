package exercicio.pkg2;

import javax.swing.JOptionPane;

public class Exercicio2 {

    static int fibonacci(int nu) {
        if (nu == 1 || nu == 2) {
            return 1;
        } else {
            return fibonacci(nu - 1) + fibonacci(nu - 2);
        }
    }

    public static void main(String[] args) {
        Exercicio2 n2 = new Exercicio2();
        boolean vai = true;
        int n1, f;

        do {
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de termos da sequência de Fibonacci: "));
                for (f = 1; f <= n1; f++) {
                    System.out.println(n2.fibonacci(f));
                }
                vai = false;
            } catch (NumberFormatException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Escreva um numero inteiro(nao double e nao string)");
            }
        } while (vai);

    }
}
