package com.khangnc2008110130.tuan01;
import java.util.Scanner;
public class BaiTap2Lab1 {
    public static void main(String[] args) {
        double chuVi,dienTich,dai,rong,canhnhoNhat;
        Scanner biennhap=new Scanner(System.in);
        System.out.print("nhập chiều dài của hình chữ nhật vào :");
        dai=biennhap.nextDouble();             
        System.out.print("nhập chiều rông của hình chữ nhật vào:");
        rong=biennhap.nextDouble();            
        chuVi=(dai+rong)*2;                    
        System.out.println("chu vi hình chữ nhật là        :"+chuVi);
        dienTich=dai*rong;                      
        System.out.println("diện tích hình chứ nhật là     :"+dienTich);
        canhnhoNhat=Math.min(dai,rong);         
        System.out.println("cạnh nhỏ nhất hình chứ nhật là :"+canhnhoNhat);
        
    }
}
