package com.gigy.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gigy.model.Book;
import com.gigy.repository.BookRepository;
import com.gigy.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Collection<Book> obtenerLibros() throws Exception {
		return bookRepository.findAll();
	}

}
