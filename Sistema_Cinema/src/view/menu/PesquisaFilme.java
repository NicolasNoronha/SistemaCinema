
package view.menu;

import java.util.Scanner;
import Repositorio.RepositorioFilme;


public class PesquisaFilme {
    
        	private RepositorioFilme filmes = RepositorioFilme.getInstance();
	private Scanner teclado = new Scanner(System.in);
	
	
	public void pesquisarFilme(){
		System.out.println("------- Pesquisar Filmes -------");
		System.out.println("Informe o nome do Filme: ");
		String nome = teclado.nextLine();
		if(nome.length() > 0){
			if(filmes.existFilme(nome))
				System.out.println(filmes.getFilme(nome).toString());
			else{
				System.out.println("Nao foi encontrado nenhum filme com o seguinte nome: " + nome);
			}
		}
		else{
			System.out.println("Nome nao pode ser vazio! Por favor, informar algum nome de filme");
		}
		
	}
}
