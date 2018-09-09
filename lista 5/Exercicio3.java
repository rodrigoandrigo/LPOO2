package exercicio.pkg3;

import javax.swing.JOptionPane;

class ingresso {

    protected double valor;

    public void imprimeValor() {
    }

}

class VIP extends ingresso {

    double adic;

    public double ValorVip() {
        double valorT = valor + adic;
        return valorT;
    }
}

class normal extends ingresso {

    public void normal() {
        JOptionPane.showMessageDialog(null, "Ingresso Normal\n");
    }

}

class CamaroteInferior extends VIP {

}

class CamaroteSuperior extends VIP {

    public double returnValor(double add) {
        double valorF = valor + add;
        return valorF;
    }
}

public class Exercicio3 {

    public static void main(String[] args) {
        double valor = 0;
        ingresso[] ingress = new ingresso[5];
        String ingreso = JOptionPane.showInputDialog("Escreva 1 para Ingresso Normal e 2 para Ingresso VIP");
        if (ingreso == "1") {
            JOptionPane.showMessageDialog(null, "Ingresso Normal");
            valor += 25.00;
            JOptionPane.showMessageDialog(null, "Valor final: R$" + valor + "\n");
        }
        if (ingreso == "2") {
            String camarote = JOptionPane.showInputDialog("Escreva 1 para Camarote Superior e 2 para Camarote Inferior");

            JOptionPane.showMessageDialog(null, "Ingresso Vip\n");
            valor += 60.00;
            if (camarote == "1") {
                JOptionPane.showMessageDialog(null, "Camarote Superior\n");
                valor += 12.00;
                JOptionPane.showMessageDialog(null, "Valor final: R$" + valor + "\n");
            }
            if (camarote == "2") {
                JOptionPane.showMessageDialog(null, "Camarote Inferior\n");
                valor += 9.00;
                JOptionPane.showMessageDialog(null, "Valor final: R$" + valor + "\n");
            }

        }

    }
}
