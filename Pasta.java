package trabalho6;

import java.util.ArrayList;

public class Pasta {
	private String nomePasta;
	private ArrayList<Arquivo> listaArquivo = new ArrayList<Arquivo>();

	public Pasta(String nomePasta) {
		this.nomePasta = nomePasta;
	}

	public void inserirArquivo(Arquivo nomeArquivo) {
		listaArquivo.add(nomeArquivo);
	}

	public void deletarArquivo(String nomeArquivo) {
		for (Arquivo i : listaArquivo) {
			if(i.getNomeArquivo().equals(nomeArquivo)) {
				listaArquivo.remove(i);
				break;
			}
		}
	}

	public void duplicarArquivo(String nomeArquivo) {
		ArrayList<String> temp = new ArrayList<String>();
		int n = 0;
		for (Arquivo i : listaArquivo) {
			temp.add(i.getNomeArquivo());
			if(i.getNomeArquivo().contains(nomeArquivo)) n++;
		}
		if (!temp.contains(nomeArquivo))
			System.out.println("Nenhum arquivo encontrado!");
		else {
			listaArquivo.add(new Arquivo(nomeArquivo += "(" + String.valueOf(n) + ")"));
		}
	}

	public void listarArquivos() {
		for (Arquivo i : listaArquivo) {
			System.out.println(i.getNomeArquivo());
		}
	}
	
	public void imprimirNome() {
		System.out.println(nomePasta);
	}

	public String getNome() {
		return nomePasta;
	}
}
