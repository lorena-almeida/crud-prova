package br.com.bnback.pessoa.product;

import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	public PessoaRepository pessoaRepository;

	public Pessoa insertPessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	public List<Pessoa> findAll() {
		return pessoaRepository.findAll();
	}

	public Pessoa findById(Long id) {
		return pessoaRepository.findById(id).orElseThrow(() -> new RuntimeException("not found " + id));
	}

	public void deleteById(Long id) {
		pessoaRepository.deleteById(id);
	}

	public Product updateProduct(Pessoa newproduct, Long id) {
		Pessoa pessoa = pessoaRepository.findById(id).get();
		pessoa.setname(newproduct.getName());
		pessoa.setTrabalho(newproduct.getTrabalho());
		return pessoaRepository.save(pessoa);

	}

}
