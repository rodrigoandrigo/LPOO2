package exercicio.pkg5;

import javax.swing.JOptionPane;

interface AparelhoDeSom {

    void liga();

    void Desliga();

    int aumentavolume(int valor);

    int diminuivolume(int valor);
}

class AparelhosDeSom implements AparelhoDeSom {

    public void liga() {
    }

    public void Desliga() {
    }

    public int aumentavolume(int valor) {
        return valor;
    }

    public int diminuivolume(int valor) {
        return valor;
    }
}

class CDPlayer implements AparelhoDeSom {

    public void liga() {
    }

    public void Desliga() {
    }

    public int aumentavolume(int valor) {
        return valor;
    }

    public int diminuivolume(int valor) {
        return valor;
    }
}

class Radio implements AparelhoDeSom {

    public void liga() {
    }

    public void Desliga() {
    }

    public int aumentavolume(int valor) {
        return valor;
    }

    public int diminuivolume(int valor) {
        return valor;
    }
}

public class Exercicio5 {

    public static void main(String[] args) {
        String Escolha;
        int volume = 0;
        Radio r = new Radio();
        Escolha = JOptionPane.showInputDialog("'aumentar' ou 'diminuir' o volume do Radio");
        if (Escolha == "aumentar") {
            volume = Integer.parseInt(JOptionPane.showInputDialog("Escreva o numero de quanto quer diminuir o volume"));
            r.aumentavolume(volume);
        }
        if (Escolha == "diminuir") {
            volume = Integer.parseInt(JOptionPane.showInputDialog("Escreva o numero de quanto quer diminuir o volume"));
            volume = volume - volume - volume;
            r.diminuivolume(volume);
        }

    }

}
