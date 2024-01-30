package model.bean;

import java.time.LocalDateTime;

public class AuthorBean {
	
	private Long idAuthor;
	private String firstNameAuthor;
	private String lastNameAuthor;
	private LocalDateTime insertDateUser;
	private LocalDateTime updateDateUser;
	private boolean isDeletedUser;
	
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
	public LocalDateTime getInsertDateUser() {
		return insertDateUser;
	}
	public void setInsertDateUser(LocalDateTime insertDateUser) {
		this.insertDateUser = insertDateUser;
	}
	public LocalDateTime getUpdateDateUser() {
		return updateDateUser;
	}
	public void setUpdateDateUser(LocalDateTime updateDateUser) {
		this.updateDateUser = updateDateUser;
	}
	public boolean isDeletedUser() {
		return isDeletedUser;
	}
	public void setDeletedUser(boolean isDeletedUser) {
		this.isDeletedUser = isDeletedUser;
	}
}
