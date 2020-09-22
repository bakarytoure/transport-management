package com.transport.transportmanagement.modal;

import lombok.Data;

import javax.persistence.*;
//lombok data annotation will handle getter and setter automatically
@Data
@Entity
@Table(name = "stop")
public class Stop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="stop")
    private String stop;
    @Lob
    @Column(name="imagebus1")
    private byte [] image;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name="city_id",nullable = false)
    private City city;
}