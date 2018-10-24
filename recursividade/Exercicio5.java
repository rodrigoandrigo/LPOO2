package exercicio.pkg5;

import javax.swing.JOptionPane;

public class Exercicio5 {

    public static int factorial(int num) {
        int num2 = 0;
        for (int num1 = 1; num >= num1; num1++) {
            num2 += num1;
        }
        return num2;

    }

    public static void main(String[] args) {
        boolean vai = true;

        do {
            try {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numro"));
                int resultado = Exercicio5.factorial(numero);
                JOptionPane.showMessageDialog(null, "A soma dos numeros : " + resultado);
                vai = false;
            } catch (NumberFormatException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Escreva um numero inteiro(nao double e nao string)");
            }
        } while (vai);
    }

}
