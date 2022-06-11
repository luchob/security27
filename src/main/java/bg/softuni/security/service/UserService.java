package bg.softuni.security.service;

import bg.softuni.security.model.dto.UserRegistrationDTO;

public interface UserService {

  void initUserRoles();

  void initUsers();

  void createAccount(UserRegistrationDTO userRegistrationDTO);

}
