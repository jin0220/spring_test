package com.example.web_project2022.repository;

import com.example.web_project2022.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecordRepository extends JpaRepository<Record, Integer> {
//    @Query(value = "SELECT * FROM record WHERE date LIKE %:date%")
    List<Record> findByDateContaining(@Param("date") String date);
}
