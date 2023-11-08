package Cliente.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Cliente.model.Cliente;
import Cliente.model.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepository injecao;
	
	@GetMapping()
	public List<Cliente> getClientes() {
		return injecao.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> getCliente(Long id) {
		return injecao.findById(id);
	}
	
	@PostMapping
	public Cliente addCliente(@RequestBody Cliente cliente) {
		return injecao.save(cliente);
	}
	
	@DeleteMapping("/{id}")
	public String removeCliente(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Remoção com sucesso";
	}
	
	@PutMapping()
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		// perceba que o save está sendo utilizado na inserção
		// e atualização. Isso porque, caso o produto não
		// tenha id, é pra salvar, caso o produto tenha id,
		// vai atualizar
		return injecao.save(cliente);
	}
}
