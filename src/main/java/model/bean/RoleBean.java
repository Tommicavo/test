package model.bean;

import java.time.LocalDateTime;

public class RoleBean {
	
	private Long idRole;
	private String label;
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
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
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
