package br.com.pontos.prjCurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pontos.prjCurso.domain.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {
	
	
}

