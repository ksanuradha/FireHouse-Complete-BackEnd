package com.example.FireHouse.service;

import com.example.FireHouse.dto.request.BookMarkDTO;
import com.example.FireHouse.entity.BookMark;
import java.util.List;

public interface BookMarkService {
    public List<BookMarkDTO> getBookMarkData();

    public List<BookMarkDTO> getBookMarkDataLoading();

    String deleteBookMark(int id);

    void updateBookMark(BookMarkDTO bookMarkDTO);

}
