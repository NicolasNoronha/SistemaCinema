package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sessao {
        
        private Sala sala;
	private Date data;
	private Filme filme;

	public Sessao(Sala sala, Date data, Filme filme) {
		this.sala = sala;
		this.data = data;
		this.filme = filme;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public String trataHora(Date hora) {

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");															
		String horaFormatada = sdf.format(hora);
		
		return horaFormatada;
	}

	@Override
    public String toString() {
    	
        return "Sessao ( " + "Sala: " + sala.getNumeroSala() + ", Assentos Disponiveis: " +  sala.getAssentosDisponiveis()
             + " Data: " + trataHora(data) + ", Filme: " + filme.getNome() + ')';
    }

    
    
    
    
}//final sessao
