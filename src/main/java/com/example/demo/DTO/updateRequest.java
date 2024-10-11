package com.example.demo.DTO;

public class updateRequest {
    public static class updateTitle{
        private Integer id;
        private String title;
        public Integer getID(){
            return this.id;
        }
        public String getTitle(){
            return this.title;
        }
    }
    public static class updateName{
        private Integer id;
        private String name;

        public String getName(){
            return this.name;
        }
        public Integer getId(){
            return this.id;
        }
    }
}
