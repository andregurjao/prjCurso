package br.com.pontos.prjCurso.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pontos.prjCurso.domain.Categorias;
import br.com.pontos.prjCurso.repositories.CategoriasRepository;

@Service
public class CategoriasService {

	@Autowired
	private CategoriasRepository repo;
	
	public Categorias buscar(Integer id) {
		 Optional<Categorias> obj = repo.findById(id);
		 return obj.orElse(null);
	}
}
