package exercicio.pkg1;

import javax.swing.JOptionPane;

class ServicoTelefonia {

    protected String operadora;
    protected Double distancia;

    public ServicoTelefonia(Double distancia, String operadora) {
        setDistancia(distancia);
        setOperadora(operadora);
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

}

class Dispositivos extends ServicoTelefonia {

    protected String cor;
    protected String formato;

    public Dispositivos(Double distancia, String operadora, String cor, String formato) {
        super(distancia, operadora);
        setCor(cor);
        setFormato(formato);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}

class TelefoneMoveil extends Dispositivos {

    String bateria, frequencia;

    public TelefoneMoveil(Double distancia, String operadora, String cor, String formato, String bateria, String frequencia) {
        super(distancia, operadora, cor, formato);
        setBateria(bateria);
        setFrequencia(frequencia);
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public void link() {

    }
}

class TelefoneFixo extends Dispositivos {

    double cabo;
    boolean fixacao;

    public TelefoneFixo(Double distancia, String operadora, String cor, String formato, double cabo, boolean fixacao) {
        super(distancia, operadora, cor, formato);
        setCabo(cabo);
        setFixacao(fixacao);
    }

    public double getCabo() {
        return cabo;
    }

    public void setCabo(double cabo) {
        this.cabo = cabo;
    }

    public boolean isFixacao() {
        return fixacao;
    }

    public void setFixacao(boolean fixacao) {
        this.fixacao = fixacao;
    }

}

class Exercicio1 {

    public static void main(String[] args) {
        TelefoneMoveil m = new TelefoneMoveil(126.98, "Tim", "Verde", "Retangular", "4000mp", "700m");
        TelefoneFixo f = new TelefoneFixo(24.08, "Brasil-telecom", "Preto", "Quadrado", 15.00, false);
    }
}
