package com.example.web_project2022.controller;

import com.example.web_project2022.entity.User;
import com.example.web_project2022.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    // 회원 전체 조회
    @GetMapping("/api/v1/users")
    public List<User> all(){
        System.out.println("userService = " + userService.all());
        return userService.all();
    }

    // 회원 단건 조회
    @GetMapping("api/v1/user/{userId}")
    public Optional<User> find(@PathVariable String userId){
        System.out.println("userService.find(userId) = " + userService.find(userId));
        return userService.find(userId);
    }

    // 신규 회원 정보 입력
    @GetMapping("/api/v1/user")
    public User save(){
        User user1 = new User();
        user1.setId("test1");
        user1.setPassword("1234");
        user1.setEmail("test1");
        user1.setProfileImage("test1");
        return userService.save(user1);
    }

    // 신규 회원 정보 입력
//    @PostMapping("/api/v1/user")
//    public User save(@RequestBody User user){
//        return userService.save(user);
//    }


}
