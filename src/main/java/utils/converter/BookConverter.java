package utils.converter;

import model.bean.BookBean;
import model.dto.BookDto;

public class BookConverter {
	
	public BookBean toBean(BookDto bookDto) {
		
		BookBean bookBean = new BookBean();
		
		bookBean.setIdBook(bookDto.getIdBook());
		bookBean.setTitleBook(bookDto.getTitleBook());
		bookBean.setPagesBook(bookDto.getPagesBook());
		bookBean.setIdAuthor(bookDto.getIdAuthor());
		bookBean.setIdClient(bookDto.getIdClient());
		bookBean.setIdSeller(bookDto.getIdSeller());
		bookBean.setPriceBook(bookDto.getPriceBook());
		bookBean.setPagesBook(bookDto.getPagesBook());
		bookBean.setLowBook(bookDto.isLowBook());
		
		return bookBean;
	}
	
	public BookDto toDto(BookBean bookBean) {
		
		BookDto bookDto = new BookDto();
		
		bookDto.setIdBook(bookBean.getIdBook());
		bookDto.setTitleBook(bookBean.getTitleBook());
		bookDto.setPagesBook(bookBean.getPagesBook());
		bookDto.setIdAuthor(bookBean.getIdAuthor());
		bookDto.setIdClient(bookBean.getIdClient());
		bookDto.setIdSeller(bookBean.getIdSeller());
		bookDto.setPriceBook(bookBean.getPriceBook());
		bookDto.setPagesBook(bookBean.getPagesBook());
		bookDto.setLowBook(bookBean.isLowBook());
		
		return bookDto;
	}
}
