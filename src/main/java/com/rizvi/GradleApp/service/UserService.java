
package com.rizvi.GradleApp.service;

import com.rizvi.GradleApp.entity.Users;


import java.util.List;

public interface UserService {

    List<Users> getAllUsers();
    public Users getUserById(int userId);
    public Users addOrUpdateUser(Users user);
    public Users deleteUser(int userId);



}