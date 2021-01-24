/**
 * 
 */
package br.com.a4solutions.springboot.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.a4solutions.springboot.entidades.Aluno;

/**
 * @author Dagson Souza
 *
 */
public interface RepositorioAluno extends JpaRepository<Aluno, Long>{
	List<Aluno> findByNomeContaining(String nome);
}
