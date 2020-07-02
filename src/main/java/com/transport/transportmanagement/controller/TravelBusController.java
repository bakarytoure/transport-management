package com.transport.transportmanagement.controller;

import com.transport.transportmanagement.modal.TravelBus;
import com.transport.transportmanagement.repository.CityRepository;
import com.transport.transportmanagement.repository.TravelBusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000")
public class TravelBusController {
    @Autowired
    private TravelBusRepository travelBusRepository;



    @GetMapping("/city/{cityid}/travelBus")

    public List<TravelBus> getBusByCity(@PathVariable Long cityid) {

        if(!travelBusRepository.existsById(cityid)) {
            throw new ResourceNotFoundException("tran  city  not found!");
        }

        return travelBusRepository.findByCityId(cityid);
    }

}
