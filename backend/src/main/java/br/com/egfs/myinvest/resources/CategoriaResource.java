package br.com.egfs.myinvest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.egfs.myinvest.domain.Categoria;
import br.com.egfs.myinvest.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "http://localhost:3000")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listarTodas(){
		return categoriaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Categoria buscarPeloId(@PathVariable Long id) {
		return categoriaRepository.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		categoriaRepository.deleteById(id);
	}
	
	@PostMapping
	public Categoria cadastrar(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
}
