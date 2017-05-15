package cn.serge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.serge.domain.Book;
import cn.serge.mapper.BookMapper;
import cn.serge.service.BookService;
@Service("bookService")
public class BookServiceImpl implements BookService{
	@Autowired
	private BookMapper bookMapper;

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookMapper.findAll();
	}
	
}
