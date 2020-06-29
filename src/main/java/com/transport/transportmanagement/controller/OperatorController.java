package com.transport.transportmanagement.controller;

import com.transport.transportmanagement.modal.Operator;
import com.transport.transportmanagement.modal.Stop;
import com.transport.transportmanagement.repository.LineRepository;
import com.transport.transportmanagement.repository.OperatorRepository;
import com.transport.transportmanagement.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


    import java.util.List;
import java.util.Optional;
    @RestController
    @RequestMapping("/api")
    public class OperatorController {
        @Autowired
        private OperatorRepository operatorRepository;
        @GetMapping("/city/{cityid}/operator")
        public List<Operator> getOperatorByCity(@PathVariable Long cityid) {

            if(!operatorRepository.existsById(cityid)) {
                throw new ResourceNotFoundException("line not found!");
            }

            return operatorRepository.findByCityId(cityid);
        }
    }

