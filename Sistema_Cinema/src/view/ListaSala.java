
package view;

import Repositorio.RepositorioSala;
import java.util.Scanner;


public class ListaSala {
    
    private Scanner teclado = new Scanner(System.in);
	private RepositorioSala listaSala = RepositorioSala.getInstance();
	
	public void lista(){
		System.out.println("------- Lista de Salas -------");
		System.out.println(listaSala.listar());
	}
    
}
