package exercicio.pkg2;

import javax.swing.JOptionPane;

abstract class CartaoWeb {

    protected String destinatario, remetente;
    protected String[] Cartoes = new String[3];

    public CartaoWeb(String destinatario, String remetente) {
        setDestinatario(destinatario);
        setRemetente(remetente);
    }

    public String[] getCartoes() {
        return Cartoes;
    }

    public void setCartoes(String[] Cartoes) {
        this.Cartoes = Cartoes;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    abstract String retornarMensagem(String remetente);
}

class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados(String destinatario, String remetente) {
        super(destinatario, remetente);
        Cartoes[1] = remetente;
    }

    String retornarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null, "" + destinatario + "\n"
                + "Feliz Dia dos Namorados!\n"
                + "Espero que esse tenha sido o único cartão do dia dos namorados\n"
                + "que tenha ganhado nessa data!” De todo meu coração "
                + "seu amigo oculto");
        return remetente;
    }

}

class Natal extends CartaoWeb {

    public Natal(String destinatario, String remetente) {
        super(destinatario, remetente);
        Cartoes[2] = remetente;
    }

    String retornarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null, "\n"
                + "Desejo que o seu natal seja\n"
                + "brilhante de alegria,iluminado\n"
                + "de amor,cheio de harmonia e\n "
                + "de paz.Feliz Natal " + destinatario + "");
        return remetente;
    }

}

class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario, String remetente) {
        super(destinatario, remetente);
        Cartoes[3] = remetente;
    }

    String retornarMensagem(String remetente) {
        JOptionPane.showMessageDialog(null, "Feliz Aniversaio!" + destinatario + "\n"
                + "Com muito amor e carinho\n"
                + " te desejo uma vida plena\n"
                + "de saude e paz !");
        return remetente;
    }
}

public class Exercicio2 {

    public static void main(String[] args) {
        String destinatario, remetente;
        for (int z = 0; z < 4; z++) {
            if (z == 1) {
                System.out.println("");
                destinatario = JOptionPane.showInputDialog("Escreva o nome do Destinatario");
                remetente = JOptionPane.showInputDialog("Escreva o nome do Remetente");
                DiaDosNamorados d = new DiaDosNamorados(destinatario, remetente);
                d.retornarMensagem(remetente);
                System.out.println("");
            }
            if (z == 2) {
                System.out.println("");
                destinatario = JOptionPane.showInputDialog("Escreva o nome do Destinatario");
                remetente = JOptionPane.showInputDialog("Escreva o nome do Remetente");
                Natal n = new Natal(destinatario, remetente);
                n.retornarMensagem(remetente);
                System.out.println("");
            }
            if (z == 3) {
                System.out.println("");
                destinatario = JOptionPane.showInputDialog("Escreva o nome do Destinatario");
                remetente = JOptionPane.showInputDialog("Escreva o nome do Remetente");
                Aniversario a = new Aniversario(destinatario, remetente);
                a.retornarMensagem(remetente);
                System.out.println("");
            }
        }
    }
}
