package com.transport.transportmanagement.repository;

import com.transport.transportmanagement.modal.TravelBus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TravelBusRepository extends JpaRepository<TravelBus,Long> {

    List<TravelBus> findByCityId(Long cityid);
}