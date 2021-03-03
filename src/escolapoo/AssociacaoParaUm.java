package escolapoo;

import java.util.Date;
import java.util.Iterator;

import escola.Aluno;
import escola.Turma;

public class AssociacaoParaUm {

	public static void main(String[] args) {

		Turma turma1 = new Turma();
		turma1.setSigla("1A");
		turma1.setAno(2021);

		Aluno aluno1 = new Aluno();
		aluno1.setDataNascimento(new Date());
		aluno1.setMatricula(123);
		aluno1.setNome("Frederico");
		aluno1.setTurma(turma1);
		turma1.adicionaAluno(aluno1);

		Aluno aluno2 = new Aluno();
		aluno2.setDataNascimento(new Date());
		aluno2.setMatricula(124);
		aluno2.setNome("Godofredo");
		aluno2.setTurma(turma1);
		turma1.adicionaAluno(aluno2);

		System.out.println("Dados do Aluno 1");
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getTurma().getSigla());

		System.out.println("Alunos da Turma");
		for (int i = 0; i < turma1.quantDeAlunos(); i++) {
			System.out.println(turma1.getAluno(i).getNome());
		}
	}

}
