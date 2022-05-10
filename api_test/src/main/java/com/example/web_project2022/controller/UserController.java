package com.example.web_project2022.controller;

import com.example.web_project2022.entity.User;
import com.example.web_project2022.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/api/v1/users")
    @ApiOperation(value = "회원 전체 조회")
    public List<User> all(){
        System.out.println("userService = " + userService.all());
        return userService.all();
    }

    @GetMapping("api/v1/user/{userId}")
    @ApiOperation(value = "회원 조회")
    public Optional<User> find(@PathVariable String userId){
        System.out.println("userService.find(userId) = " + userService.find(userId));
        return userService.find(userId);
    }

    @PostMapping("/api/v1/user")
    @ApiOperation(value = "신규 회원 정보 입력")
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/api/v1/user/{userId}")
    @ApiOperation(value = "회원 정보 수정")
    public void modify(@PathVariable String userId, @RequestBody User user){
        userService.modify(userId, user);
    }

    @DeleteMapping("api/v1/user/{userId}")
    @ApiOperation(value = "회원 정보 삭제")
    public void delete(@PathVariable String userId){
        userService.delete(userId);
    }

}
