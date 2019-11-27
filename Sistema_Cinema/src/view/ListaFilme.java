
package view;

import Repositorio.RepositorioFilme;

public class ListaFilme {
    
    private RepositorioFilme filmes = RepositorioFilme.getInstance();
	
	public void listar(){
		System.out.println("------- Lista de Filmes -------");
		System.out.println(filmes.listarFilmes());
	}
    
}
