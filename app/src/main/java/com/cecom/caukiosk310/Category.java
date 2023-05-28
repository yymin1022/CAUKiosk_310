package com.cecom.caukiosk310;

public class Category {
    String cate = "";
    String room = "";

    Category(String cate, String room){
        this.cate = cate;
        this.room = room;
    }
    Category(String cate){
        this.cate = cate;
    }

    @Override
    public String toString() {
        return this.cate;
    }
}
