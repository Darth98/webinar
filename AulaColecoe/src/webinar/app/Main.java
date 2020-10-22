package webinar.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import webinar.dao.JPAUtil;
import webinar.model.Aluno;
import webinar.model.Endereco;
import webinar.model.Formacao;
import webinar.model.InscricaoSeminario;
import webinar.model.Instrutor;
import webinar.model.Seminario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
//			
//		Endereco  endereco = new Endereco();
//		endereco.setRua("Rua Sul 26");
//		endereco.setCidade("Alfenas");
//
//		Aluno aluno = new Aluno();
//		aluno.setNome("Marcos");
//		aluno.setEmail("marcos.gouro@gouro.com.br");
//		aluno.setMatricula("236521478");
//		aluno.setEndereco(endereco);
//		
//		Endereco  endereco2 = new Endereco();
//		endereco.setRua("Rua Nordeste");
//		endereco.setCidade("Alfenas");
//
//		Aluno aluno2 = new Aluno();
//		aluno.setNome("Gustavo");
//		aluno.setEmail("gustavo.gouro@gouro.com.br");
//		aluno.setMatricula("200521423");
//		aluno.setEndereco(endereco);
//		
//		em.getTransaction().begin();
//		em.persist(endereco);
//		em.persist(aluno);
//		em.getTransaction().commit();
//		em.getTransaction().begin();
//		em.persist(endereco2);
//		em.persist(aluno2);
//		em.getTransaction().commit();
//		
//		Instrutor instrutor = new Instrutor("Batman",new Endereco("Rua Marau 245","Alfenas"),"bat@hotmail.com", 1000, Formacao.JEDI);
//		Instrutor instrutor2 = new Instrutor("Robim",new Endereco("Rua Carvalho 25","Alfenas"),"robim@hotmail.com", 1000, Formacao.GRADUADO);
//		
//		em.getTransaction().begin();
//		em.persist(instrutor);
//		em.persist(instrutor2);
//		em.getTransaction().commit();
//		
//		List<Instrutor> instrutores = new ArrayList();
//		instrutores.add(instrutor);
//		instrutores.add(instrutor2);
//		
//		Seminario seminario = new Seminario("Palestra Java",101 ,60.00 ,instrutores);
//		
//		em.getTransaction().begin();
//		em.persist(seminario);
//	    em.getTransaction().commit();
		
		Seminario semicon = em.find(Seminario.class, 1);
		Aluno alunocon = em.find(Aluno.class, 1);
		
		InscricaoSeminario inscricao = new InscricaoSeminario(alunocon, semicon);
		
		em.getTransaction().begin();
		em.persist(inscricao);
		em.getTransaction().commit();
		
		
		JPAUtil.shutdown();
	}

}
