package bg.softuni.security.init;

import bg.softuni.security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserInit implements CommandLineRunner {

  private final UserService userService;

  public UserInit(UserService userService) {
    this.userService = userService;
  }

  @Override
  public void run(String... args) throws Exception {
    userService.initUserRoles();
    userService.initUsers();
  }
}
