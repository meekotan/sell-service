package easy.project.sellservice.service.impl;

import easy.project.sellservice.dao.UserRepo;
import easy.project.sellservice.mappers.UserMapper;
import easy.project.sellservice.models.dto.UserDto;
import easy.project.sellservice.models.entities.User;
import easy.project.sellservice.models.responses.ErrorResponse;
import easy.project.sellservice.service.UserService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    private UserRepo userRepo;

    @Autowired
    private UserServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }
    @Value("meekotan")
    private String secretKey;
    @Override
    public ResponseEntity<?> save(UserDto userDto) {
        User user = UserMapper.INSTANCE.toUSer(userDto);

        if(Objects.isNull(userRepo.findByLogin(user.getLogin())))
            userRepo.save(user);
        else
            return ResponseEntity.ok(UserMapper.INSTANCE.toUserDto(user));
    }

    @Override
    public ResponseEntity<?> sendCode(String login) {

//        if(Objects.isNull(user)){
//            return  new ResponseEntity<>(new ErrorResponse("Login not found.",null), HttpStatus.NOT_FOUND);
//        }
        return null;
    }

    @Override
    public ResponseEntity<?> getToken(String login, String code) {
        return null;
    }

    @Override
    public ResponseEntity<?> verifyLogin(String token) {
        try{
            Jws<Claims> jwt = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return ResponseEntity.ok(jwt.getBody().get("login"));
        }catch(JwtException jwtException){
            return null;
        }catch (JwtException jwtException){
            return null;
        }
        return null;
    }
}
