package com.khangnc2008110130.tuan05;
import java.util.Scanner;
public class chuongTrinhMang {
    public static void main(String[] args) {
        int []arr ={3,5,7,9};
        Scanner varInput =new Scanner(System.in);
        int newElemen=8;// phân tử mới
        int size =arr.length;//số phần tử của mạng 
        
        int []newarr = new  int [5];
        for(int i=0;i<size;i++){
            newarr[i]=arr[i];
        }
        System.out.println("in mạng cũ");//in mạng cũ
        for(int x :arr){
            System.out.println(x);
        }
        newarr[size]=newElemen;// thêm giá trị mới vào mạng ở vtri cuối mạng
        System.out.println("in mạng mới .");
        for(int x:newarr){
            System.out.println(x);
        }
      
        int []newarrtwo =new int [5];//tạo mạng mới 
        for(int i=0;i<size;i++){
            newarrtwo[i]=arr[i];
        }
      
    
        newarrtwo[0]=newElemen;// gán giá trị mới vào đầu mạng 
        System.out.println("in mạng mới có phần tử nằm ở đầu mạng  ");
        for(int x :newarrtwo){
            System.out.println(x);
        }
        

        
    }

    
}
