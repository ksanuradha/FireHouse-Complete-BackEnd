package com.example.FireHouse.service.impl;

import com.example.FireHouse.dto.request.LoginDTO;
import com.example.FireHouse.entity.Login;
import com.example.FireHouse.repo.LoginRepo;
import com.example.FireHouse.service.LoginService;
import com.example.FireHouse.utill.mappers.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceIMPL implements LoginService {
    @Autowired
    LoginRepo loginRepo;

    @Autowired
    private ItemMapper itemMapper;
    
    @Override
    public boolean getLoginCreditionals(String userName, String password) {
        Login login = loginRepo.getById(userName);
        LoginDTO loginDTO = itemMapper.entityToDto(login);
        return loginDTO.getPassword().equals(password);
    }
}
