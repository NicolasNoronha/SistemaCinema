package sistemacinema;

import Repositorio.RepositorioFilme;
import Repositorio.RepositorioIngresso;
import Repositorio.RepositorioSessao;
import java.util.Scanner;

public class Relatorio {
    
    	private Scanner teclado;
	private Repositorio.RepositorioSessao s = RepositorioSessao.getInstance().getInstance();
	private RepositorioFilme f = RepositorioFilme.getInstance();	
	private RepositorioIngresso ingresso = RepositorioIngresso.getInstance();
	public void selecionarRelatario(){
		CommandFactory command = CommandFactory.menuRelatorio();
		teclado  = new Scanner(System.in);
		System.out.println("1 - Venda por Filme");
		int op = teclado.nextInt();
		command.executeCommand("" + op);
	}
	
	public void vendaFilme(){
		System.out.println(f.top10Filmes());
	}
}
