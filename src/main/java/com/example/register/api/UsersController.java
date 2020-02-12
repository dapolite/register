package com.example.register.api;

import com.example.register.model.Users;
import com.example.register.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<Users> getUsers(){
    return userService.getUsers();
    }

    @RequestMapping("/users/{userId}")
    public Users getUser(@PathVariable String userId){
        return userService.getUser(userId);
    }

    @RequestMapping(value="/users",method=RequestMethod.POST)
    public void createUser(@RequestBody Users user){
        userService.createUser(user);
    }

    @PutMapping
    public String updateUser(){
        return "lol";
    }

    @DeleteMapping
    public void deleteUser(@PathVariable String userid){
        userService.deleteUser(userid);
    }


}
