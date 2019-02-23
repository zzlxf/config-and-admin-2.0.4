package com.test.configclient.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class User {

    @Id
    @GenericGenerator(name = "id", strategy = "uuid")
    @GeneratedValue(generator = "id")
    @Column(name = "id", unique = true, nullable = false, length = 16)
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    public User() {
    }

    public User(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
