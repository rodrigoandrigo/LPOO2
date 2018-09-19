package exercicio.pkg2;

import javax.swing.JOptionPane;

class AcimaDeCem extends Exception {

    int n2, n3;

    @Override
    public String toString() {
        return "Numero Acima de Cem";
    }

    public AcimaDeCem(int n2, int n3) {
        super();
        this.n2 = n2;
        this.n3 = n3;

    }

}

public class Exercicio2 {

    public static void main(String[] args) {
        int n1, n2 = 0, n3 = 0, n4;
        boolean vai = true;

        do {
            try {
                for (int x = 0; n3 < 100;) {
                    n1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva qualquer numero"));
                    n2 += 1;
                    n3 += n1;
                }

                n4 = n3 / n2;
                JOptionPane.showMessageDialog(null, "Foram somados " + n2 + " numeros \n");
                JOptionPane.showMessageDialog(null, "A divisao de " + n3 + " por " + n2 + " foi " + n4 + "\n");
                vai = false;
                throw new AcimaDeCem(n2, n3);
            } catch (AcimaDeCem e) {

                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Erro numero");
                e.printStackTrace();
            }
        } while (vai);

    }
}
