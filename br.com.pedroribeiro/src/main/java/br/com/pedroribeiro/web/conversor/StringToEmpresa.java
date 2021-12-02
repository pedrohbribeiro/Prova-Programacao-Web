package br.com.pedroribeiro.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.pedroribeiro.domain.Empresa;
import br.com.pedroribeiro.service.EmpresaService;

@Component
public class StringToEmpresa implements Converter<String, Empresa>{

	@Autowired
	private EmpresaService service;
	
	@Override
	public Empresa convert(String text) {
		if(text.isEmpty()) {
		return null; 
			
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
