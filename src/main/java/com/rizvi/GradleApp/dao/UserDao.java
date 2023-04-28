package com.rizvi.GradleApp.dao;

import com.rizvi.GradleApp.response.UserDepartmentResponse;

import java.util.List;

public interface UserDao {

    public List<UserDepartmentResponse> getUserDepartment();
}
