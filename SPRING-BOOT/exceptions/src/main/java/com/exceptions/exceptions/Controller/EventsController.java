package com.exceptions.exceptions.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exceptions.exceptions.Domain.Events;
import com.exceptions.exceptions.Domain.EventsDTO;
import com.exceptions.exceptions.Service.EventsService;

@Controller
@RequestMapping("/Events")
public class EventsController {

    @Autowired
    private EventsService service;

    @PostMapping("/Register")
    public ResponseEntity<EventsDTO> RegisterEvent(@RequestBody Events event) { return service.RegisterEvent(event); }

    @GetMapping
    public ResponseEntity<List<Events>> ListAllEvents() { return service.ListAllEvents(); }
}
