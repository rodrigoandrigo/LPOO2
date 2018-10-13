package imo;

import javax.swing.JOptionPane;

class excluir_clientes extends Perfil {//////////////////////////////////////////////////////////////////////////////////////////////////////////

    protected int index;
    protected boolean exclu = true;
    protected criar_cadastro criar = new criar_cadastro();

    public excluir_clientes(String Nome, String Email, String Senha, String Endereco, int Idade, String CPF, int Telefone) {
        super(Nome, Email, Senha, Endereco, Idade, CPF, Telefone);
    }

    public excluir_clientes() {

    }

    public void excluir_clientes() {// Esse metodo usa o telefone como meio para excluir o perfil

        do {
            try {
                index = Integer.parseInt(JOptionPane.showInputDialog("Escreva a posicao do usuario cadastrado para excluir"));
                criar.perfill.remove(index);
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Usuario nao existe");
            }
        } while (exclu);

    }

}
