package exercicio.pkg1;

import javax.swing.JOptionPane;

class Funcionario {

    String nome, cpf;
    int idade;
    double salario;

    public Funcionario(String nome, String cpf, int idade, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public void exibeDados() {
        JOptionPane.showMessageDialog(null, "Nome do funcionario: " + nome + "\n");
        JOptionPane.showMessageDialog(null, "CPF do funcionario: " + cpf + "\n");
        JOptionPane.showMessageDialog(null, "Idade do funcionario: " + idade + "\n");
        JOptionPane.showMessageDialog(null, "Salario do funcionario: " + salario + "\n");
    }
}

class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade, salario);
    }

    public void exibeDados() {
        JOptionPane.showMessageDialog(null, "Nome do funcionario: " + nome + "\n");
        JOptionPane.showMessageDialog(null, "CPF do funcionario: " + cpf + "\n");
        JOptionPane.showMessageDialog(null, "Idade do funcionario: " + idade + "\n");
        JOptionPane.showMessageDialog(null, "Salario do funcionario: " + salario + "\n");
    }

}

class Assistente extends Funcionario {

    int matricula;

    public Assistente(String nome, String cpf, int idade, double salario, int matricula) {
        super(nome, cpf, idade, salario);
        setMatricula(matricula);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void exibeDados() {
        JOptionPane.showMessageDialog(null, "Nome do funcionario: " + nome + "\n");
        JOptionPane.showMessageDialog(null, "CPF do funcionario: " + cpf + "\n");
        JOptionPane.showMessageDialog(null, "Idade do funcionario: " + idade + "\n");
        JOptionPane.showMessageDialog(null, "Salario do funcionario: " + salario + "\n");
    }
}

class Tecnico extends Assistente {

    double bonus;

    public Tecnico(String nome, String cpf, int idade, double salario, int matricula, double bonus) {
        super(nome, cpf, idade, salario, matricula);
        this.bonus = bonus;
    }

    public void exibeDados() {
        JOptionPane.showMessageDialog(null, "Nome do funcionario: " + nome + "\n");
        JOptionPane.showMessageDialog(null, "CPF do funcionario: " + cpf + "\n");
        JOptionPane.showMessageDialog(null, "Idade do funcionario: " + idade + "\n");
        JOptionPane.showMessageDialog(null, "Salario do funcionario: " + salario + "\n");
    }
}

class Administrativo extends Assistente {

    boolean turnoturn, turndia, turnoite;

    public Administrativo(boolean turnoturn, boolean turndia, boolean turnoite, String nome, String cpf, int idade, double salario, int matricula) {
        super(nome, cpf, idade, salario, matricula);
        this.turnoturn = turnoturn;
        this.turndia = turndia;
        this.turnoite = turnoite;
    }

    public void exibeDados() {
        JOptionPane.showMessageDialog(null, "Nome do funcionario: " + nome + "\n");
        JOptionPane.showMessageDialog(null, "CPF do funcionario: " + cpf + "\n");
        JOptionPane.showMessageDialog(null, "Idade do funcionario: " + idade + "\n");
        JOptionPane.showMessageDialog(null, "Salario do funcionario: " + salario + "\n");
    }
}

class Exercicio1 {

    public static void main(String[] args) {
        Funcionario[] Assistente = new Funcionario[2];
        Assistente[0] = new Tecnico("Vitor", "686.025.840-32", 20, 2745.58, 253790, 500.00);
        Assistente[1] = new Administrativo(true, false, true, "Manoel", "980.419.679-49", 27, 2381.52, 251200);
        for (int x = 0; x < Assistente.length; x++) {
            Assistente[x].exibeDados();
        }
    }
}
