package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService;

import java.util.Optional;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ResponseEntity<Iterable<Cliente>> buscarTodos() {
		return ResponseEntity.ok(clienteService.buscarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<Cliente>> buscarPorId(@PathVariable Long id) {
		Optional<Cliente> cliente = clienteService.buscarPorId(id);
		ApiResponse<Cliente> response = new ApiResponse<>();

		if(cliente.isPresent()){
			response.setData(cliente.get());
			response.setStatus(HttpStatus.OK);
			return ResponseEntity.ok(response);
		}
			response.setMessage("Cliente Não Encontrado");
			response.setStatus(HttpStatus.NOT_FOUND);
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

	}

	@PostMapping
	public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
		clienteService.inserir(cliente);
		return ResponseEntity.ok(cliente);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
		clienteService.atualizar(id, cliente);
		return ResponseEntity.ok(cliente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse<Void>> deletar(@PathVariable Long id) {
		boolean clienteDeletado = clienteService.deletar(id);
		ApiResponse<Void> response = new ApiResponse<>();

		if(clienteDeletado){
			response.setStatus(HttpStatus.OK);
			response.setMessage("Cliente Excluido Com Sucesso.");
			return ResponseEntity.status(HttpStatus.OK).body(response);
		}else {
			response.setStatus(HttpStatus.NOT_FOUND);
			response.setMessage("Não Foi Possivel Excluir o Cliente");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}

	}
}
