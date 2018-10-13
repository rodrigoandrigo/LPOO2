package imo;

import javax.swing.JOptionPane;

class Historico_de_atividades extends Perfil {///////////////////////////////////////////////////////////////////////////////////////////////////
//Clase nao implementada ,pelo fato de necessitar de mais funcionalidades nao presentes nesse projeto #1

    public Historico_de_atividades(String Nome, String Email, String Senha, String Endereco, int Idade, String CPF, int Telefone) {
        super(Nome, Email, Senha, Endereco, Idade, CPF, Telefone);
    }

    public Historico_de_atividades() {

    }

    public static void Historico_de_atividades() {

    }

}

abstract class criar_visualizador extends Perfil {///////////////////////////////////////////////////////////////////////////////////////////////
//Clase nao implementada ,pelo fato de necessitar de mais funcionalidades nao presentes nesse projeto #2

    public criar_visualizador(String Nome, String Email, String Senha, String Endereco, int Idade, String CPF, int Telefone) {
        super(Nome, Email, Senha, Endereco, Idade, CPF, Telefone);
    }

    public criar_visualizador() {

    }

    public static void criar_visualizador() {

    }

}

abstract class ReceberOsTicketsDoSorteio extends Perfil {////////////////////////////////////////////////////////////////////////////////////////
//Clase nao implementada ,pelo fato de necessitar de mais funcionalidades nao presentes nesse projeto #3

    public ReceberOsTicketsDoSorteio(String Nome, String Email, String Senha, String Endereco, int Idade, String CPF, int Telefone) {
        super(Nome, Email, Senha, Endereco, Idade, CPF, Telefone);
    }

    public ReceberOsTicketsDoSorteio() {

    }

    public static void ReceberOsTicketsDoSorteio() {

    }
}

public class IMO {

    public static void main(String[] args) {

        int escolha = 1, x = 0, vezes;
        boolean imo = true, imo2 = true, case1 = true;

        criar_cadastro criar = new criar_cadastro();
        alterar_dados alter = new alterar_dados();
        excluir_clientes exclu = new excluir_clientes();
        consulta cons = new consulta();
        Perfil normal = new criar_cadastro();
        do {
            do {
                try {
                    escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n"
                            + "1 - para cadastrar o perfil \n"
                            + "2 - para exibir o perfil \n"
                            + "3 - para alterara dados do perfil \n"
                            + "4 - para excluir o perfil \n"
                            + "5 - sair \n"));

                    do {
                        if (escolha <= 0 || escolha > 5) {
                            escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n"
                                    + "1 - para cadastrar o perfil \n"
                                    + "2 - para exibir o perfil \n"
                                    + "3 - para alterara dados do perfil \n"
                                    + "4 - para excluir o perfil \n"
                                    + "5 - sair \n"));
                            imo2 = true;
                        } else {
                            imo2 = false;
                        }
                    } while (imo2);

                    imo = false;
                } catch (NumberFormatException e) {
                    System.err.println(e);
                    JOptionPane.showMessageDialog(null, "Escolha entre 1 e 5");
                }
            } while (imo);

            switch (escolha) { //Opcoes do menu
                case 1:
                    do {
                        try {
                            vezes = Integer.parseInt(JOptionPane.showInputDialog("Escreva quantos perfis deseja cadastrar"));
                            for (int x1 = 0; x1 < vezes; x1++) {
                                criar.criar_cadastro();
                            }
                            case1 = false;
                        } catch (NumberFormatException e) {
                            System.err.println(e);
                            JOptionPane.showMessageDialog(null, "Escreva de novo");
                        }
                    } while (case1);

                    break;
                case 2:

                    cons.consultar();

                    break;

                case 3:

                    alter.alterar_dados();

                    break;

                case 4:

                    exclu.excluir_clientes();

                    break;

                case 5:

                    System.exit(0);

                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Opcao invalida");

                    break;
            }

        } while (escolha != 5);

    }

}
