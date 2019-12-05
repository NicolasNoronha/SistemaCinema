package Repositorio;

import java.util.ArrayList;
import model.Sala;

public class RepositorioSala {
    
        private static RepositorioSala instance;
        private ArrayList<Sala> listaSala;
    
        private RepositorioSala() {
		listaSala = new ArrayList();
	}
     
        
        //adiciona um sala 
       public boolean add(Sala sala) {
		boolean isSalaAdded = false;
		if (!existSala(sala)) {
			listaSala.add(sala);
			isSalaAdded = true;
		}
		return isSalaAdded;

	}
    
       //retorna a instancia do RepositorioSala
        public static RepositorioSala getInstance() {
		if (instance == null)
			instance = new RepositorioSala();

		return instance;
	}

           //verifica se a sala ja existe, procurando por sala
        public boolean existSala(Sala sala) {
		if (listaSala.size() == 0)
			return false;
		else {
			for (Sala s : listaSala) {
				if (s.equals(sala))
					return true;
			}
			return false;
		}
	}
        
        //verifica sew a sala ja existe, e procura por id
        public boolean existSalaID(int numero) {
		if (listaSala.size() == 0) {
			return false;
		} else {
			for (int i = 0; i < listaSala.size(); i++) {
				if (listaSala.get(i).getNumeroSala() == numero) {
					return true;
				}
			}
			return false;
		}
	}
        
        //retorna a instancia de uma sala
        public Sala getSala(int numero) {
		if (listaSala.isEmpty() == false) {
		for (Sala sala : listaSala) {
		if (sala.getNumeroSala() == numero) {
		return sala;
	}
    }
}
		return null;
	}
        
        public String listar(){
		String mensagem = "";
		if(listaSala.isEmpty() == false){
		for(int i = 0; i < listaSala.size(); i++){
		mensagem += i + " - " + listaSala.get(i).toString() + "\n";
			}
		}
		
		return mensagem;
	}	
        
        
}//final repositorio
