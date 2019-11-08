package trabalho6;

import java.util.ArrayList;

public class Disco {
	private char nomeDisco;
	private ArrayList<Pasta> listaPasta = new ArrayList<Pasta>();
	public ArrayList<lista> x = new ArrayList<lista>();

	public Disco(char nomeDisco) {
		this.nomeDisco = nomeDisco;
	}

	public Pasta criarPasta(String nomePasta) {
		Pasta x = new Pasta(nomePasta);
		listaPasta.add(x);
		return x;
	}

	public void deletarPasta(String nomePasta) {
		for (Pasta i : listaPasta) {
			if (i.getNome().equals(nomePasta)) {
				listaPasta.remove(i);
				break;
			}
		}
	}

	public void listarPasta() {
		for (Pasta i : listaPasta) {
			System.out.println(i.getNome());
		}
	}
}
