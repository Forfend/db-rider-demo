package com.java.community.entity;

import javax.persistence.*;

@Entity
@Table(name = "passports")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String series;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
