package model;


public class Filme {
    
    private String nomeFilme;
	private String genero;
	private String sinopse;
	private int quantidadeVendida = 0;
	public Filme(String nome, String genero, String sinopse) {
		
		this.nomeFilme = nome;
		this.genero = genero;
		this.sinopse = sinopse;
	}
	

	public void setNome(String nome) {
		this.nomeFilme = nome;
	}

	public String getNome() {
		return this.nomeFilme;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getSinopse() {
		return this.sinopse;
	}
		

	public boolean equals(Filme filme) {
		if (filme.getNome() == this.getNome())
			return true;

		return false;
	}
	
	public void setQuantidade(int quantidade){
		this.quantidadeVendida = quantidade;
	}
	
	public int getQuantidadeVendida(){
		return this.quantidadeVendida;
	}

	public String toString() {
		String msg = "Nome: "
				+ this.getNome() + "\n" + "Genero: " + this.getGenero() + "\n"
				+ "Sinopse: " + this.getSinopse();
		return msg;

	}
    
    
    
    
}//final filme
