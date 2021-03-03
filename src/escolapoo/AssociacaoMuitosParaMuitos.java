package escolapoo;

import escola.Disciplina;
import escola.Professor;

public class AssociacaoMuitosParaMuitos {

	public static void main(String[] args) {

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setCargaHoraria(80);
		disciplina1.setNome("matemática");

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setCargaHoraria(70);
		disciplina2.setNome("portugues");

		Professor professor1 = new Professor();
		professor1.setFormacaoAcademica("licenciado");
		professor1.setMatricula(123);
		professor1.setNome("joão");
		professor1.setSalario(100);

		Professor professor2 = new Professor();
		professor2.setFormacaoAcademica("licenciado");
		professor2.setMatricula(124);
		professor2.setNome("maria");
		professor2.setSalario(200);

		// relação do professor joão com matemática
		professor1.adicionaDisciplinas(disciplina1);
		disciplina1.adicionarProfessor(professor1);

		// relação do professor joão com portugues
		professor1.adicionaDisciplinas(disciplina2);
		disciplina2.adicionarProfessor(professor1);

		// relação da professora maria com portugues
		professor2.adicionaDisciplinas(disciplina2);
		disciplina2.adicionarProfessor(professor2);

		// Listar as disciplinas do professor joão
		System.out.println("\n\nDisciplinas do professor joão");
		for (int i = 0; i < professor1.quantDisciplinas(); i++) {
			Disciplina disciplinas = professor1.getDisciplina(i);
			System.out.println(disciplinas.getNome());

			// ou podemos listar desta forma
			System.out.println(professor1.getDisciplina(i).getNome());
		}

		// Listar os professores da disciplina de portugues
		System.out.println("\n\nProfessores da disciplina de portugues");
		for (int i = 0; i < disciplina2.quantProfessores(); i++) {
			Professor professores = disciplina2.getProfessor(i);
			System.out.println(professores.getNome());

			// ou ainda temos a outra opção
			System.out.println(disciplina2.getProfessor(i).getNome());
		}

	}

}
