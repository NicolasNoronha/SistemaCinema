
package Repositorio;

import java.util.ArrayList;
import model.Filme;

public class RepositorioFilme {
    
    private static RepositorioFilme instance;
    private ArrayList<Filme> listaFilme;

    	private RepositorioFilme(){
            listaFilme = new ArrayList<Filme>();
        }
        
        //Gera a instancia do filme
        public static RepositorioFilme getInstance(){
            if(instance == null)
                instance = new RepositorioFilme();
            return instance;
        }
        
        //Adicionar Filme
        
        public boolean add(Filme filme) {
		if (existFilme(filme))
			return false;
		else {
			listaFilme.add(filme);
			return true;
		}
	}
        
        //Verifica que o filme ja exixte procurando pelo objeto
        public boolean existFilme(Filme filme) {
		if (listaFilme.size() == 0) {
			return false;
		} else {
			for (Filme f : listaFilme) {
			if (f.equals(filme))
			return true;
			}
		}
		return false;
	}
        
        //Verifica o filme ja exixte procurando pelo nome
        public boolean existFilme(String name) {
		if (listaFilme.size() == 0) {
			return false;
		} else {
			for (Filme f : listaFilme) {
				if (f.getNome().equals(name)) {
					return true;
				}
			}
		}
		return false;
	}
        
        //Lista todos os filme Cadastrados
        public String listarFilmes() {
		String mensagem = "";
		if (listaFilme.size() == 0) {
			return "Nenhum Filme cadastrado";
		} else {
		for (int i = 0; i < listaFilme.size(); i++) {
		mensagem += i + " - " + listaFilme.get(i).getNome() + "\n";
		}

		}
		return mensagem;
	}
        
        //Retorna um Filme procurando pelo nome
        public Filme getFilme(String nome) {
		if (listaFilme.isEmpty() == false || existFilme(nome)) {
			for (Filme f : listaFilme) {
				if (f.getNome().equals(nome)) {
					return f;
				}
			}

		}
                
		return null;
	}
         
        
        //Retorna um filme pelo id
        public Filme getFilmeByIndex(int numero) {
		if (numero >= 0) {
		if (listaFilme.isEmpty() == false) {
		if (listaFilme.size() > numero)
		return listaFilme.get(numero);
			}
		}

		return null;
	}
        
        public void adicionaVendaDoFilme(Filme f, int quantidade){
		for(int i = 0; i < listaFilme.size(); i++){
			if(listaFilme.get(i).getNome().equals(f.getNome())){
				listaFilme.get(i).setQuantidade(quantidade);
			}
		}
	}
        public String top10Filmes(){
		String top10 = "Nao teve venda de ingresso ate o momento";
		
		if(listaFilme.size() > 0){
			ArrayList<Filme> top = sort();
			top10 = "";
			for(int i = 0; i < top.size(); i++){
				if(i < 10){
					top10 +=  i + " - " + top.get(i).getNome() + " - " + top.get(i).getQuantidadeVendida() +  "\n"; 
				}
			}
		}
              
		
		return top10;
	}
        
        public ArrayList<Filme> sort(){
		ArrayList<Filme> top = (ArrayList<Filme>) listaFilme.clone();
		for(int i = 0; i < top.size(); i++){
			for(int j = 0; j < top.size() - 1; j++){
				if(top.get(j).getQuantidadeVendida() < top.get(j + 1).getQuantidadeVendida())
					swap(top, j, j +1);
			}
		}
		
		return top;
	}
	public void swap(ArrayList<Filme> l, int i, int j){
		Filme aux = l.get(i);
		l.set(i, l.get(j));
		l.set(j, aux);
		
	}
}//final Adicionar Filme
