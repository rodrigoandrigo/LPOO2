package exercicio.pkg6;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio6 {
    
    static void inverter(int[] val, int i, int j) {
        if (i < j) {
            tr(val, i, j);
            inverter(val, i + 1, j - 1);
        }
    }
    
    static void tr(int[] val, int i, int j) {
        int num = val[i];
        val[i] = val[j];
        val[j] = num;
    }
    
    public static void main(String[] args) {
        
        int val[] = {1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        Exercicio6.inverter(val, 0, val.length -1);
        JOptionPane.showMessageDialog(null, Arrays.toString(val));
    }
    
}
