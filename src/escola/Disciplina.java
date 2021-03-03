package escola;

import java.util.ArrayList;

public class Disciplina {

	private String nome;

	private int cargaHoraria;

	private ArrayList<Professor> professores;

	private ArrayList<Turma> turmas;

	public Disciplina() {
		professores = new ArrayList<Professor>();
	}

	public Disciplina(String nome, int cargaHoraria) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

	public void adicionarProfessor(Professor professor) {
		professores.add(professor);
	}

	public void deleteProfessor(Professor professor) {
		professores.remove(professor);
	}

	public int quantProfessores() {
		return professores.size();
	}

	public Professor getProfessor(int posicao) {
		return professores.get(posicao);
	}

	public void adicionaAluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargaHoraria(int cargaHoraria) {
		if (cargaHoraria >= 0) {
			this.cargaHoraria = cargaHoraria;
		}

	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", cargaHoraria=" + cargaHoraria + "]";
	}

}
