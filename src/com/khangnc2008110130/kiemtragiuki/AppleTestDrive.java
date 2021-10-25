package com.khangnc2008110130.kiemtragiuki;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AppleTestDrive {
   
    static ArrayList <Apple> list = new ArrayList<Apple>();
  //nhập vào 
  static void nhap(){
    Scanner vaInput  = new Scanner (System.in);  
    vaInput.nextLine();
    while(true){
        Apple Apple = new Apple();
        System.out.print("Nhập màu sắc: ");
        Apple.color = vaInput.nextLine();
        System.out.print("Nhập mã ID: ");
        Apple.id = vaInput.nextLine();
        System.out.print("Nhập khối lượng: ");
        Apple.khoiLuong = vaInput.nextLine();
    
        vaInput.nextLine();
        System.out.print("Nhập thêm (y/n)?: ");
        if(vaInput.nextLine().equals("n"))
            break;
        }
    }
    
    
      //Xuất thông tin vừa nhập .
       void inThongTin(){
        for (Apple a : list){
            a.inThongTin();
       }
    }
  
    
    
}
