package com.example.web_project2022.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @Column(name = "USER_ID")
    private String id;
    private String password;
    private String email;
    private String profileImage;

//    @OneToMany(mappedBy = "RECORD_ID")
//    private List<Record> recordList = new ArrayList<>();
}
