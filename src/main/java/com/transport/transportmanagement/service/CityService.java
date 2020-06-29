package com.transport.transportmanagement.service;

import com.transport.transportmanagement.modal.City;

public interface CityService {

    City saveCity(City city);

    City updateCity(City city);

    void deleteCity(Long cityId);

    City findByCityName(String city);
}
