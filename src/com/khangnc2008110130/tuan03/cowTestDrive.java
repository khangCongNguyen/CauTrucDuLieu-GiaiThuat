package com.khangnc2008110130.tuan03;

public class cowTestDrive {
    public static void main(String[] args) {
        cow cow ;
        cow = new cow();
        cow.weight=18;
        cow.color="Maroon ";
        cow.breed="indornexia";
        System.out.println("In Thông Tin Cow \n");
        System.out.println("weight :"+cow.weight+"\n"+"color :"+cow.color+"\n"+"breed :"+cow.breed+"\n");
        
        cow =new cow(16);
        System.out.println("weight :"+cow.weight+"\n");

       
        cow =new cow(15, "malaxia", "Black");
        System.out.println("weight :"+cow.breed+"\n"+"breed :"+cow.breed+"\n"+"color :"+cow.color);
    }
    
}
