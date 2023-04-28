package com.rizvi.GradleApp.service;


import com.rizvi.GradleApp.dao.UserDao;
import com.rizvi.GradleApp.entity.Users;
import com.rizvi.GradleApp.repository.UserRepository;
import com.rizvi.GradleApp.response.UserDepartmentResponse;
import com.rizvi.GradleApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserRepository userRepository;

 /*   public UserServiceImpl(UserRepository userRepository, UserDao userDao) {
        this.userRepository = userRepository;
        this.userDao = userDao;
    }*/




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

    @Override
    public List<Users> getUserBySalary(float salary) {
        return userRepository.getUserBySalary(salary);
    }

    @Override
    public List<UserDepartmentResponse> getUserDepartment() {
        return userDao.getUserDepartment();
    }




}