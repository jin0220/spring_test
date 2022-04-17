package com.example.seedstarter.controller;

import com.example.seedstarter.entity.SeedStarter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // return 값을 데이터로 인식해서 데이터 자체를 넘김
public class SeedStarterMngController {
    @RequestMapping({"/", "seedstartermng"})
    public String showSeedstarters(final SeedStarter seedStarter, Model model){
        return "hello seed starter";
    }
}
