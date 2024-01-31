package model.bean;

import java.time.LocalDateTime;

public class RoleBean {
	
	private Long idRole;
	private String labelRole;
	private LocalDateTime insertDateUser;
	private LocalDateTime updateDateUser;
	private boolean isDeletedUser;
	
	public RoleBean() {}

	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getLabelRole() {
		return labelRole;
	}
	public void setLabelRole(String labelRole) {
		this.labelRole = labelRole;
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
