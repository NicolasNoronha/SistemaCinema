
package view.menu;

import java.util.Scanner;
import sistemacinema.CommandFactory;

public class Menu {
        
    private static Scanner teclado = new Scanner (System.in);
    
    
        public static void inicia(){
    	
        String op = "";
        CommandFactory command = CommandFactory.menuInicialInit();
        do{
            System.out.println("-------Menu Inicial-------");
            System.out.println("1 - Filmes");
            System.out.println("2 - Salas");
            System.out.println("3 - Sessao");
            System.out.println("4 - Comprar Ingresso");
            System.out.println("5 - Relatarios");
            System.out.println("0 - Sair");
            System.out.println("------------------------------");
            System.out.println("Digite uma opcao:");
            op = teclado.nextLine();
            
           command.executeCommand(op);
            
        }while(!op.equals("0"));
    }

 
        
}
