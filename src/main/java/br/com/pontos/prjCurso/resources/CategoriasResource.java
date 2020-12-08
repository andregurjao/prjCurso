package br.com.pontos.prjCurso.resources;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriasResource {

	/*
	@GetMapping
	@PostMapping
	Podemos utilizar sem problemas nenhum, o efeito é o mesmo:
	@GetMapping, @PostMapping, @PutMapping, @DeleteMapping ou @PatchMapping de acordo com o tipo de requisição
	A dif. é q vai importar cada anotacao desta (e ja no RequestMethod.GET/POST so importa 1 anotacap.
	*/
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está funcionando!";
	}
}
