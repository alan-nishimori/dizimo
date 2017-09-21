package Pessoas;

public class Usuario extends Pessoa {

    private String login;
    private String senha;

    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public boolean validaLogin(String login, String senha){
        if((login.compareTo(this.login) == 0) && (senha.compareTo(this.senha) == 0))
            return true;
        return false;
    }

    public void trocaSenha(String login, String senha){
        if(validaLogin(login, senha)){
            /*logica de troca de senha */
        }
    }

}
