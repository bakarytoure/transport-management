package com.transport.transportmanagement.repository;

import com.transport.transportmanagement.modal.Line;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LineRepository extends JpaRepository<Line,Long> {

    List<Line> findByCityId(Long cityid);
}
