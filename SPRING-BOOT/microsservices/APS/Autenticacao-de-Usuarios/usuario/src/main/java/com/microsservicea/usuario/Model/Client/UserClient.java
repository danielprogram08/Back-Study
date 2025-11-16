package com.microsservicea.usuario.Model.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microsservicea.usuario.Model.Entity.UserClientDTO;

@FeignClient(name="email", url="http://localhost:8081/email")
public interface UserClient {

    @PostMapping("/send")
    void sendUserByEmail(@RequestBody UserClientDTO client);
}