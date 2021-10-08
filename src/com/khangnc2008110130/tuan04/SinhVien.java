package com.khangnc2008110130.tuan04;

public class SinhVien {
    String MSSV;
    String name;
    String tuoi;
     public  SinhVien(String M,String h,String a){
        MSSV=M;
        name=h;
        tuoi=a;
    }
    SinhVien (String ab){
        tuoi=ab;
    }
    void inThongTinSV(){
        System.out.println("tên sinh viên  :"+name);
        System.out.println("mã số sinh viên:"+MSSV);
        System.out.println("tuổi           :"+tuoi);
    }
    
}
