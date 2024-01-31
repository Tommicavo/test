package model.dto;

public class AuthorDto {
	
	private Long idAuthor;
	private String firstNameAuthor;
	private String lastNameAuthor;
	
	public AuthorDto() {}

	public Long getIdAuthor() {
		return idAuthor;
	}
	public void setIdAuthor(Long idAuthor) {
		this.idAuthor = idAuthor;
	}
	public String getFirstNameAuthor() {
		return firstNameAuthor;
	}
	public void setFirstNameAuthor(String firstNameAuthor) {
		this.firstNameAuthor = firstNameAuthor;
	}
	public String getLastNameAuthor() {
		return lastNameAuthor;
	}
	public void setLastNameAuthor(String lastNameAuthor) {
		this.lastNameAuthor = lastNameAuthor;
	}
}
