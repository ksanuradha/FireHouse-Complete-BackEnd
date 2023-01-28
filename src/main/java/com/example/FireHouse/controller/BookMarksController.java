package com.example.FireHouse.controller;

import com.example.FireHouse.dto.request.BookMarkDTO;
import com.example.FireHouse.service.BookMarkService;
import com.example.FireHouse.utill.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("api/v1/bookMark")
@CrossOrigin
public class BookMarksController {

    @Autowired
    BookMarkService bookMarkService;

    @GetMapping(path = "/getAll")
    public ResponseEntity<StandardResponse> getAllBookMarks() {
        ResponseEntity<StandardResponse> response = new ResponseEntity<StandardResponse>(
                new StandardResponse(201,"Sucess", bookMarkService.getBookMarkData()),
                HttpStatus.OK
        );
        return response;
    }

    @GetMapping(path = "/getAllBookMarks")
    public ResponseEntity<StandardResponse> getAllBookMarksAtloading() {
        ResponseEntity<StandardResponse> response = new ResponseEntity<StandardResponse>(
                new StandardResponse(201,"Sucess", bookMarkService.getBookMarkDataLoading()),
                HttpStatus.OK
        );
        return response;
    }

    @DeleteMapping(path = "/delete-BookMarks/{id}")
    public ResponseEntity<StandardResponse> deleteBookMark(@PathVariable(value = "id") int id) {
        ResponseEntity<StandardResponse> response = new ResponseEntity<StandardResponse>(
                new StandardResponse(201,"Sucessfully Deleted", bookMarkService.deleteBookMark(id)),
                HttpStatus.OK
        );
        return response;
    }

    @PutMapping(path = "/update-BookMarks")
    public void updateBookMark(@RequestBody BookMarkDTO bookMarkDTO) {
        this.bookMarkService.updateBookMark(bookMarkDTO);
    }

}
