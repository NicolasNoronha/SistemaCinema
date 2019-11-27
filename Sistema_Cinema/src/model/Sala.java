package model;

public class Sala {
    
    private int numeroSala;
    private int quantidadeAssento;
    private int assentosDisponiveis;
    
    public Sala(int numero, int quantidade){
		this.numeroSala = numero;
		this.quantidadeAssento = quantidade;
		this.assentosDisponiveis = this.quantidadeAssento;
	}
     //atualiza o valor da sala para o numero x. Se atualizar true , se nao false
    public boolean setNumeroSala(int numero){
		if(numero > 0){
			this.numeroSala = numero;
			return true;
		}
		else{
			return false;
		}
	}
    //retorna o numero da sala
          public int getNumeroSala(){
		return this.numeroSala;
	}
   
          //atualiza a quantidade de assentos disponiveis para venda
          public boolean setQuantidadeAssento(int quantidade){
		if(quantidade > 0){
			this.quantidadeAssento = quantidade;
			return true;
		}
		else{
			return false;
		}
	}
    
         public int getAssentosDisponiveis(){
		return assentosDisponiveis;
	}
         
         public boolean atualizaAssentosDisponiveis(int quantidade){
		if(assentosDisponiveis > 0){
			assentosDisponiveis -= quantidade;
			return true;
		}
		
		return false;
	}
         
         public String toString(){
		String mensagem = "Numero Sala: " + this.getNumeroSala() + " " +
						  "Quantidade de Assentos Disponiveis: " + this.getAssentosDisponiveis();
		
		return mensagem;
	}

   
    
}//final sala
