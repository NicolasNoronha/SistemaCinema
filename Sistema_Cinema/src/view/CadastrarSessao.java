
package view;

import Repositorio.RepositorioSala;
import Repositorio.RepositorioSessao;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Sessao;
import Repositorio.RepositorioFilme;


public class CadastrarSessao {
    
    
	private Repositorio.RepositorioSessao sessao = RepositorioSessao.getInstance();
	private RepositorioFilme filme = RepositorioFilme.getInstance();
	private RepositorioSala sala = RepositorioSala.getInstance();
	private Scanner teclado = new Scanner(System.in);
	
	/**
	*	Realiza o Cadastro de uma Sessao
	* 
	*/
	public void cadastrarSessao(){
		System.out.println(filme.listarFilmes());
		System.out.println("Informe um Horario:");
		String horario = teclado.nextLine();
		if(verificaHora(horario)){
			System.out.println("Informe uma sala(numero):");
			int numero = teclado.nextInt();
			if(sala.existSalaID(numero)){
				if(sessao.isSalaAvailable(numero, horario)){
					System.out.println(filme.listarFilmes());
					int index = teclado.nextInt();									
										
					if(filme.getFilmeByIndex(index) != null){
						Calendar calendario = Calendar.getInstance();
						String[] hora = new String[2];
						hora = horario.split(":");
						calendario.set(Calendar.HOUR_OF_DAY,Integer.parseInt(hora[0]));
						calendario.set(Calendar.MINUTE,Integer.parseInt(hora[1]));
						calendario.set(Calendar.SECOND,0);
						calendario.set(Calendar.MILLISECOND,0);
						Date dia = calendario.getTime();
						Sessao novaSessao = new Sessao(sala.getSala(numero), dia, filme.getFilmeByIndex(index));
						if(sessao.add(novaSessao)){
							System.out.println("Sessao cadastrada com Sucesso\n");
							System.out.println(novaSessao.toString());
						}
					}
					else{
						System.out.println("Filme nao encontrado");
					}
				}
			}
			else{
				System.out.println("N�o ha sala com esse numero " + numero);
			}
		}
		
	}
	
	/**
	*	Verifica a se a hora se encaixa nos padr�es HH:MM
	* 	@param horario String com o valor do horario que ser� testado
	* 	@return true ou false caso esteja correto ou n�o o padr�o
	*/
	public boolean verificaHora(String horario){
		String pattern = "^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(horario);
		
		return m.find();
	}
    
}
