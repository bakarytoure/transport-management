package com.transport.transportmanagement.service;

import com.transport.transportmanagement.modal.Line;
import com.transport.transportmanagement.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineServiceImpl implements LineService {
    @Autowired
    private LineRepository lineRepository;

    @Override
    public Line saveLine(final Line line){
        lineRepository.save(line);
        return line;
    }
    @Override
    public List<Line>findAllLines(){
        return lineRepository.findAll();
    }
}
