package com.transport.transportmanagement.repository;

import com.transport.transportmanagement.modal.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperatorRepository extends JpaRepository<Operator, Long > {
    List<Operator> findByCityId(Long cityid);

}
