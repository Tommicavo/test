package utils.converter;

import model.bean.RoleBean;
import model.dto.RoleDto;

public class RoleConverter {
	
	public RoleBean toBean(RoleDto roleDto) {
		
		RoleBean roleBean = new RoleBean();
		
		roleBean.setIdRole(roleDto.getIdRole());
		roleBean.setLabelRole(roleDto.getLabelRole());
		
		return roleBean;
	}
	
	public RoleDto toDto(RoleBean roleBean) {
		RoleDto roleDto = new RoleDto();
		
		roleDto.setIdRole(roleBean.getIdRole());
		roleDto.setLabelRole(roleBean.getLabelRole());
		
		return roleDto;
	}
}
