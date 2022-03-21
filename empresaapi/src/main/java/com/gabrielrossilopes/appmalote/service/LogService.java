package com.gabrielrossilopes.appmalote.service;


import com.gabrielrossilopes.appmalote.model.dominio.Log;
import com.gabrielrossilopes.appmalote.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
	
	@Autowired
	private LogRepository logRepository;
	
	public Long obterQtde() {
		return logRepository.count();
	}

	public void incluir(Log log) {
		logRepository.save(log);
	}

	public List<Log> obterLista() {
		return (List<Log>) logRepository.findAll(Sort.by(Sort.Direction.DESC, "data"));
	}

	public void excluir(Integer id) {		
		logRepository.deleteById(id);		
	}
}