package com.khangnc2008110130.tuan03;
import java.util.Arrays;
import java.util.Scanner;
public class BaiTap3Lab3 {
    public static void main(String[] args) { 
        
        Scanner VaInput=new Scanner (System.in);
        
        System.out.print("nhập số phần tử của mạng:");
        int n=VaInput.nextInt();
        
        // tạo mạng số nguyên
        int []array=new int[n];
        // nhập vào mạng 
        for (int  i=0;i<n;i++){
            System.out.print("số thứ "+(i+1)+":");
            array[i]=VaInput.nextInt();
        }
        //xuẩt mạng vừa nhập ra màng hinh
        System.out.println("-------------xuất mạng vừa nhập------------ ");
        for (int i : array) {
            System.out.println(i);
        }
        //sắp xếp và xuất mạng
        System.out.println("-------------xuất mảng sau khi sắp xếp------");
        Arrays.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
        for(int i = 0;i<n-1;i++){
            for(int j =i+1;j<n-1;j++){
                if(array[i]<array[j]){
                    int min =array[i];
                    array[i]=array[j];
                    array[j]=min;
                }
            }
        }
        // xuất phân tử có giá trị nhỏ nhất ra màng hình
        int Min = Math.min(0, array.length); 
        System.out.println("giá trị nhỏ nhất của phần tử là:"+Min);
        //tính trung binh cộng các phần tử chia hết cho 3 
        double total = 0;
        for(int  i=0; array[i] % 3==0; i++){
            total = array[i] + total;
        }
            System.out.println("          ");
                double average;
                average = total/3;
            System.out.println("Trung bình cộng các phần tử chia hết cho 3:"+ average);
     }
    
}
