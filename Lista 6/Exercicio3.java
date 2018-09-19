package exercicio.pkg3;

import javax.swing.JOptionPane;

public class Exercicio3 {

    public static void main(String[] args) {
        boolean vai = true;
        int[] vet = new int[10];
        do {
            try {
                for (int x = 0; x <= 9; x++) {
                    vet[x] = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero inteiro"));

                }
                vai = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Posicao nao existe no array");
            } catch (NumberFormatException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Escreva um numero inteiro(nao double e nao string)");
            }
        } while (vai);
    }
}
