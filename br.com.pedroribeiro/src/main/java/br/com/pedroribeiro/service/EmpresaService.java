package br.com.pedroribeiro.service;

import java.util.List;

import br.com.pedroribeiro.domain.Empresa;

public interface EmpresaService {
	
	void salvar(Empresa empresa);
	
	void editar(Empresa empresa);
	
	void excluir(Long id);
	
	Empresa buscarPorId(Long id);
	
	List<Empresa> buscarTodos();

	boolean empresaTemProfissoes(Long id);

	

}
