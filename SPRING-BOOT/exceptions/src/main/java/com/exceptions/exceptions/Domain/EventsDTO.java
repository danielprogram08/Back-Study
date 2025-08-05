package com.exceptions.exceptions.Domain;

public record EventsDTO() {

    public Events convert(Events event) {
        Events Events = new Events();
        Events.setTitle(event.getTitle());
        Events.setDescription(event.getDescription());
        Events.setAddress(event.getAddress());
        Events.setCity(event.getCity());
        Events.setState(event.getState());
        Events.setRemote(event.isRemote());
        return Events;
    }
}