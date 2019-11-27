
package view;

import Repositorio.RepositorioSala;
import java.util.Scanner;
import model.Sala;


public class CadastrarSala {
    
    private Scanner teclado = new Scanner(System.in);
	private Repositorio.RepositorioSala listaSala = RepositorioSala.getInstance();

	public void cadastrar() {
		System.out.println("Informe o numero da Sala: ");
		int numero = teclado.nextInt();
		if (verificaSala(numero) == false) {
			System.out.println("Informe o numero de assentos: ");
			int assentos = teclado.nextInt();
			if (verificaAssentos(assentos)) {
				listaSala.add(new Sala(numero, assentos));
				System.out.println("Sala cadastrada com sucesso!");
			}
			else{
				System.out.println("Numero de assentos tem que ser maior que 0");
			}
		}
		else{
			System.out.println("Sala ja cadastrada");
		}
	}

	public boolean verificaSala(int numero) {
		return listaSala.existSalaID(numero);
	}

	public boolean verificaAssentos(int numero) {
		if (numero > 0)
			return true;
		return false;
	}
}
