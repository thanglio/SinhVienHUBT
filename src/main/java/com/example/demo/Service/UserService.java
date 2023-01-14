package com.example.demo.Service;

import com.example.demo.Security.SecurityEntity.Role;
import com.example.demo.Security.SecurityEntity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String rolename);
    User getUser(String username);
    List<User> getUsers();
    boolean changePass(String username,String oldpass,String newpass);
}
