package Pessoas;

public class Pessoa {
    protected int codigo;
    protected String cep;
    protected String nome;
    protected String endereco;
    protected String bairro;
    protected String telefone;
    protected String nascimento;
    protected String email;

    public Pessoa(int codigo, int cep, String nome, String endereco, String bairro, String telefone, String nascimento, String email){
        this.codigo = codigo;
        this.cep = cep;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
