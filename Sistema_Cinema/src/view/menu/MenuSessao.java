
package view.menu;

import java.util.Scanner;
import sistemacinema.CommandFactory;

public class MenuSessao {
    
    	private Scanner teclado = new Scanner(System.in);
	
	public void opcoesAcao(){
		String op = "";
        CommandFactory command = CommandFactory.menuSessaoInit();
    do{
    	System.out.println("------- Menu Sessao -------");
        System.out.println("1 - Cadastrar Sessao");
        System.out.println("2 - Listar Sessoes");
        System.out.println("3 - Pesquisar Sessoes");
        System.out.println("0 - Sair");
        op = teclado.nextLine();
        
        command.executeCommand(op);
        
    }while(!op.equals("0"));
	}
    
}
