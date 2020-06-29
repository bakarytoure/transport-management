package com.transport.transportmanagement.service;

import com.transport.transportmanagement.modal.City;
import com.transport.transportmanagement.repository.CityRepository;
//import liquibase.pro.packaged.S;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{
    @Autowired
    private CityRepository cityRepository;
    @Override
    public City saveCity(City city){
        return cityRepository.save(city);
    }
    @Override
    public City updateCity(City city){
        return cityRepository.save(city);
    }
    @Override
    public void deleteCity(Long cityId){
        cityRepository.deleteById(cityId);
    }
    @Override
    public City findByCityName(String city)
    {
        return (City) cityRepository.findByCityName(city);
    }
}
