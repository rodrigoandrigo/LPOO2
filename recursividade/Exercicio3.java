package exercicio.pkg3;

import javax.swing.JOptionPane;

public class Exercicio3 {
    
    static int invert(int n) {
        if (n == 0) {
            return n;
        } else {
            JOptionPane.showMessageDialog(null,+ n % 10);
            n = n / 10;
            return invert(n);
        }
        
    }
    
    public static void main(String[] args) {
        boolean vai = true;
        
        do {
            try {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero"));
                Exercicio3.invert(num);
                vai = false;
            } catch (NumberFormatException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Escreva um numero inteiro(nao double e nao string)");
            }
        } while (vai);
    }
}
