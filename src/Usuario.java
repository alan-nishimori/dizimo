public class Usuario extends Pessoa {

    private String login, senha;

    public Usuario(int codigo, int cep, String nome, String endereco, String bairro, String telefone, String nascimento, String email, String login, String senha){
        this.codigo = codigo;
        this.cep = cep;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

}
