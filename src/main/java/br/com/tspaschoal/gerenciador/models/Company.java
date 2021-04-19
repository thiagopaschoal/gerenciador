package br.com.tspaschoal.gerenciador.models;

public class Company {

    private int id;
    private String nome;
    private String tamanho;

    public Company(String nome, String tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

}
