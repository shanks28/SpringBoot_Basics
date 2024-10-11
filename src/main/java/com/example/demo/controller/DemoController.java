package com.example.demo.controller;
import com.example.demo.Entity.DemoEntity;
import com.example.demo.ServiceLayer.DemoService;
import com.example.demo.dataAccessLayer.DemoAccessInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.demo.DTO.updateRequest;
@RestController
@RequestMapping("/api/books") //base url
public class DemoController {
    @Autowired
    DemoAccessInterface dataRepo;
    @Autowired
    DemoService service;

    @GetMapping
    public List<DemoEntity> getAllBooks(){
        return service.getAllBooks();
    }
    @PostMapping
    public void createBook(@RequestBody DemoEntity bookObj){
        try {
            service.createBook(bookObj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @PatchMapping
    public void updateTitle(@RequestBody updateRequest.updateTitle titleObj) {
        dataRepo.findById(titleObj.getID())
                .ifPresentOrElse(
                        (demoObj)->{
                            demoObj.setTitle(titleObj.getTitle());
                            dataRepo.save(demoObj);
                        },
                        ()-> {System.out.println("no such object found");}
                );
    }
}
