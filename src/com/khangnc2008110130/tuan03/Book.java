package com.khangnc2008110130.tuan03;

public class Book {
    String booktitle;
    String producer;//người sản xuất
    int year;//năm
    String price;// giá bán
    String quantity;//số lượng
    Book(String B,String p){// hàm tạo 2 tham số 
        booktitle=B;
        producer=p;
    }
    Book(String Be,String pr,int yr){// hàm tạo 3 tham số
        booktitle=Be;
        producer=pr;
        year =yr;
    }
    void inThongTinboook(){
        System.out.println("book title :"+booktitle);
        System.out.println("producer   :"+producer);
        System.out.println("year       :"+year);
        System.out.println("price      :"+price);
        System.out.println("quamtity   :"+quantity);


    }
   
    
    
    
}
