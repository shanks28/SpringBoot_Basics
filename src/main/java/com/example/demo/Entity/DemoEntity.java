package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name="books")
public class DemoEntity {
    @Id// this indicates that this field is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// this indicates that it is autoincrement
    int id;
    @Column(name="title",nullable=false)
    private String title;
    @Column(name="author")
    private String author;
    @Column(name="price")
    private Double price;

    public DemoEntity(){}
    public DemoEntity(String Title,String author,Double price){
        this.title=Title;
        this.author=author;
        this.price=price;
    }
    public int getId(){
        return this.id;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public Double getPrice(){
        return this.price;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(Double price){
        this.price=price;
    }

}
