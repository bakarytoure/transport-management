package com.transport.transportmanagement.repository;

import com.transport.transportmanagement.modal.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface  TicketRepository extends JpaRepository<Ticket,Long> {
    List<Ticket> findByCityId(Long cityid);


}
