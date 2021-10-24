package com.khangnc2008110130.tuan03;

public class cow {
    public double weight;
    public String breed;
    public String color;
    // hàm tạo

    cow(){// hàm tạo mặc định trong java
    }
   public cow(double w, String br, String cl){// hàm tạo 3 tham số
        weight = w;
        breed = br;
        color = cl;
    }
    cow(double w){// hàm tạo 1 tham số
        weight=w; 
    } 

    
}
