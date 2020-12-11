package br.com.pontos.prjCurso;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.pontos.prjCurso.domain.Categorias;
import br.com.pontos.prjCurso.repositories.CategoriasRepository;

@SpringBootApplication
public class PrjCursoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriasRepository catRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(PrjCursoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Categorias cat1 = new Categorias(null, "Informatica");
		Categorias cat2 = new Categorias(null, "Escritorio");

		catRepo.saveAll(Arrays.asList(cat1, cat2)); 
	}

}
