package com.khangnc2008110130.tuan03;

public class BookTestDrive {
    public static void main(String[] args) {
            Book book =new Book("programming language", "programmers");
            System.out.println("book title :"+book.booktitle+"\n"+"producer  :"+book.producer+"\n");
            book=new Book("programming language", "programmers", 2021);
            System.out.println("book title :"+book.booktitle+"\n"+"producer   :"+book.producer+"\n"+"year       :"+book.year+"\n");
            book.booktitle=("programming language");
            book.price=("500k 1 book");
            book.producer=("programmers");
            book.quantity=("1");
            book.year=2021;
            book.inThongTinboook();
    }
}
