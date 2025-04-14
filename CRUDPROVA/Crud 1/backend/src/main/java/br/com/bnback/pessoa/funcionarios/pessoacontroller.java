package br.com.bnback.pessoa.pessoacontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/product")
@RestController
public class PessoaController {

	@Autowired
	private PessoaControllerService pessoaControllerService;

	@PostMapping
	private Pessoa createPessoa(@RequestBody Pessoa pessoa) {
		return pessoaService.insertPessoa(pessoa);
	}

	@GetMapping
	private List<Pessoa> findAll() {
		return pessoaService.findAll();
	}

	@DeleteMapping("/{id}")
	private void deleteById(@PathVariable Long id) {
		productService.deleteById(id);
	}

	@GetMapping("/{id}")
	private Pessoa findyById(@PathVariable Long id) {
		return productService.findById(id);
	}

	@PutMapping("/{id}")
	private Pessoa update(@RequestBody Pessoa pessoa, @PathVariable Long id) {
		return pessoaService.updatePessoa(id,pessoa);
	}

}
