package com.gigy.service;

import java.util.Collection;
import com.gigy.model.Book;

public interface BookService {
	
	public Collection<Book> obtenerLibros() throws Exception;
	
}
