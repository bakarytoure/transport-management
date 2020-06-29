package com.transport.transportmanagement.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

//lombok data annotation will handle getter and setter automatically
@Data
@Entity
@Table
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @Column
    private  String duration;
    @Column
    private Long price;
    @Column
    private String typeofTicket;
    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private City city;

    public Ticket() {
    }


    public Ticket(String duration, Long price, String typeofTicket) {
        this.duration = duration;
        this.price = price;
        this.typeofTicket = typeofTicket;
    }

}

