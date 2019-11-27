
package view;

import Repositorio.RepositorioSessao;


public class ListaSessao {
 
        private RepositorioSessao sessao = RepositorioSessao.getInstance();
	
	public void listarSessoes(){
		System.out.println("------- Lista de Sess�es -------");
		System.out.println(sessao.listarSessoes());
	}
	
}
