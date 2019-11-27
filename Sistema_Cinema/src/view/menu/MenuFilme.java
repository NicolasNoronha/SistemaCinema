
package view.menu;

import java.util.Scanner;
import sistemacinema.CommandFactory;


public class MenuFilme {
    
        private Scanner teclado = new Scanner(System.in);
    public void incio(){
        String op = "0";
        CommandFactory command = CommandFactory.menuFilmeInit();
        do{
        	System.out.println("------- Menu Filmes -------");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Pesquisar Filme");
            System.out.println("0 - Sair");
            System.out.println("------------------------------");
            System.out.println("Digite uma opcao:");
            op = teclado.nextLine();
            command.executeCommand(op);            
            
        }while(!op.equals("0"));
    }
    
}
