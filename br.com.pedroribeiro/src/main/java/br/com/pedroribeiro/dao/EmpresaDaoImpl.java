package br.com.pedroribeiro.dao;

import org.springframework.stereotype.Repository;

import br.com.pedroribeiro.domain.Empresa;

@Repository
public class EmpresaDaoImpl extends AbstractDao<Empresa, Long> implements EmpresaDao {

}
