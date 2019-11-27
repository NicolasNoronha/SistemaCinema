package model;


public class Ingresso {
        
        private Sessao sessao;

	public Ingresso(Sessao sessao) {
		this.sessao = sessao;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public String toString() {
		String mensagem = "Ingresso da " + sessao.toString();
		return mensagem;
	}
        
    
    
    
    
}//final ingresso
