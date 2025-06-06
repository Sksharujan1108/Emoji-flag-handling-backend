package com.emoji.country_emoji_generate.model;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String code;

    @Column(name = "flag_emoji")
    private String flag;
}
