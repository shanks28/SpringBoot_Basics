package com.example.demo.ServiceLayer;

import com.example.demo.Entity.DemoEntity;
import com.example.demo.dataAccessLayer.DemoAccessInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DemoService {
    @Autowired
    DemoAccessInterface demoAccessInterface;

    public List<DemoEntity> getAllBooks(){
        return demoAccessInterface.findAll();
    }
    public Optional<DemoEntity> getBookById(Integer id){
        return demoAccessInterface.findById(id);
    }
    public DemoEntity createBook(DemoEntity book){
        return demoAccessInterface.save(book);
    }
    public void updateTitle(Integer id,String title){
        Optional<DemoEntity> obj=demoAccessInterface.findById(id);
        if (obj.isPresent()){
            DemoEntity obj1=obj.get();
            obj1.setTitle(title);
            demoAccessInterface.save(obj1);
        }
        else{
            System.out.println("No object found with that ID");
        }
    }
    public void deleteBook( Integer id){
        demoAccessInterface.deleteById(id);
    }
}
