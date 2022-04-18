package com.example.seedstarter.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@NamedEntityGraphs({
        @NamedEntityGraph( name="SeedStarter.withFeature", attributeNodes = {
                @NamedAttributeNode("features") // 필드 이름
        }),
        @NamedEntityGraph( name="SeedStarter.withDetail", attributeNodes = {
                @NamedAttributeNode("details")
        })
})
@Entity
public class SeedStarter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEED_STARTER_ID")
    private Long id;

    private LocalDateTime datePlanted;
    private boolean covered;

    @Enumerated(EnumType.STRING)
    private Type type;

    @OneToMany(mappedBy = "seedStarter", cascade = CascadeType.PERSIST, orphanRemoval = true) //orphanRemoval 부모가 사라지면 자식도 사라짐
    @JsonManagedReference
    private List<Feature> features = new ArrayList<>();

    @OneToMany(mappedBy = "seedStarter", cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JsonManagedReference
    private List<Detail> details = new ArrayList<>();

    // 연관관계 설정
    public void setFeature(Feature feature){
        this.features.add(feature);
        feature.setSeedStarter(this); // 양방향 연관관계
    }

    public void setDetail(Detail detail){
        this.details.add(detail);
        detail.setSeedStarter(this);
    }
}
