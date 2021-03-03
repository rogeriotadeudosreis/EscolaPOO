package escola;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String sigla;

	private int ano;

	private ArrayList<Aluno> alunos;

	private ArrayList<Professor> professores;

	private ArrayList<Disciplina> disciplinas;

	public Turma() {
		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();
		disciplinas = new ArrayList<Disciplina>();

	}

	public Turma(String sigla, int ano) {
		super();
		this.sigla = sigla;
		this.ano = ano;
	}

	public void adicionaAluno(Aluno aluno) {
		alunos.add(aluno);

	}

	public int quantDeAlunos() {
		return alunos.size();
	}

	public void deleteAluno(Aluno aluno) {
		alunos.remove(aluno);
	}

	public Aluno getAluno(int posicao) {
		return alunos.get(posicao);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Turma [sigla=" + sigla + ", ano=" + ano + "]";
	}

}
