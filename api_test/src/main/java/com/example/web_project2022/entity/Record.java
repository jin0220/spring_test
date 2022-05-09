package com.example.web_project2022.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private int num;
    private String title;
    private String image;
    private String author;
    private String publisher;
    private double rating;
    private String memo;
    private String date;
    private String category;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "USER_ID")
//    private User user;
//
//    public void setUser(User user){
//        this.user = user;
//    }
}
