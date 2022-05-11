package com.example.web_project2022.controller;

import com.example.web_project2022.entity.Record;
import com.example.web_project2022.service.RecordService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class RecordController {
    private final RecordService recordService;

    @GetMapping("/api/v1/record/{date}")
    @ApiOperation(value = "달력을 클릭했을 때 해당 날짜에 대한 기록 조회")
    public List<Record> findList(@PathVariable String date){

        return recordService.findList(date);
    }

    @GetMapping("/api/v1/record/detail/{num}")
    @ApiOperation(value = "기록의 상세 페이지")
    public Optional<Record> findOne(@PathVariable int num){
        return recordService.findOne(num);
    }

    @PostMapping("/api/v1/record")
    @ApiOperation(value = "책에 대한 기록 저장")
    public void save(@RequestBody Record record){
        recordService.save(record);
    }
}
