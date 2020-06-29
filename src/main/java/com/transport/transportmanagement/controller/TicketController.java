package com.transport.transportmanagement.controller;

import com.transport.transportmanagement.modal.Ticket;
import com.transport.transportmanagement.repository.CityRepository;
import com.transport.transportmanagement.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000")
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;
    @GetMapping("/city/{cityid}/ticket")

    public List<Ticket> getTicketByCity(@PathVariable Long cityid) {

        if (!ticketRepository.existsById(cityid)) {
            throw new ResourceNotFoundException("ticket not found!");
        }

        return ticketRepository.findByCityId(cityid);
    }
}