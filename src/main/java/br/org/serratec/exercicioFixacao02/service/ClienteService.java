package br.org.serratec.exercicioFixacao02.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.org.serratec.exercicioFixacao02.model.Cliente;
import br.org.serratec.exercicioFixacao02.repository.ClienteRepository;

@Service
public class ClienteService {
	
	
	@Autowired
	private ClienteRepository repositorio;
	
	public List<Cliente> obterTodosOsClientes() {
		return repositorio.findAll();
	}
	
	public Optional<Cliente> obterClientePorId(Long id) {
		return repositorio.findById(id);
	}
	
	public Cliente cadastrarCliente(Cliente cliente) {
		return repositorio.save(cliente);
	}
	
	public Optional<Cliente> alterarDadosCliente(Long id, Cliente clienteAlterado) {
		if (repositorio.existsById(id)) {
			clienteAlterado.setId(id);
			repositorio.save(clienteAlterado);
			return Optional.of(clienteAlterado);
		}
		return Optional.empty();
	}
	
	public boolean excluirPorId(Long id) {
		if (!repositorio.existsById(id)) {
			return false;
		}
		 repositorio.deleteById(id);
		 return true;
	}
	
	
	
	
	
}
