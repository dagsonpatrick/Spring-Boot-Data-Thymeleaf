/**
 * 
 */
package br.com.a4solutions.springboot.entidades;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Dagson Souza
 *
 */
@Entity
public class Instituicao {
	
	@Id
	@GeneratedValue
	Long id;
	
	@Column(length = 30)
	String nome;
	
	@Column(length = 100)
	String endereco;
	
	@OneToMany(mappedBy = "instituicao")
	private Set<Aluno> alunos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
	

}
