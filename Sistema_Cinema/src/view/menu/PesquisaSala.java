
package view.menu;

import Repositorio.RepositorioSala;
import java.util.Scanner;
import model.Sala;

public class PesquisaSala {
    
        private Repositorio.RepositorioSala salaController = RepositorioSala.getInstance().getInstance();
	private Scanner teclado = new Scanner(System.in);
	
	public void pesquisar(){
		System.out.println("------- Pesquisar Sala -------");
		System.out.println("Informe o numero da Sala: ");
		
		int numeroSala = teclado.nextInt();
		Sala sala = salaController.getSala(numeroSala);
		if(sala == null){
			System.out.println("Sala nao encontrada");
		}
		else{
			System.out.println(sala.toString());
		}
		
	}
    
}
