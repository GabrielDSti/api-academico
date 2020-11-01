package br.edu.ifgoias.academico.config;

import br.edu.ifgoias.academico.entities.Aluno;
import br.edu.ifgoias.academico.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.edu.ifgoias.academico.entities.Curso;
import br.edu.ifgoias.academico.repositories.CursoRepository;

import java.util.Date;

@Configuration
public class Config implements CommandLineRunner{

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Date data = new Date();

		Aluno a1 = new Aluno(null,"Gabriel Dias","Masculino",data );
		Aluno a2 = new Aluno(null,"Isabella M.","Feminino",data );
		Aluno a3 = new Aluno(null,"Debora G.","Feminino",data );

		alunoRepository.save(a1);
		alunoRepository.save(a2);
		alunoRepository.save(a3);


		//Curso c1 = new Curso(null, "Spring");
		//Curso c2 = new Curso(null, "JPA");
		
		//cursoRepository.save(c1);
		//cursoRepository.save(c2);
	}
	
}
