
package sistemacinema;

import java.util.HashMap;
import java.util.stream.Collectors;
import view.CadastrarFilme;
import view.CadastrarSala;
import view.CadastrarSessao;
import view.CompraDeIngresso;
import view.ListaFilme;
import view.ListaSala;
import view.ListaSessao;
import view.menu.MenuFilme;
import view.menu.MenuSala;
import view.menu.MenuSessao;
import view.menu.PesquisaFilme;
import view.menu.PesquisaSala;

public class CommandFactory {
    
        
	private final HashMap<String, Command> commands;

	private CommandFactory() {
		commands = new HashMap<>();
	}

	public void addCommand(String nome, Command command) {
		this.commands.put(nome, command);
	}

	public void executeCommand(String nome) {
		if (commands.containsKey(nome))
			commands.get(nome).apply();
	}

	public void listCommands() {
		System.out.println("Comandos Disponiveis: "
				+ commands.keySet().stream().collect(Collectors.joining(", ")));
	}

	public static CommandFactory init() {
		CommandFactory factory = new CommandFactory();

		return factory;
	}

	public static CommandFactory menuFilmeInit() {
		CommandFactory factory = new CommandFactory();

		CadastrarFilme cadastroFilme = new CadastrarFilme();
		ListaFilme listaFilme = new ListaFilme();
		PesquisaFilme pesquisa = new PesquisaFilme();
		
		factory.addCommand("1", () -> cadastroFilme.cadastrar());
		factory.addCommand("2", () -> listaFilme.listar());
		factory.addCommand("3", () -> pesquisa.pesquisarFilme());
		return factory;
	}

	public static CommandFactory menuInicialInit() {
		CommandFactory factory = new CommandFactory();

		MenuFilme menuFilme = new MenuFilme();
		MenuSala menuSala = new MenuSala();
		MenuSessao menuSessao = new MenuSessao();
		CompraDeIngresso ingresso = new CompraDeIngresso();
		Relatorio r = new Relatorio();
		
		factory.addCommand("1", () -> menuFilme.incio());
		factory.addCommand("2", () -> menuSala.incio());
		factory.addCommand("3", () -> menuSessao.opcoesAcao()); 
		factory.addCommand("4", () -> ingresso.vendaDeIngresso());
		factory.addCommand("5", () -> r.selecionarRelatario());
		
		return factory;
	}

	public static CommandFactory menuSalaInit() {
		CommandFactory factory = new CommandFactory();

		CadastrarSala cadastroSala = new CadastrarSala();
		ListaSala listaSala = new ListaSala();
		PesquisaSala pesquisa = new PesquisaSala();
		
		factory.addCommand("1", () -> cadastroSala.cadastrar());
		factory.addCommand("2", () -> listaSala.lista());
		factory.addCommand("3", () -> pesquisa.pesquisar());
		
		return factory;
	}

	public static CommandFactory menuRelatorio() {
		CommandFactory factory = new CommandFactory();
		
		Relatorio r = new Relatorio();
		factory.addCommand("1", () -> r.vendaFilme());
		
		return factory;
	}
	
	public static CommandFactory menuSessaoInit(){
		CommandFactory factory = new CommandFactory();
		
		CadastrarSessao sessao = new CadastrarSessao();
		ListaSessao lista = new ListaSessao();
		
		factory.addCommand("1", () -> sessao.cadastrarSessao());
		factory.addCommand("2", () -> lista.listarSessoes());
		return factory;
		
	}

    
}
