package com.cecom.caukiosk310;

import java.util.ArrayList;

public class CategoryArrayList<Category> extends ArrayList<Category> {
    public int contains(String cateName){
        boolean returnBoolean = false;
        for(int i = 0; i < this.size(); i++){
            if(cateName.equals(this.get(i).toString())){
                return i;
            }
        }
        return -1;
    }
}
