package com.khangnc2008110130.tuan02;
import java.util.Scanner;
public class BaiTap4Lab2 {
    public static void main(String[] args) {
        int suLuaChon;
        do{
        Scanner biennhap= new Scanner(System.in);
    System.out.println("***************************M|>E|>N|>U*************************");
        System.out.println(">>1..chuong trinh giai ptrinh bậc nhất 1 ẩn");        
        System.out.println(">>2..chuong trinh giai ptrinh   bậc hai hai ẩn ");     
        System.out.println(">>3..chuong trinh tính tiền điện trong 1 tháng ");
        System.out.println(">>4.. Thoát chức năng chương trinh");
     System.out.println("****************************M|>E|>N|>U**********************");
    System.out.print("hay chon một chương trình yêu thích của bạn:");    
    suLuaChon=biennhap.nextInt();
        switch (suLuaChon){
            case 1 :    giaiPtrinhBac1();break; 
            case 2 :    giaiPtrinhBac2();break;
            case 3 :    tinhTienDien();break;
            default:System.out.println("thoat chương trinh ");
            }
        }while(suLuaChon<=3);
    }
    public static void giaiPtrinhBac1(){  Double a,b;
        Scanner biennhap =new Scanner(System.in);
        System.out.println("\t >>1.. chức năng  Giải phương trình bậc mộtcc");
        System.out.print("nhập vào biến a một số:");
        a=biennhap.nextDouble();
        System.out.print("nhập vào biến b một số ");
        b=biennhap.nextDouble();
        if(a==0){
            if (b==0)
                System.out.println("phuong trnh vo số nghiệm");
            else 
                System.out.println("phuong trinh vo nghiem");
           } else
            System.out.println("phuong trinh co nghiem duy nhât x="+(-b/2*a));   }
    public static void giaiPtrinhBac2(){double a,b,c,Delta,x1,x2;
        Scanner scanner=  new Scanner(System.in);
       System.out.println("phuong trinh bac 2 co dang la :ax2+bx+c=0");
       System.out.print("nhap so thu nhat vao cho bien a :");
       a=scanner.nextDouble();
       System.out.print("nhap so thu hai vao cho bien b:");
       b=scanner.nextDouble();
       System.out.print("nhap so thu ba vao cho bien c:");
       c=scanner.nextDouble();
       if (a==0)
       {
           if (b==0)
               {
                   if(c==0)
                   System.out.println("phuong trinh vo so nghiem");
                   else 
                   System.out.println("phuong trinh vo nghiem");
              }
              else 
              System.out.println("phuong trinh co nghiem duy nhat x=:"+(-c/b));

           }//tinh delta
           //tinh x1.x2
                  Delta = (b*b)-(4*a*c);
                 if(Delta>0){
                     x1=((-b+Math.sqrt(Delta))/(2*a));
                     x2=((-b-Math.sqrt(Delta))/(2*a));
                     System.out.printf("phuong trinh co hai nghiem phan biet:x1=%f,x2=%f",x1,x2);
               }else if (Delta==0){
                   x1=-b/(2*a);
                   System.out.println("phuong trinh co nghiem kep la "+x1);
               }else {
                   System.out.println("phuong trinh vo nghiem");
               }    }
    public static void tinhTienDien(){ double soDien,Tien;
        Scanner biennhap=new Scanner(System.in);
        System.out.println("\t\tChương trình tính tiền điện của 1 tháng\n");
        System.out.print("nhập số  điện sử dụng trong 1 tháng vào đay   :");
        soDien=biennhap.nextDouble(); 
        if (soDien>=0 & soDien<=50)
        {Tien=soDien*1000;
        }else
        Tien=(50*1000)+((soDien-50)*1200);
        System.out.println("tiền điện phải trả tháng này là:"+Tien+"vnd");

    }
    
}
