package com.transport.transportmanagement.modal;

import lombok.Data;

import javax.persistence.*;

//lombok data annotation will handle getter and setter automatically
@Data
@Entity
@Table(name="city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="city")
    private String cityName;
    @Column
    private  String longitude;
    @Column
    private String latitude;
}
