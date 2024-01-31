package model.bean;

import java.time.LocalDateTime;

public class AuthorBean {
	
	private Long idAuthor;
	private String firstNameAuthor;
	private String lastNameAuthor;
	private LocalDateTime insertDateAuthor;
	private LocalDateTime updateDateAuthor;
	private boolean isDeletedAuthor;
	
	public AuthorBean() {}

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
	public LocalDateTime getInsertDateAuthor() {
		return insertDateAuthor;
	}
	public void setInsertDateAuthor(LocalDateTime insertDateAuthor) {
		this.insertDateAuthor = insertDateAuthor;
	}
	public LocalDateTime getUpdateDateAuthor() {
		return updateDateAuthor;
	}
	public void setUpdateDateAuthor(LocalDateTime updateDateAuthor) {
		this.updateDateAuthor = updateDateAuthor;
	}
	public boolean isDeletedAuthor() {
		return isDeletedAuthor;
	}
	public void setDeletedAuthor(boolean isDeletedAuthor) {
		this.isDeletedAuthor = isDeletedAuthor;
	}
}
