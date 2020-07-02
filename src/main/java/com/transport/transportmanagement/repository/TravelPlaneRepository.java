package com.transport.transportmanagement.repository;

import com.transport.transportmanagement.modal.TravelPlane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TravelPlaneRepository  extends JpaRepository<TravelPlane,Long> {

    List<TravelPlane> findByCityId(Long cityid);
}