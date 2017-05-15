package cn.serge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.serge.domain.Book;
import cn.serge.service.BookService;

@Controller
public class BookController {
	@Autowired 
	@Qualifier("bookService")
	BookService bookService;
	@RequestMapping(value="/main")
	public String main(Model model)
	{
		List<Book> bookList = bookService.getAll();
		model.addAttribute("bookList", bookList);
		return "main";
	}
}
