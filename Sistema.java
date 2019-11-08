package trabalho6;

public class Sistema {
	public static void main(String[] args) {
		Disco d = new Disco('C');
		Pasta escola = d.criarPasta("Escola");
		Pasta pessoal = d.criarPasta("Pessoal");
		d.listarPasta(); // lista as pastas Escola e Pessoal
		Texto t = new Texto("Trabalho 10");
		escola.inserirArquivo(t);
		Apresentacao a = new Apresentacao("Defesa Projeto 2");
		escola.inserirArquivo(a);
		Planilha p = new Planilha("Calculo 2");
		escola.inserirArquivo(p);
		escola.listarArquivos();
		Video v = new Video("Aniversario");
		pessoal.inserirArquivo(v);
		Imagem i = new Imagem("Foto RJ");
		pessoal.inserirArquivo(i);
		Som s = new Som("Musica Chico");
		pessoal.inserirArquivo(s);
		pessoal.listarArquivos();
		t.abrir();
		a.abrir();
		p.abrir();
		v.abrir();
		i.abrir();
		s.abrir();
		escola.deletarArquivo("Trabalho 10");
		escola.duplicarArquivo("Defesa Projeto 2");
		escola.listarArquivos();
		d.deletarPasta("Pessoal");
		d.listarPasta();
	}
}
