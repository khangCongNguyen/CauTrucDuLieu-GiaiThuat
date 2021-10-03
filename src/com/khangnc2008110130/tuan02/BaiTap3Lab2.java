package com.khangnc2008110130.tuan02;
import java.util.Scanner;
public class BaiTap3Lab2 {
    public static void main(String[] args) {
        double soDien,Tien;
        Scanner biennhap=new Scanner(System.in);
        System.out.println("\t\tChương trình tính tiền điện của 1 tháng\n");
        System.out.print("nhập số klw điện sử dụng trong 1 tháng vào đay   :");
        soDien=biennhap.nextDouble(); 
        if (soDien>=0 & soDien<=50)
        {   Tien=soDien*1000;
        }else
        Tien=(50*1000)+((soDien-50)*1200);
        System.out.println("tiền điện phải trả tháng này là:"+Tien+"vnd");
        
    }
    
}
