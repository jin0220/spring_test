package com.example.web_project2022.service;

import com.example.web_project2022.entity.User;
import com.example.web_project2022.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    // 회원 전체 조회
    public List<User> all(){
        return userRepository.findAll();
    }
    
    // 회원 단건 조회
    public Optional<User> find(String id){
        return userRepository.findById(id);
    }

    // 신규 회원 정보 입력
    public User save(User user){
        return userRepository.save(user);
    }

    // 회원 정보 수정
    public void modify(String id, User user){
        Optional<User> e = userRepository.findById(id);

        if(e.isPresent()){
            e.get().setId(user.getId());
            e.get().setPassword(user.getPassword());
            e.get().setEmail(user.getEmail());
            e.get().setProfileImage(user.getProfileImage());
            userRepository.save(user);
        }
    }

    // 회원 정보 삭제
    public void delete(String id){
        userRepository.deleteById(id);
    }
}
