package com.example.seedstarter.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Detail {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rowNum;
    private int seedPerCell;
    private String variety;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEED_STARTER_ID")
    private SeedStarter seedStarter;
}
