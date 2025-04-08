package application;

import model.entities.iPhone;

public class Program {

	public static void main(String[] args) {
		
		  // Cria uma instância da classe iPhone
        iPhone meuiPhone = new iPhone();

        // Utilizando os métodos da interface ReprodutorMusical
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.selecionarMusica("Bohemian Rhapsody");
        System.out.println();

        // Utilizando os métodos da interface AparelhoTelefonico
        meuiPhone.ligar("(11)983911989");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();
        System.out.println();

        // Utilizando os métodos da interface NavegadorInternet
        meuiPhone.exibirPagina("www.google.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
