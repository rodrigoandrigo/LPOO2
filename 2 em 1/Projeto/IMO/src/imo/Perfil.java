package imo;

abstract class Perfil {///////////////////////////////////////////////////////Classe Pai/////////////////////////////////////////////////////////

    protected String Nome, Email, Senha, Endereco, CPF;
    protected int Idade, Telefone, uniqueID;

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

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }
}
