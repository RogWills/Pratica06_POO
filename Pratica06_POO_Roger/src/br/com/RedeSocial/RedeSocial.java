package br.com.RedeSocial;

import java.util.ArrayList;

public class RedeSocial {
    private String dataCriacao,nomeUsuario,dataNascimento,senha;
    ArrayList<Publicacao> publicacoes = new ArrayList<>();//Criar a variável publicações que deverá ser um ArrayList do tipo Publicacao.
//Criar o método void inserePublicacao(Publicacao publi) que deverá receber um objeto do tipo Publicacao e inserir no ArrayList
    void inserePublicacao(Publicacao publi){
        publicacoes.add(publi);
    }
    //Criar o método void imprimePublicacoes() que deverá mostrar o total de publicações, chamando o método getContadorPublicacao(). Além de mostrar o conteúdo do ArrayList publicacoes, como dataPublicacao e textoPublicacao.

    void imprimePublicacoes(){
        System.out.println("Total de Publicaçoes: "+Publicacao.getContadorPublicacao());
        for (int i=0; i<publicacoes.size();i++){
            System.out.println("Data da Publicaçao: " +publicacoes.get(i).getDataPublicacao());//
            System.out.println("Texto da Publicação: "+ publicacoes.get(i).getTextoPublicacao());

        }
    }
    //Criar o construtor de RedeSocial que recebe todos os atributos para criar uma Rede Social.
    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
