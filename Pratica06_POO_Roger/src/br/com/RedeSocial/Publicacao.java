package br.com.RedeSocial;

public class Publicacao {


    private String dataPublicacao,textoPublicacao,linkmidia;
    public static double contadorPublicacao=0;

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    public Publicacao(String dataPublicacao, String textoPublicacao, String linkmidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkmidia = linkmidia;
        contadorPublicacao++;//Criar o construtor da classe Publicacao e atualizar o contadorPublicacaotoda vez que um objeto for criado
    }
//Criar os métodos setters dos atributos: textoPublicacao e linkMidia; E
//criar os métodos getters dos atributos: dataPublicacao,
//textoPublicacao, linkMidia e contadorPublicacao
    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public String getLinkmidia() {
        return linkmidia;
    }

    public void setLinkmidia(String linkmidia) {
        this.linkmidia = linkmidia;
    }
}
