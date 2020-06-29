package com.transport.transportmanagement.controller;

import com.transport.transportmanagement.modal.Line;
import com.transport.transportmanagement.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:3000")
public class LineController {
    @Autowired
    private LineRepository lineRepository;
    @GetMapping("/city/{cityid}/line")
    public List<Line> getLineByCity(@PathVariable Long cityid) {

        if(!lineRepository.existsById(cityid)) {
            throw new ResourceNotFoundException("line not found!");
        }

        return lineRepository.findByCityId(cityid);
    }
}
