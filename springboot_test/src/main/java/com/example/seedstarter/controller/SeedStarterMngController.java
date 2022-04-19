package com.example.seedstarter.controller;

import com.example.seedstarter.entity.SeedStarter;
import com.example.seedstarter.entity.SeedStarterAddForm;
import com.example.seedstarter.service.SeedStarterService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    
    // 모든 get요청 전에 model을 채워 줌. 공통사항은 한번에 정의해줘도 됨
    @ModelAttribute
    public void addAttribute(Model model){
        model.addAttribute("seedStarterAddForm",new SeedStarterAddForm());
    }
    
    @RequestMapping({"/", "seedstartermng"})
    public String showSeedstarters(final SeedStarter seedStarter, Model model)throws JsonProcessingException {
        List<SeedStarter> seedStarterWithFeature = seedStarterService.findWithFeature();
        List<SeedStarter> seedStarterWithDetail = seedStarterService.findWithDetail();
        model.addAttribute("seedStarterWithFeature",seedStarterWithFeature);
        model.addAttribute("seedStarterWithDetail",seedStarterWithDetail);
        
        return "seedstartermng";
    }

    @PostMapping("/seedstartermng")
    public String addSeedStarter(@ModelAttribute SeedStarterAddForm seedStarterAddForm, Model model){
        System.out.println("seedStarterAddForm.getDatePlanted() = " + seedStarterAddForm.getDatePlanted());
        System.out.println("seedStarterAddForm.isCovered() = " + seedStarterAddForm.isCovered());
        System.out.println("seedStarterAddForm.getType() = " + seedStarterAddForm.getType());
        System.out.println("seedStarterAddForm.getFertilizer() = " + seedStarterAddForm.getFertilizer());
        return "redirect:/";
    }
}
