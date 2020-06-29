package com.transport.transportmanagement.repository;

import com.transport.transportmanagement.modal.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Long> {
List<City>findByCityName(String name);
}
