package com.example.web_project2022.entity;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(example = "회원 아이디")
    private String id;

    @ApiModelProperty(example = "회원 비밀번호")
    private String password;

    @ApiModelProperty(example = "회원 이메일")
    private String email;

    @ApiModelProperty(example = "회원 프로필 사진")
    private String profileImage;

//    @OneToMany(mappedBy = "RECORD_ID")
//    private List<Record> recordList = new ArrayList<>();
}
