
package view;

import java.util.Scanner;
import model.Filme;
import Repositorio.RepositorioFilme;

public class CadastrarFilme {
        
        private RepositorioFilme lista = RepositorioFilme.getInstance();
	private Scanner teclado = new Scanner(System.in);
    
        public void cadastrar() {
		System.out.println("------- Cadastro de Filme -------");
		System.out.println("Informe um nome: ");
		String nome = teclado.nextLine();

		// Verifica se nome foi preenchido
		if (nome.length() > 0) {
			// Verifica se j� existe um filme com esse nome
			if (lista.existFilme(nome) == false) {

				System.out.println("Informe um Genero: ");
				String genero = teclado.nextLine();

				// Verifica se foi preenchido
				if (genero.length() > 0) {
					System.out.println("Informe uma Sinopse: ");
					String sinopse = teclado.nextLine();

					if (sinopse.length() > 0) {
						if (lista.add(new Filme(nome, genero, sinopse))) {
							System.out.println("-------");
							System.out.println("Filme Cadastrado com Sucesso!!");
						}
					}
				} else {
					System.out.println("Genero nao pode ser vazio.");
				}
			} else {
				System.out.println("Filme ja cadastrado.");
			}
		} else {
			System.out.println("Nome nao pode ser vazio.");
		}
	}
}
