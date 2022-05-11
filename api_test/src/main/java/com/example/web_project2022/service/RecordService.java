package com.example.web_project2022.service;

import com.example.web_project2022.entity.Record;
import com.example.web_project2022.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RecordService {
    private final RecordRepository recordRepository;

    // 기록 저장
    public void save(Record record){
        recordRepository.save(record);
    }

    // 달력을 클릭했을 때 해당 날짜에 대한 기록 조회
    public List<Record> findList(String date){
        return recordRepository.findByDateContaining(date);
    }

    // 기록의 상세 페이지
    public Optional<Record> findOne(int num){
        return recordRepository.findById(num);
    }
}
