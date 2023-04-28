
package com.rizvi.GradleApp.service;

import com.rizvi.GradleApp.entity.Users;
import com.rizvi.GradleApp.response.UserDepartmentResponse;


import java.util.List;

public interface UserService {

    List<Users> getAllUsers();
    public Users getUserById(int userId);
    public Users addOrUpdateUser(Users user);
    public Users deleteUser(int userId);

   public List<Users> getUserBySalary(float salary);

   public List<UserDepartmentResponse>getUserDepartment();



}