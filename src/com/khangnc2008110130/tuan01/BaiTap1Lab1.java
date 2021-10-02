package com.khangnc2008110130.tuan01;
import java.util.Scanner;
public class BaiTap1Lab1 {
    public static void main(String[] args) {
        String hoVaten;
        double diemTB;
        Scanner biennhap = new Scanner(System.in); 
        System.out.print("nhập họ và tên của bạn vào đây :");
        hoVaten=biennhap.nextLine();
        System.out.print("nhập điểm trung bình môn cấu trúc dữ liệu và giải thuật vào đây :");
        diemTB=biennhap.nextDouble();
        System.out.println("ho va ten       :"+hoVaten);
        System.out.println("diem trung binh :"+diemTB);  
        System.out.printf("%s %.0fdiem",hoVaten,diemTB);
    }
    
}
