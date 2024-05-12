package br.org.serratec.exercicioFixacao02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.serratec.exercicioFixacao02.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
