package com.transport.transportmanagement.controller;

import com.transport.transportmanagement.modal.TravelPlane;
import com.transport.transportmanagement.repository.CityRepository;
import com.transport.transportmanagement.repository.TravelPlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000")
public class TravelPlaneController {

    @Autowired
    private TravelPlaneRepository travelPlaneRepository;


    @GetMapping("/city/{cityid}/travelPlane")

    public List<TravelPlane> getPlaneByCity(@PathVariable Long cityid) {

        if(!travelPlaneRepository.existsById(cityid)) {
            throw new ResourceNotFoundException("tran  city  not found!");
        }

        return travelPlaneRepository.findByCityId(cityid);
    }

}
