

package com.rizvi.GradleApp.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class Users  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "salary")
    private Float salary;

    @Column(name = "department_id")
    private int departmentId;


    public Users() {
        super();
    }

    public Users(int userId, String name, int age, Float salary, int departmentId) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.departmentId = departmentId;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }
}