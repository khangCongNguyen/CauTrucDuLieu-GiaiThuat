package com.khangnc2008110130.tuan05;

import java.util.ArrayList;
import java.util.List;

import com.khangnc2008110130.tuan03.cow;



public class CTMinhHoaArraylist {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("cường");
        a.add(2.1);
        a.add(2.5);
        System.out.println(a);
        List bienlist =new ArrayList();
        bienlist.add(new cow(22, "tây ban nha", "xanh"));
        cow cow=(cow)bienlist.get(0);
        System.out.println("weight:"+cow.weight+","+"br:"+cow.breed+","
        +"color:"+cow.color);
        System.out.println( bienlist);
        ArrayList <String>tenNguoi =new ArrayList<>();
        tenNguoi.add("nhóc");
        tenNguoi.add("ngu");
        System.out.println("tên người :"+tenNguoi.get(1)); 
    }
    
}
