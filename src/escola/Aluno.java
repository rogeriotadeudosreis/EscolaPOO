package escola;

import java.util.Date;

public class Aluno extends Pessoa {

	private Date dataNascimento;

	private Turma turma;

	public Aluno() {
		super();
	}

	public Aluno(Date dataNascimento) {
		super();
		this.dataNascimento = dataNascimento;
	}

	public void realizarAvaliacao() {

	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno [dataNascimento=" + dataNascimento + "]";
	}

}
