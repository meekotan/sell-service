package easy.project.sellservice.controllers;

import easy.project.sellservice.dao.UserRepo;
import easy.project.sellservice.models.dto.UserDto;
import easy.project.sellservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/v1/users")
public class UserController {
    private UserService userService;
    private UserRepo userRepo;

    @Autowired
    private UserController(UserRepo userRepo, UserService userService){
        this.userRepo = userRepo;
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody UserDto userDto){
        return userService.save(userDto);
    }

    @PostMapping("/sendCode")
    public  ResponseEntity<?> sendCode(@RequestParam String login){
        return userService.sendCode(login);
    }

    @GetMapping("/login")
    public ResponseEntity<?> getToken(@RequestParam String login, @RequestParam String code){
        return  userService.getToken(login,code);
    }
    @GetMapping("/verify")
    public ResponseEntity<?> verifyLogin(@RequestHeader String token){
        return  userService.verifyLogin(token);
    }

}
