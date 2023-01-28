package com.example.FireHouse.controller;

import com.example.FireHouse.utill.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.example.FireHouse.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/login")
@CrossOrigin
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping(path = "/getLogin/{userName}/{password}")
    public ResponseEntity<StandardResponse> getLogin(@PathVariable(value = "userName") String userName, @PathVariable(value = "password") String password) {
        Boolean loginCreditionals = loginService.getLoginCreditionals(userName, password);
        ResponseEntity<StandardResponse> response = new ResponseEntity<StandardResponse>(
                new StandardResponse(201,"Sucess", loginCreditionals),
                HttpStatus.OK
        );
        return response;
    }
}

