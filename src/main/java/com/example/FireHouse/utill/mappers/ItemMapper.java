package com.example.FireHouse.utill.mappers;

import com.example.FireHouse.dto.request.BookMarkDTO;
import com.example.FireHouse.dto.request.LoginDTO;
import com.example.FireHouse.entity.BookMark;
import com.example.FireHouse.entity.Login;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    LoginDTO entityToDto(Login login);
    List<BookMarkDTO> bookMarkEntityToDto(List<BookMark> bookMarks);
}
