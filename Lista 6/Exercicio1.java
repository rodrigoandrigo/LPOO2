package exercicio.pkg1;

import javax.swing.JOptionPane;

class Exercicio1 {

    public static void main(String[] args) {
        boolean vai = true;
        do {
            try {
                int[] x = new int[10];
                for (int i = 0; i < x.length; i++) {
                    x[i] = i;
                }
                for (int i = 0; i < x.length; i++) {
                    System.out.print(x[i]);
                }
                vai = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Posicao nao existe no array!");
            }
        } while (vai);
    }
}
