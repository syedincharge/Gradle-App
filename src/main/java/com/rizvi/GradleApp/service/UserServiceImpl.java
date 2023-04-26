package com.rizvi.GradleApp.service;


import com.rizvi.GradleApp.entity.Users;
import com.rizvi.GradleApp.repository.UserRepository;
import com.rizvi.GradleApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;


    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public Users addOrUpdateUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users deleteUser(int userId) {
        Users deleteUser = null;
        try {
            deleteUser = userRepository.findById(userId).orElse(null);
            if(deleteUser == null) {
                throw new RuntimeException("User not found");
            }else {
                userRepository.deleteById(userId);
            }
        }catch (Exception e) {
            throw e;
        }
        return  deleteUser;
    }
}