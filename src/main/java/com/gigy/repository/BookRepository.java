package com.gigy.repository;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gigy.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Serializable> {

	Collection<Book> findAll();
	
}
