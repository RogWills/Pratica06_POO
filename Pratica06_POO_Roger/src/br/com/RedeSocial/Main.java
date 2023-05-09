package br.com.RedeSocial;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        String dataCriacao, nomeUsuario, dataNascimento, senha,dataPublicacao,textoPublicacao,linkmidia;

        dataCriacao = JOptionPane.showInputDialog("Digite a data de criação da Rede Social");
        nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuario");
        dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
        senha = JOptionPane.showInputDialog("Digite a senha");
        RedeSocial redesocial1 = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento,senha);

        Publicacao publi1;
        ArrayList<Publicacao> publi = new ArrayList<>();

        for(int i=0; i<3; i++){
            dataPublicacao=JOptionPane.showInputDialog("Digite a data da publicação");
            textoPublicacao=JOptionPane.showInputDialog("Digite o texto");
            linkmidia=JOptionPane.showInputDialog("Digite o link");
            publi1 = new Publicacao(dataPublicacao,textoPublicacao,linkmidia);
            publi.add(publi1);//Adiciona o objeto no ArrayList.

            redesocial1.inserePublicacao(publi1);//Adiciona o Objeto na RedeSocial "OU publi.get(i)

        }
        redesocial1.imprimePublicacoes();
    }
}