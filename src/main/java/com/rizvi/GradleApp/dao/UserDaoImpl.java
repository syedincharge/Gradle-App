package com.rizvi.GradleApp.dao;

import com.rizvi.GradleApp.response.UserDepartmentResponse;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class UserDaoImpl extends NamedParameterJdbcDaoSupportClass implements UserDao {

    @Override
    public List<UserDepartmentResponse> getUserDepartment() {
        List<UserDepartmentResponse> users = null;

        try {
          String query = "select name, department_name as departmentName from user join department on user.department_id = department.department_id";
          users = getNamedParameterJdbcTemplate().getJdbcOperations().query(query, new BeanPropertyRowMapper<UserDepartmentResponse>(UserDepartmentResponse.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
