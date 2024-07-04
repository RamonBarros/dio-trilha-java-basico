package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

import java.util.Optional;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Optional<Cliente> buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	boolean deletar(Long id);

}
