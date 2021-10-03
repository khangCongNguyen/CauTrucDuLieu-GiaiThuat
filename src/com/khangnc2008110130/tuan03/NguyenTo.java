package com.khangnc2008110130.tuan03;
import java.util.Scanner;
public class NguyenTo {
    public static void main(String[] args) {
        int soNguyen;
        boolean ok=true;
        Scanner biennhap=new Scanner(System.in);
        System.out.print("hãy nhập vào một số nguyên :");
        soNguyen=biennhap.nextInt();

        for (int i=2;i<soNguyen-1;i++){
            if(soNguyen%i==0){
                ok=false;
                break;
            }
        }
    
    if(ok==true){
        System.out.println(""+soNguyen+" là số nguyên tố");
    }else{
        System.out.println(""+soNguyen+" không phải là số nguyên tố");
    }
  }
}
