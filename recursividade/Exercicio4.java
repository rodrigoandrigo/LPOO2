package exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {

    public static int somar(int array[], int tarray) {
        if (tarray > 0) {
            int soma = array[tarray - 1] + somar(array, tarray - 1);
            return soma;
        } else {
            return 0;
        }
    }

    static int funcMenor(int num) {
        return 0;
    }

    public static void main(String[] args) {
        int vals[] = {1, 2, 3, 4, 5,6,7,8};
        JOptionPane.showMessageDialog(null, Exercicio4.somar(vals, vals.length));
    }

}
