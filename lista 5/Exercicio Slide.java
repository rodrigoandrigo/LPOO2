package exercicio.pkg5;

import javax.swing.JOptionPane;

class Disciplina {

    protected String nome, periodo;
    protected double nota1, nota2;

    Disciplina(String nome, String periodo, double nota1, double nota2) {
        this.nome = nome;
        this.periodo = periodo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double avaliarDisciplina(double nota) {
        return nota;
    }
}

class DisciplinaTrimestral extends Disciplina {

    public DisciplinaTrimestral(String nome, String periodo, double nota1, double nota2) {
        super(nome, periodo, nota1, nota2);

    }

    double avaliarDisciplina(double nota) {
        nota = (nota1 * 0.4) + (nota2 * 0.6);
        JOptionPane.showMessageDialog(null, "A sua nota trimestral foi:" + nota + "" + "\n");
        return nota;

    }
}

class DisciplinaSemestral extends Disciplina {

    double nota3;

    public DisciplinaSemestral(String nome, String periodo, double nota1, double nota2, double nota3) {
        super(nome, periodo, nota1, nota2);
        this.nota3 = nota3;
    }

    double avaliarDisciplina(double nota) {
        nota = (nota1 + nota2 + nota3) / 3.0;
        JOptionPane.showMessageDialog(null, "A sua nota semestral foi:" + nota + "" + "\n");
        return nota;

    }
}

class DisciplinaAnual extends Disciplina {

    private double nota3, nota4, nota5, nota6, nota;

    public DisciplinaAnual(String nome, String periodo, double nota1, double nota2, double nota3, double nota4, double nota5, double nota6) {
        super(nome, periodo, nota1, nota2);
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.nota6 = nota6;
    }

    double avaliarDisciplina(double nota) {
        nota = ((nota1 + nota2 + nota3 + nota4 + nota5) / 5.0 * 0.6) + (nota6 * 0.4);
        JOptionPane.showMessageDialog(null, "A sua nota anual foi:" + nota + "" + "\n");
        return nota;
    }
}

public class Exercicio5 {

    public static void main(String[] args) {
        String nome, periodo;
        Double nota1, nota2, nota3, nota4, nota5, nota6;
        nome = JOptionPane.showInputDialog("Escreva o seu nota");
        periodo = JOptionPane.showInputDialog("Escreva o periodo");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a primeira nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a segunda nota"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a terceira nota"));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a quarta nota"));
        nota5 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a quinta nota"));
        nota6 = Double.parseDouble(JOptionPane.showInputDialog("Escreva a sexta nota"));
        Disciplina[] periodoaula = new Disciplina[3];
        periodoaula[0] = new DisciplinaTrimestral(nome, periodo, nota1, nota2);
        periodoaula[1] = new DisciplinaSemestral(nome, periodo, nota1, nota2, nota3);
        periodoaula[2] = new DisciplinaAnual(nome, periodo, nota1, nota2, nota3, nota4, nota5, nota6);
        for (int x = 0; x < periodoaula.length; x++) {
            periodoaula[x].avaliarDisciplina(0);
        }

    }

}
