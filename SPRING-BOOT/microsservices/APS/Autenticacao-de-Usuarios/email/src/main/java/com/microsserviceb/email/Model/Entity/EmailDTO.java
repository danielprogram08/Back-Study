package com.microsserviceb.email.Model.Entity;

public record EmailDTO(String name, String email) {

    public Email convert() {
        Email Email = new Email();
        Email.setName(name);
        Email.setEmail(email);
        return Email;
    }
}
