package model.bean;

import java.time.LocalDateTime;

public class UserBean {

	private Long idUser;
	private String firstNameUser;
	private String lastNameUser;
	private String emailUser;
	private String passwordUser;
	private boolean isPremiumUser;
	private LocalDateTime insertDateUser;
	private LocalDateTime updateDateUser;
	private boolean isDeletedUser;
	private Long idRole;
	
	public UserBean() {}

	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getFirstNameUser() {
		return firstNameUser;
	}
	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}
	public String getLastNameUser() {
		return lastNameUser;
	}
	public void setLastNameUser(String lastNameUser) {
		this.lastNameUser = lastNameUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
	public boolean isPremiumUser() {
		return isPremiumUser;
	}
	public void setPremiumUser(boolean isPremiumUser) {
		this.isPremiumUser = isPremiumUser;
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
	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	@Override
	public String toString() {
		return "" +
				"Id: " + getIdUser() + "\n" +
				"First Name: " + getFirstNameUser() + "\n" +
				"Last Name: " + getLastNameUser() + "\n" +
				"Email: " + getEmailUser() + "\n" +
				"Password: " + getPasswordUser() + "\n" +
				"Deleted: " + isDeletedUser() + "\n" +
				"Premium: " + isPremiumUser() + "\n" +
				"Id Role: " + getIdRole();
	}	
}
