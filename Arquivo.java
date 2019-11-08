package trabalho6;

public class Arquivo {
	private String nomeArquivo;

	public Arquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public void abrir() {
		if (this instanceof Documento) {
			System.out.println("Word");
		} else if (this instanceof Planilha) {
			System.out.println("Excel");
		} else if (this instanceof Apresentacao) {
			System.out.println("Power Point");
		} else if (this instanceof Texto) {
			System.out.println("Notepad");
		} else if (this instanceof Imagem) {
			System.out.println("Paint");
		} else if (this instanceof Som) {
			System.out.println("Groove Music");
		} else if (this instanceof Video) {
			System.out.println("VLC");
		}
	}

	public void duplicar() {

	}

	public void imprimirNome() {
		System.out.println(nomeArquivo);
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

}
