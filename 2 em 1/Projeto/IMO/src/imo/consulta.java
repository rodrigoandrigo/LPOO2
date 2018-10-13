package imo;

import javax.swing.JOptionPane;

class consulta extends Perfil {//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    protected int index;
    protected boolean cadas = true;
    protected criar_cadastro criar = new criar_cadastro();

    public consulta(String Nome, String Email, String Senha, String Endereco, int Idade, String CPF, int Telefone) {
        super(Nome, Email, Senha, Endereco, Idade, CPF, Telefone);
    }

    public consulta() {

    }

    public void consultar() {// Esse metodo e usado para consultar o perfil usando o id do array list

        do {
            try {
                index = Integer.parseInt(JOptionPane.showInputDialog("Escreva a posicao do usuario cadastrado \n para visualizar o perfil"));
                JOptionPane.showMessageDialog(null, "Nome : " + criar.perfill.get(index).Nome + "\n"
                        + "Idade : " + criar.perfill.get(index).Idade + "\n"
                        + "CPF : " + criar.perfill.get(index).CPF + "\n"
                        + "Telefone : " + criar.perfill.get(index).Telefone + "\n"
                        + "Endereco : " + criar.perfill.get(index).Endereco + "\n");
                cadas = false;
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Usuario nao existe");
            }
        } while (cadas);

    }

}
