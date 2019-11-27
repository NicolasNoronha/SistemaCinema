
package view;

import Repositorio.RepositorioIngresso;
import Repositorio.RepositorioSala;
import Repositorio.RepositorioSessao;
import java.util.Scanner;
import model.Ingresso;
import model.Sessao;
import Repositorio.RepositorioFilme;


public class CompraDeIngresso {
    
    
        private Repositorio.RepositorioSessao sessao = RepositorioSessao.getInstance();
	private RepositorioFilme filme = RepositorioFilme.getInstance();
	private RepositorioIngresso ingresso = RepositorioIngresso.getInstance();
	private Scanner teclado = new Scanner(System.in);
        
    public void vendaDeIngresso() {
		System.out.println("------- Compra de Ingresso -------");
		System.out.println("Listas de Sessaes Disponiveis: ");
		System.out.println(sessao.listarSessoes());
		System.out.println("Informe uma sessao (id): ");
		int opcao = teclado.nextInt();

		Sessao novaSessao = sessao.getSessaoID(opcao);
		if (novaSessao == null) {
			System.out.println("Opcao invalida");
		}		
		else {
			System.out.println("Quantos ingressos deseja comprar?");
			int quantidade = teclado.nextInt();
			if(quantidade > 0){
				if(sessao.atualizaAssentosSala(opcao, quantidade)) {
					for(int i = 0; i < quantidade; i++){
						ingresso.salvaIngersso(new Ingresso(novaSessao));
					}
					filme.adicionaVendaDoFilme(novaSessao.getFilme(), quantidade);
					System.out.println("Venda executada com sucesso!");			
				
				}
				else {
					
					System.out.println("A sala nao possui "+ quantidade +" assentos disponiveis.");
				}
			}
			else{
				System.out.println("Informe um valor valido");
			}
			
		}			
		
	}
}
