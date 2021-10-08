package com.khangnc2008110130.tuan04;
import java.util.Scanner;
import java.util.Arrays;


public class SinhVienTestDrive {
    public static void main(String[] args) {
        SinhVien [] sinhvienlist=new SinhVien[2];

        // nhập danh sách sinh viên từ bàn phím
        Scanner varInput =new Scanner (System.in);
        System.out.println("DANH SÁCH SINH VIÊN CỦA TÔI"+"\n");
        for (int i =0;i<sinhvienlist.length;i++){
            System.out.println("sinh viên thứ :"+(i+1));
            System.out.print("tên sinh viên:");
            String name=varInput.nextLine();
            System.out.print("mã số sinh viên :");
            String MSSV=varInput.nextLine();
            
            System.out.print("tuổi :");
            String tuoi =varInput.nextLine();
            varInput.nextLine();
            sinhvienlist[i]=new SinhVien(MSSV, tuoi, name);
        }
        //in ra danh sách sinh viên đã nhập vào 
        System.out.println("Danh sách sinh viên sau khi nhập ");
        for (SinhVien sinhVien : sinhvienlist) {
                sinhVien.inThongTinSV();  
            }

        // sắp xếp theo tuổi của sinh viên
      
  

        }
    
}
