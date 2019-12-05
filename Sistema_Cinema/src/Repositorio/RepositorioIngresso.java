
package Repositorio;

import java.util.ArrayList;
import model.Ingresso;

public class RepositorioIngresso {
    
    
        private ArrayList<Ingresso> listaIngresso;
	public static RepositorioIngresso instance;
	
	private RepositorioIngresso(){
		listaIngresso = new ArrayList();
	}
	
	public static RepositorioIngresso getInstance(){
		if(instance == null){
			instance = new RepositorioIngresso();
		}
		
		return instance;
	}
	
	public void salvaIngersso(Ingresso ingresso){
		listaIngresso.add(ingresso);
	}
    //Gera o top 10 de filmes mais vendido
        public String top10Filmes() {
		String top10 = "Nenhum ingresso vendido ate o momento";
		int contador = 0;
		if (listaIngresso.isEmpty() == false) {
		for (int i = 0; i < listaIngresso.size(); i++) {
		contador = 0;
		for(int j = 0; j < listaIngresso.size() - 1; j++){
		if(listaIngresso.get(i).getSessao().getFilme() == listaIngresso.get(j).getSessao().getFilme()){
		contador++;
					}
				}
				
			}

			
		}
		return top10;
	}
            
}// Final do Repositorio
