package utils.converter;

import model.bean.AuthorBean;
import model.dto.AuthorDto;

public class AuthorConverter {
	
	public AuthorBean toBean(AuthorDto authorDto) {
		
		AuthorBean authorBean = new AuthorBean();
		
		authorBean.setIdAuthor(authorDto.getIdAuthor());
		authorBean.setFirstNameAuthor(authorDto.getFirstNameAuthor());
		authorBean.setLastNameAuthor(authorDto.getLastNameAuthor());
		
		return authorBean;
	}
	
	public AuthorDto toDto(AuthorBean authorBean) {
		
		AuthorDto authorDto = new AuthorDto();
		
		authorDto.setIdAuthor(authorBean.getIdAuthor());
		authorDto.setFirstNameAuthor(authorBean.getFirstNameAuthor());
		authorDto.setLastNameAuthor(authorBean.getLastNameAuthor());
		
		return authorDto;
	}
}
