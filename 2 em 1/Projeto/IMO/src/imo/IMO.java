package imo;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Perfil {///////////////////////////////////////////////////////Classe Pai/////////////////////////////////////////////////////////

    protected String Nome, Email, Senha, Endereco, CPF;
    protected int Idade, Telefone;

    public Perfil(String Nome, String Email, String Senha, String Endereco, int Idade, String CPF, int Telefone) {
        setNome(Nome);
        setEmail(Email);
        setSenha(Senha);
        setEndereco(Endereco);
        setIdade(Idade);
        setCPF(CPF);
        setTelefone(Telefone);
    }

    public Perfil() {

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

}

class criar_cadastro extends Perfil { ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    protected boolean vai = true, vai1 = true, vai2 = true, vai4 = true, cadastroloop = true, email1 = true, cpftrue = true;//atributos usados nas excesoes e nos loops
    protected int uniqueID, indexU = 0; // Id de identificaçao do usuario e index do array list
    protected ArrayList<Perfil> perfil = new ArrayList();//Arraylist usado para guarda as informacoes do perfil

    public criar_cadastro(String Nome, String Email, String Senha, String Endereco, int Idade, String CPF, int Telefone, int uniqueID) {
        super(Nome, Email, Senha, Endereco, Idade, CPF, Telefone);
        setUniqueID(uniqueID);
    }

    public criar_cadastro() {

    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void criar_cadastro() {//metodo usado para preencher os atributos de cadastro e tambem zerar as variaveis ,para o cadastro de uotros usuarios
        Nome = null;
        Idade = 0;
        Email = null;
        Senha = null;
        CPF = null;
        Telefone = 0;
        Endereco = null;

        do {
            Nome = JOptionPane.showInputDialog("Escreva seu nome completo");

            do {
                try {
                    Idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a sua idade"));
                    vai = false;
                    do {
                        if (Idade <= 17 || Idade > 120) {
                            Idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a sua idade"));
                            vai4 = true;
                        } else {
                            vai4 = false;
                        }
                    } while (vai4);
                } catch (NumberFormatException e) {
                    System.err.println(e);
                    JOptionPane.showMessageDialog(null, "Escreva corretamente a sua idade");
                }
            } while (vai);

            do {

                Email = JOptionPane.showInputDialog("Escreva o Email");
                Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
                Matcher m = p.matcher(Email);
                boolean matchFound = m.matches();

                if (!matchFound) {
                    JOptionPane.showMessageDialog(null, "Formato de e-mail inválido.");
                } else {
                    email1 = false;
                }
            } while (email1);

            Senha = JOptionPane.showInputDialog("Escreva uma senha");

            do {
                CPF = JOptionPane.showInputDialog("Escreva o seu CPF");
                if (!CPF.isEmpty()) {

                    //Aceitar números de CPF nos seguintes formatos: 00000000000 e 000.000.000-00
                    if (CPF.matches("[0-9]{11}") || CPF.matches("([0-9]{3}+[\\.]{1}+[0-9]{3}+[\\.]{1}+[0-9]{3}+[\\-]{1}+[0-9]{2})")) {

                        CPF = CPF.replaceAll("\\.", "").replaceAll("-", ""); //Remove pontos e o traço, caso existam

                        String primeiroCaractere = CPF.substring(0, 1); //Busca o primeiro caractere

                        String removerRepeticoes = CPF.replaceAll(primeiroCaractere, ""); //Remove as repetições do primeiro caractere

                        if (removerRepeticoes.length() > 0) {

                            int somatorio1 = 0, somatorio2 = 0, peso1 = 10, peso2 = 11, numero;

                            String[] vetorCPF = CPF.split("");

                            for (int i = 0; i < 10; i++) {
                                numero = Integer.parseInt(vetorCPF[i]); //Transforma o elemento do vetor em um número inteiro para ser multiplicado

                                somatorio1 = (i < 9) ? somatorio1 + (numero * peso1) : somatorio1; //Realiza o somatório para o primeiro digito verificador, utilizando somente os 9 primeiros dígitos

                                somatorio2 = somatorio2 + (numero * peso2); //Realiza o somatório para o segundo digito verificador

                                peso1--; //Subtrai 1 do peso para o primeiro digito verificador

                                peso2--; //Subtrai 1 do peso para o segundo digito verificador

                            }

                            int valor1 = 11 - (somatorio1 % 11); //Subtrai o resto da divisão inteira do primeiro somatório por 11, de 11.

                            int valor2 = 11 - (somatorio2 % 11); //Subtrai o resto da divisão inteira do segundo somatório por 11, de 11.

                            int digitoVerificador1 = (valor1 > 9) ? 0 : valor1; //Substitui por 0 se o valor maior que 9.

                            int digitoVerificador2 = (valor2 > 9) ? 0 : valor2; //Substitui por 0 se o valor maior que 9.

                            //É importante transformar o valor do elemento do vetor em um inteiro antes de se fazer a comparação
                            if (Integer.parseInt(vetorCPF[9]) == digitoVerificador1 && Integer.parseInt(vetorCPF[10]) == digitoVerificador2) {
                                cpftrue = false;
                            } else {
                                cpftrue = true;
                                JOptionPane.showMessageDialog(null, "Escreva o CPF de novo");
                            }

                        }

                    }

                }
            } while (cpftrue);

            do {
                try {
                    Telefone = Integer.parseInt(JOptionPane.showInputDialog("Escreva o seu telefone sem o ddd e sem o 9 digito"));
                    vai2 = false;
                } catch (NumberFormatException e) {
                    System.err.println(e);
                    JOptionPane.showMessageDialog(null, "Escreva de novo");
                }
            } while (vai2);

            Endereco = JOptionPane.showInputDialog("Escreva o endereço");

            if (Nome != null && Idade != 0 && Email != null && Senha != null && CPF != null && Telefone != 0 && Endereco != null) {
                cadastroloop = false; // se tiver tudo ok o loop nao acontece
                uniqueID = UUID.randomUUID().variant(); //gera o id do usuario
                perfil.add(new criar_cadastro(Nome, Email, Senha, Endereco, Idade, CPF, Telefone, uniqueID));//cria o usuario
                JOptionPane.showMessageDialog(null, "O id do usuario criado: " + uniqueID + "\n"
                        + "A posicao do usuario e: " + indexU + "\n"); //Mensagem de confirmacao

            } else {

                JOptionPane.showMessageDialog(null, "Escreva as informaçoes tudo de novo");
                cadastroloop = true;//caso teja faltando algum dado vai escrever tudo de novo
            }
            indexU += 1;
        } while (cadastroloop);

    }

}

class alterar_dados extends Perfil { ////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
            criar.perfil.get(indexU).setNome(Nome);
        }

        verif2 = JOptionPane.showConfirmDialog(null, "Quer alterar a  idade?", "Selecione", JOptionPane.YES_NO_OPTION);
        if (verif2 == 0) {
            do {
                try {
                    Idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a sua idade atual"));
                    criar.perfil.get(indexU).setIdade(Idade);
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
                    criar.perfil.get(indexU).setTelefone(Telefone);
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
            criar.perfil.get(indexU).setEndereco(Endereco);

        }
    }
}

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
                criar.perfil.remove(index);
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Usuario nao existe");
            }
        } while (exclu);

    }

}

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
                JOptionPane.showMessageDialog(null, "Nome : " + criar.perfil.get(index).Nome + "\n"
                        + "Idade : " + criar.perfil.get(index).Idade + "\n"
                        + "CPF : " + criar.perfil.get(index).CPF + "\n"
                        + "Telefone : " + criar.perfil.get(index).Telefone + "\n"
                        + "Endereco : " + criar.perfil.get(index).Endereco + "\n");
                cadas = false;
            } catch (IndexOutOfBoundsException e) {
                System.err.println(e);
                JOptionPane.showMessageDialog(null, "Usuario nao existe");
            }
        } while (cadas);

    }

}

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
