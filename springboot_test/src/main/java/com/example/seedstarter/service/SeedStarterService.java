package com.example.seedstarter.service;

import com.example.seedstarter.entity.SeedStarter;
import com.example.seedstarter.repository.SeedStarterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor // 컨스트럭터 인젝션을 자동 생성해준다.
public class SeedStarterService {
//    @Autowired // 필드 인젝션
    private final SeedStarterRepository seedStarterRepository;

//    @Autowired // 컨스트럭터 인젝션
//    public SeedStarterService(SeedStarterRepository seedStarterRepository){
//        this.seedStarterRepository = seedStarterRepository;
//    }

    public List<SeedStarter> findWithFeature(){
        return this.seedStarterRepository.findWithFeature();
    }

    public List<SeedStarter> findWithDetail(){
        return this.seedStarterRepository.findWithDetail();
    }
}
