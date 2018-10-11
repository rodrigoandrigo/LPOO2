package allqueens;

public class Queens {

    int s[];
    int nr;
    int nsol;
    int col;

    Queens(int n) {
        nr = n;
        s = new int[nr + 1];
        nsol = 0;
        col = 0;
    }

    void escreverSolucao() {
        System.out.printf("Solucao(%2d)", nsol);
        for (int i = 1; i <= nr - 1; i++) {
            System.out.printf("%d,", s[1]);
            System.out.printf("%d)\n", s[nr]);
        }
    }

    boolean atacada(int l, int c) {
        int i;
        boolean emPerigo = false;
        i = 1;
        while (i < c && !emPerigo) {
            emPerigo = (s[i] == l) || (Math.abs(s[i] - l)) == Math.abs(i - c);
            i++;
        }
        return emPerigo;
    }

    void colocarRainha() {
        col++;
        for (int lin = 1; lin <= nr; lin++) {
            if (!atacada(lin, col)) {
                s[col] = lin;
            }
            if (col == nr) {
                nsol++;
                escreverSolucao();
            } else {
                colocarRainha();
                s[col] = 0;
            }
        }
        col--;
    }
}
