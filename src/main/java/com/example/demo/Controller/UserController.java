package com.example.demo.Controller;

import com.example.demo.Security.SecurityEntity.Role;
import com.example.demo.Security.SecurityEntity.User;
import com.example.demo.Service.Implement.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @GetMapping()
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("save")
    public String saveUser(@RequestBody User user){
        userService.saveUser(user);
        return "thanh Cong" ;
    }
    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(Role role){
        return ResponseEntity.ok().body(userService.saveRole(role));
    }

    @PostMapping("/addroletouser")
    public String addToUser(@RequestParam String username , @RequestParam String rolename){
        userService.addRoleToUser(username,rolename);
        return "Succses ok";
    }

    @PutMapping("/changepass")
    public String changePass(@RequestParam String username, @RequestParam String oldpass,@RequestParam String newpass){
        if (userService.changePass(username, oldpass, newpass))
        return "Success!!!";
        else
            return "Fail!!!";
    }

}