package Repositorio;

import java.text.DateFormat;
import java.util.ArrayList;
import model.Sessao;

public class RepositorioSessao {
    

	private ArrayList<Sessao> listaSessao;
	private static RepositorioSessao instance;

	private RepositorioSessao() {
		listaSessao = new ArrayList();
	}

	public static RepositorioSessao getInstance() {
		if (instance == null) {
			instance = new RepositorioSessao();
		}

		return instance;
	}
    
        public boolean add(Sessao sessao) {
		listaSessao.add(sessao);
		return true;
	}
        
        public boolean isSalaAvailable(int numero, String horario) {
		DateFormat hora = DateFormat.getTimeInstance();
		String horaSessao = "";
		if (listaSessao.isEmpty() == false) {
		for (Sessao sessao : listaSessao) {
		if (sessao.getSala().getNumeroSala() == numero) {
		horaSessao = hora.format(sessao.getData());
                if (horaSessao.equals(horario)) {
		return false;
					}
				}

			}
		}
		return true;
	}
        
        public String listarSessoes() {
		String mensagem = "";
		if (listaSessao.isEmpty() == false) {
                 for (int i = 0; i < listaSessao.size(); i++) {
		mensagem += i + " - " + listaSessao.get(i).toString() + "\n";
		}
		}

		return mensagem;
	}
        
        public Sessao getSessaoID(int id) {
	if (listaSessao.isEmpty() == false) {
            if (listaSessao.size() > id) {
                return listaSessao.get(id);
			}
		}

		return null;
	}
        
        //atualizaa quantida de assentos na sala para aquela sessao
        public boolean atualizaAssentosSala(int index, int quantidade) {
		if (listaSessao.isEmpty() == false) {
			if (listaSessao.get(index).getSala().getAssentosDisponiveis() >= quantidade) {
				return listaSessao.get(index).getSala()
						.atualizaAssentosDisponiveis(quantidade);
			}
		}
		return false;
	}
       
}//final Repositorio
