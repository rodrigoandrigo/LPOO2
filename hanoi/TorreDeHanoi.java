package torre.de.hanoi;

import java.util.Scanner;

public class TorreDeHanoi {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        System.out.println("Numero de discos na torre de Hanoi?");
        int n = stdin.nextInt();
        
        TorresHanoi t = new TorresHanoi();
        t.moverDiscos(n, 'A', 'C', 'B');
        t.escreverTotalMovimentos();
    }

}
