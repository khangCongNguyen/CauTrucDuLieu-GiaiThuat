package com.khangnc2008110130.tuan04;
import java.util.Scanner;
public class studenTestDrive {
    public static void main(String[] args) {
         //nhập danh sách sv từ bàn phím
         Scanner varInput=new Scanner(System.in);
         student[]studentlist =new student[2];
         System.out.println("danh sách sinh viên");
         for(int i=0;i<studentlist.length;i++){
             System.out.println("nhâp sinh viên thứ "+(i+1));
             System.out.print("tên sinh viên:");
             String hoTen=varInput.nextLine();
             System.out.print("tuổi:");
             int age=varInput.nextInt();
             varInput.nextLine(); 
             System.out.print("quê quán:");
             String queQuan=varInput.nextLine();
             System.out.print("mã số sinh viên:");
             String MSSV = varInput.nextLine();
             varInput.nextLine();// nhận phim enter
             studentlist[i]=new student(queQuan, age, MSSV, hoTen);  
         }
       
        
 
 
 
         /// in danh sách sinh vien
         System.out.println("in dnah sach sinh sau nhập");
         for (student student : studentlist) {
             for(int i =0;i<studentlist.length;i++){
                 System.out.println("sinh viên thứ :"+(i+1));
             }
           
             student.inThongTinStudent(); 
             
         }
}
    
}
