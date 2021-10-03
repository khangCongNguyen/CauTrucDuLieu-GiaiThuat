package com.khangnc2008110130.tuan01;
import java.util.Scanner;
public class BaiTap3Lab1 {
    public static void main(String[] args) {
        double canh,theTich;
        Scanner biennhap=new Scanner(System.in);
        System.out.println("  \tChương trình tính thể tích hình chữ nhật\n ");
        System.out.print("nhập cạnh của hình chứ nhât vào:");
        canh=biennhap.nextDouble();
        theTich=canh*canh*canh;
        System.out.println("thể tích hình chữ nhật là    :"+theTich);
    
}
    
}
