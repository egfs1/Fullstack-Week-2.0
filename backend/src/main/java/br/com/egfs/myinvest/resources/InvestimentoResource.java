package br.com.egfs.myinvest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.egfs.myinvest.domain.Investimento;
import br.com.egfs.myinvest.repository.InvestimentoRepository;

import java.util.List;


@RestController
@RequestMapping("/investimentos")
@CrossOrigin(origins = "http://localhost:3000")
public class InvestimentoResource {
	
	@Autowired
	private InvestimentoRepository investimentoRepository;
	
	@GetMapping
	public List<Investimento> listarTodos(){
		return investimentoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Investimento buscarPeloId(@PathVariable Long id) {
		return investimentoRepository.findById(id).orElse(null);
	}
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable Long id) {
		investimentoRepository.deleteById(id);
	}
	
	@PostMapping
	public Investimento cadastrar(@RequestBody Investimento investimento) {
		return investimentoRepository.save(investimento);
	}
}
