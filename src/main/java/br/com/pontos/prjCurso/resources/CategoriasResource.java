package br.com.pontos.prjCurso.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pontos.prjCurso.domain.Categorias;
import br.com.pontos.prjCurso.services.CategoriasService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriasResource {
	
	@Autowired
	private CategoriasService service;
	
	/*
	@GetMapping
	@PostMapping
	Podemos utilizar sem problemas nenhum, o efeito é o mesmo:
	@GetMapping, @PostMapping, @PutMapping, @DeleteMapping ou @PatchMapping de acordo com o tipo de requisição
	A dif. é q vai importar cada anotacao desta (e ja no RequestMethod.GET/POST so importa 1 anotacap.
	*/
	@RequestMapping(method=RequestMethod.GET)
	//public String listar() {
	public List<Categorias> Listar() {
		Categorias cat1 = new Categorias(1, "Cat1 - Informatica");
		Categorias cat2 = new Categorias(2, "Cat2 - Escritorio");
		
		List<Categorias> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
			
		//return "REST está funcionando!";
		return lista;
	}
	@RequestMapping(value="/{codId}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer codId) {
		Categorias obj = service.buscar(codId);
		return ResponseEntity.ok().body(obj);
	}
}
