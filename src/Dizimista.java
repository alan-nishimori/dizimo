public class Dizimista extends Pessoa {
    String conjuge, nasc_conj;

    public Dizimista(int codigo, int cep, String nome, String endereco, String bairro, String telefone, String nascimento, String email, String conjuge, String nasc_conj){
        this.codigo = codigo;
        this.cep = cep;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.email = email;
        this.conjuge = conjuge;
        this.nasc_conj = nasc_conj;
    }
}
