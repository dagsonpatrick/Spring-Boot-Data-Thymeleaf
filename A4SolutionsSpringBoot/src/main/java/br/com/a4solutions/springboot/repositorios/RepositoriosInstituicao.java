/**
 * 
 */
package br.com.a4solutions.springboot.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.a4solutions.springboot.entidades.Instituicao;

/**
 * @author Dagson Souza
 *
 */
public interface RepositoriosInstituicao extends JpaRepository<Instituicao, Long>{
	
	List<Instituicao> findByNomeContaining(String nome);
	
}
