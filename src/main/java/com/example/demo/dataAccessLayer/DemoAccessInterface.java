package com.example.demo.dataAccessLayer;

import com.example.demo.Entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoAccessInterface  extends JpaRepository<DemoEntity,Integer> {
// this JPA is a generic type and the first bounded type parameter
    //is the name of the entity for which it is an interface of
    //the second is the data type of the primary key
}
