package exercicio.pkg1;

import javax.swing.JOptionPane;

class Exercicio1 {

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {
        boolean vai = true;

        do {
            try {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numro"));
                int resultado = Exercicio1.factorial(numero);
                JOptionPane.showMessageDialog(null, "Fatorial de " + numero + " : " + resultado);
                vai = false;
            } catch (NumberFormatException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Escreva um numero inteiro(nao double e nao string)");
            }
        } while (vai);
    }
}
