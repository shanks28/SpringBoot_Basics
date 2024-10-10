package com.example.demo.controller;
import com.example.demo.Entity.DemoEntity;
import com.example.demo.dataAccessLayer.DemoAccessInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api/books") //base url
public class DemoController {
    @Autowired
    DemoAccessInterface dataRepo;

    @GetMapping
    public List<DemoEntity> getAllBooks(){
        return dataRepo.findAll();
    }
    @PostMapping
    public void createBook(@RequestBody DemoEntity bookObj){
        try {
            dataRepo.save(bookObj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
