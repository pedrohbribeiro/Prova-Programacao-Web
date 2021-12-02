package br.com.pedroribeiro.dao;

import java.time.LocalDate;
import java.util.List;

import br.com.pedroribeiro.domain.Cliente;

public interface ClienteDao {
	
	void save(Cliente cliente);
	
	void update(Cliente cliente);
	
	void delete(Long id);
	
	Cliente findById(Long id);
	
	List<Cliente> findAll();
	
	List<Cliente> findByNome(String nome);
	
	List<Cliente> findByProfissao(Integer profissao);
	
	List<Cliente> findByDate(LocalDate data);
}
