package com.example.seedstarter.controller;

import com.example.seedstarter.entity.SeedStarter;
import com.example.seedstarter.service.SeedStarterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
//@RestController // return 값을 데이터로 인식해서 데이터 자체를 넘김
@Controller // html 파일 이름을 넘겨줌
public class SeedStarterMngController {
    // 서비스 의존성 주입
    private final SeedStarterService seedStarterService;
    private final ObjectMapper mapper;
    @RequestMapping({"/", "seedstartermng"})
    public String showSeedstarters(final SeedStarter seedStarter, Model model)throws JsonProcessingException {
        List<SeedStarter> seedStarterWithFeature = seedStarterService.findWithFeature();
        List<SeedStarter> seedStarterWithDetail = seedStarterService.findWithDetail();
        model.addAttribute("seedStarterWithFeature",seedStarterWithFeature);
        model.addAttribute("seedStarterWithDetail",seedStarterWithDetail);
        return "seedstartermng";
    }
}
