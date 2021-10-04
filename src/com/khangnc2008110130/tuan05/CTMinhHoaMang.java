package com.khangnc2008110130.tuan05;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        int [] mangSoNguyen = new int [10];
        int []arr ={3,5,7,9};
        
        int newElement=8;
        int soNguyen=arr.length;
        int []newArr=new int [soNguyen+1];
        

        
        for (int i =0;i<soNguyen;i++){
            newArr[i]=arr[i];
        }
        System.out.println("in mang cu");
        for( int x :arr){
            System.out.println(x);
        }
 
        newArr[soNguyen]=newElement;
        System.out.println("in mảng mới ");
        for(int x :newArr){
            System.out.println(x);
        }
    }
    
}
