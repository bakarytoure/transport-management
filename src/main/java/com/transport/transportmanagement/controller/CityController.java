package com.transport.transportmanagement.controller;

import com.transport.transportmanagement.modal.City;
import com.transport.transportmanagement.repository.CityRepository;
import com.transport.transportmanagement.service.CityService;
import com.transport.transportmanagement.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CityController {
    @Autowired
    CityRepository cityRepository;

@GetMapping("/city")
    public ResponseEntity<List<City>> getAllCities(@RequestParam(required = false) String cityName) {
        try {
            List<City> cityList=new ArrayList<City>();
            if(cityName==null)
                cityRepository.findAll().forEach(cityList::add);
            else
                cityRepository.findByCityName(cityName).forEach(cityList::add);

            if(cityList.isEmpty())
            {
                System.out.println("No content found");
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(cityList,HttpStatus.OK);
        }
        catch (Exception e) {
            System.out.println("Error from the server side");
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/city/{id}")
    public ResponseEntity<City> getCityById(@PathVariable("id") long id)
    {
        Optional<City> citydata= cityRepository.findById(id);
        if(citydata.isPresent()){
            return  new ResponseEntity<>(citydata.get(),HttpStatus.OK);
        }else {
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}