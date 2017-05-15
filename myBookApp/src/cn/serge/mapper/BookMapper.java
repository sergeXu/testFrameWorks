package cn.serge.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.serge.domain.Book;

public interface BookMapper {
	@Select("select * from tb_book")
	List<Book> findAll();
}
