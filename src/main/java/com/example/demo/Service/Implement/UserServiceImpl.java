package com.example.demo.Service.Implement;

import com.example.demo.Repository.RoleRepo;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Security.SecurityEntity.Role;
import com.example.demo.Security.SecurityEntity.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service 
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepo userRepo;
    @Autowired
    private  RoleRepo roleRepo;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String rolename) {
        User user =userRepo.findByUsername(username);
        Role role=roleRepo.findByName(rolename);
        Collection<Role> roles= new ArrayList<>();
        roles= user.getRoles();
        roles.add(role);
        user.setRoles(roles);
        userRepo.save(user);
    }

    @Override
    public User getUser(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public boolean changePass(String username,String oldpass, String newpass) {
        User user = userRepo.findByUsername(username);
        if(!user.getPassword().equals(oldpass))
            return false;
        user.setPassword(newpass);
        userRepo.save(user);
        return true;
    }
}
