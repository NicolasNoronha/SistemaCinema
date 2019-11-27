
package view.menu;

import java.util.Scanner;
import sistemacinema.CommandFactory;


public class MenuSala {

         private static Scanner teclado = new Scanner(System.in);
         
  
    
	    public void incio(){
	        String op = "";
                CommandFactory command = CommandFactory.menuSalaInit();
	        do{
	        	System.out.println("------- Menu Salas -------");
	            System.out.println("1 - Cadastrar Sala");
	            System.out.println("2 - Listar Salas");
	            System.out.println("3 - Pesquisar Sala");
	            System.out.println("0 - Sair");
	            op = teclado.nextLine();
	            
	            command.executeCommand(op);
	            
	        }while(!op.equals("0"));
	    }
}


