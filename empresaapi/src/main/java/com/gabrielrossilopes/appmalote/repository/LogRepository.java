package com.gabrielrossilopes.appmalote.repository;

import com.gabrielrossilopes.appmalote.model.dominio.Log;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Integer> {

	public List<Log> findAll(Sort by);
}