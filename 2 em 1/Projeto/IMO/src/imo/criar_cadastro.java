package imo;

import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

class criar_cadastro extends Perfil { 

    protected boolean vai = true, vai1 = true, vai2 = true, vai4 = true, cadastroloop = true, email1 = true, cpftrue = true;//atributos usados nas excesoes e nos loops
    protected int indexU = 0; // Id de identificaçao do usuario e index do array list
    protected ArrayList<Perfil> perfill = new ArrayList();//Arraylist usado para guarda as informacoes do perfil
    Perfil perfilcadastrado = new Perfil() {
    };

    public criar_cadastro(String Nome, String Email, String Senha, String Endereco, int Idade, String CPF, int Telefone, int uniqueID) {
        super(Nome, Email, Senha, Endereco, Idade, CPF, Telefone);
        setUniqueID(uniqueID);
    }

    public criar_cadastro() {

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
                perfilcadastrado.setNome(Nome);
                perfilcadastrado.setEmail(Email);
                perfilcadastrado.setSenha(Senha);
                perfilcadastrado.setEndereco(Endereco);
                perfilcadastrado.setIdade(Idade);
                perfilcadastrado.setCPF(CPF);
                perfilcadastrado.setTelefone(Telefone);
                perfilcadastrado.setUniqueID(uniqueID);
                perfill.add(perfilcadastrado);//cria o usuario
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
