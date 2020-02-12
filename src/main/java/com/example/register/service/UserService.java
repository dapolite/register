package com.example.register.service;

import com.example.register.model.Users;
import com.example.register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Users user=new Users("dapolite","Ankur","Banerjee","dapo@email.com","9624423675","21/9/1999","dragonball");

    private List<Users> users= new ArrayList<>(Arrays.asList(
            new Users("dapolite","Ankur","Banerjee","dapo@email.com","9624423675","21/9/1999","dragonball"),
            new Users("dhunchi","Dhruva","Shaiva","dapo@email.com","9624423675","21/9/1999","dragonball")
    ));

    public List<Users> getUsers(){
        //return users;
        List<Users> userlist=new ArrayList<>();
        userRepository.findAll().forEach(userlist::add);
        return userlist;
    }
    public Users getUser(String userid){
        return users.stream().filter(t -> t.getUserid().equals(userid)).findFirst().get();
    }

    public void createUser(Users user){
        //users.add(user);
        userRepository.save(user);
    }

    public void deleteUser(String userid){
        users.removeIf(t -> t.getUserid().equals(userid));
    }

}

