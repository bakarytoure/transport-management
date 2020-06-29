package com.transport.transportmanagement.service;

import com.transport.transportmanagement.modal.Line;

import java.util.List;

public interface LineService {
    Line saveLine(Line line);

    List<Line> findAllLines();
}
