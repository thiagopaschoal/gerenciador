package br.com.tspaschoal.gerenciador.models;

public class User {

    private String login;
    private String senha;

    public User(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean hasCredentials(String login, String senha) {
        if (!this.login.equalsIgnoreCase(login))
            return false;
        if (!this.senha.equalsIgnoreCase(senha))
            return false;
        return true;
    }
}
