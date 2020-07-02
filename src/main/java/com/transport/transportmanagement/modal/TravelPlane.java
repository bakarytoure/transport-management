package com.transport.transportmanagement.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data
@Entity
@Table(name="travelplane")
public class TravelPlane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planeId;

    @Column
    private Long price;
    @Column
    private String Destination;
    @Column
    private String link;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private City city;
}
