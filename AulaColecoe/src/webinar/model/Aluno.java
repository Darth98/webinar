package webinar.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String matricula;
	private String nome;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	private String email;

	@OneToMany(mappedBy = "seminario")
	Set<InscricaoSeminario> inscricoes = new HashSet<InscricaoSeminario>();
	
	

	public Set<InscricaoSeminario> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(Set<InscricaoSeminario> inscricoes) {
		this.inscricoes = inscricoes;
	}

	public Aluno() {
	}

	public Aluno(String matricula, String nome, Endereco endereco, String email) {
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
