package com.exceptions.exceptions.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exceptions.exceptions.Domain.Events;
import com.exceptions.exceptions.Domain.EventsDTO;
import com.exceptions.exceptions.Exception.EventsNotFoundException;
import com.exceptions.exceptions.Repository.EventsRepository;

@Service
public class EventsService {

    @Autowired
    private EventsRepository repository;

    @Transactional
    public ResponseEntity<EventsDTO> RegisterEvent(Events event) {
        try {
            EventsDTO Event = new EventsDTO();
            repository.save(Event.convert(event));
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Transactional(readOnly = true)
    public List<Events> ListAllEvents() {
        List<Events> events = repository.findAll();
        if (!events.isEmpty()) { return events; }
        throw new EventsNotFoundException("Nenhum evento encontrado.");
    }
}