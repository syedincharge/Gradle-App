

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


    public Users() {
        super();
    }

    public Users(int userId, String name, int age, float salary) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Users{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}