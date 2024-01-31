package utils.converter;

import model.bean.UserBean;
import model.dto.UserDto;

public class UserConverter {
	
	public UserBean toBean(UserDto userDto) {
		
		UserBean userBean = new UserBean();
		
		userBean.setIdUser(userDto.getIdUser());
		userBean.setFirstNameUser(userDto.getFirstNameUser());
		userBean.setLastNameUser(userDto.getLastNameUser());
		userBean.setEmailUser(userDto.getEmailUser());
		userBean.setPasswordUser(userDto.getPasswordUser());
		userBean.setIdRole(userDto.getIdRole());
		userBean.setPremiumUser(userDto.isPremiumUser());
		
		return userBean;
	}
	
	public UserDto toDto(UserBean userBean) {
		
		UserDto userDto = new UserDto();
		
		userDto.setIdUser(userBean.getIdUser());
		userDto.setFirstNameUser(userBean.getFirstNameUser());
		userDto.setLastNameUser(userBean.getLastNameUser());
		userDto.setEmailUser(userBean.getEmailUser());
		userDto.setPasswordUser(userBean.getPasswordUser());
		userDto.setIdRole(userBean.getIdRole());
		userDto.setPremiumUser(userBean.isPremiumUser());
		
		return userDto;
	}
}
