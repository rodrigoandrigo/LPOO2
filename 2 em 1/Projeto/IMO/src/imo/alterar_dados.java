package imo;

import javax.swing.JOptionPane;

class alterar_dados extends Perfil {

    protected boolean alt = true, alt2 = true, alt3 = true;
    protected int verif, verif2, verif3, verif4, indexU = 0;
    protected criar_cadastro criar = new criar_cadastro();

    public alterar_dados(String Nome, String Email, String Senha, String Endereco, int Idade, String CPF, int Telefone) {
        super(Nome, Email, Senha, Endereco, Idade, CPF, Telefone);
    }

    public alterar_dados() {

    }

    public void alterar_dados() {//Metodo usado para alterar o nome
        verif = JOptionPane.showConfirmDialog(null, "Quer alterar o nome?", "Selecione", JOptionPane.YES_NO_OPTION);
        if (verif == 0) {
            Nome = JOptionPane.showInputDialog("Escreva seu nome completo");
            criar.perfill.get(indexU).setNome(Nome);
        }

        verif2 = JOptionPane.showConfirmDialog(null, "Quer alterar a  idade?", "Selecione", JOptionPane.YES_NO_OPTION);
        if (verif2 == 0) {
            do {
                try {
                    Idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a sua idade atual"));
                    criar.perfill.get(indexU).setIdade(Idade);
                    alt = false;
                    do {
                        if (Idade <= 17 || Idade > 120) {
                            Idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a sua idade atual"));
                            alt2 = true;
                        } else {
                            alt2 = false;
                        }
                    } while (alt2);
                } catch (NumberFormatException e) {
                    System.err.println(e);
                    JOptionPane.showMessageDialog(null, "Tem que ser maior de 18 anos");
                }
            } while (alt);
        }

        verif3 = JOptionPane.showConfirmDialog(null, "Quer alterar o telefone?", "Selecione", JOptionPane.YES_NO_OPTION);
        if (verif3 == 0) {
            do {
                try {
                    Telefone = Integer.parseInt(JOptionPane.showInputDialog("Escreva o seu novo telefone sem o ddd e sem o 9 digito"));
                    criar.perfill.get(indexU).setTelefone(Telefone);
                    alt3 = false;
                } catch (NumberFormatException e) {
                    System.err.println(e);
                    JOptionPane.showMessageDialog(null, "Escreva de novo");
                }
            } while (alt3);
        }

        verif4 = JOptionPane.showConfirmDialog(null, "Quer alterar o endereco?", "Selecione", JOptionPane.YES_NO_OPTION);
        if (verif4 == 0) {

            Endereco = JOptionPane.showInputDialog("Escreva o  novo endereço");
            criar.perfill.get(indexU).setEndereco(Endereco);

        }
    }
}
