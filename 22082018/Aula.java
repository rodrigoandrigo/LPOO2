package aula;

import javax.swing.JOptionPane;

public class Aula {

    public static void main(String[] args) {
        String Nome;
        int Idade;
        Nome = JOptionPane.showInputDialog("Insira o nome");
        Idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));

        if (Idade >= 18) {
            JOptionPane.showMessageDialog(null,""+Nome+" voce ja pode tirar o CNH", Nome,JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,""+Nome+" voce ainda nao pode tirar o CNH, voce tem apenas "+Idade+" anos");
        }

    }

}
