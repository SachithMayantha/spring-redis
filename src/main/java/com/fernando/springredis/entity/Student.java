package com.fernando.springredis.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "student")
@Data @NoArgsConstructor @AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private int grade;
}
