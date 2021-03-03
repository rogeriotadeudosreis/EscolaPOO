package escola;

import java.util.ArrayList;

public class Professor extends Pessoa {

	private String formacaoAcademica;

	private double salario;

	ArrayList<Disciplina> disciplinas;

	ArrayList<Turma> turmas;

	public Professor() {
		disciplinas = new ArrayList<Disciplina>();
	}

	public Professor(String formacaoAcademica, double salario) {
		super();
		this.formacaoAcademica = formacaoAcademica;
		this.salario = salario;
	}

	public void adicionaDisciplinas(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	public void deleteDisciplina(Disciplina disciplina) {
		disciplinas.remove(disciplina);
	}

	public int quantDisciplinas() {
		return disciplinas.size();
	}

	public Disciplina getDisciplina(int posicao) {
		return disciplinas.get(posicao);
	}

	public void aplicarAvaliacao() {

	}

	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [formacaoAcademica=" + formacaoAcademica + ", salario=" + salario + "]";
	}

}
