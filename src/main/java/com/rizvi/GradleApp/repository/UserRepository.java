
package com.rizvi.GradleApp.repository;
import com.rizvi.GradleApp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {


    @Query(value = "select * from user where salary > :salary", nativeQuery = true)
    public List<Users> getUserBySalary(float salary);

}