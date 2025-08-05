package com.exceptions.exceptions.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exceptions.exceptions.Domain.Events;

public interface EventsRepository extends JpaRepository<Events, Integer>{

}