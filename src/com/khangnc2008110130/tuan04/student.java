package com.khangnc2008110130.tuan04;

public class student {
   
        String MSSV;
    String hoTen;
    int age;
    String queQuan;

    student(String q,int t,String M,String ht){
        MSSV =M;
        hoTen=ht;
        age=t;
        queQuan=q;
    }
void  inThongTinStudent(){
    System.out.println("họ và tên sinh viên :"+hoTen);
    System.out.println("mã số sinh viên     :"+MSSV);
    System.out.println("tuổi sinh viên      :"+age);
    System.out.println("quê quán            :"+queQuan);

    }
    
}
