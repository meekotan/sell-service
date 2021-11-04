package easy.project.sellservice.service;

import easy.project.sellservice.models.dto.UserDto;
import org.springframework.http.ResponseEntity;

public interface UserService {
    public ResponseEntity<?> save(UserDto userDto);

    public ResponseEntity<?> sendCode(String login);

    public ResponseEntity<?> getToken(String login, String code);

    public ResponseEntity<?> verifyLogin(String token);
}
