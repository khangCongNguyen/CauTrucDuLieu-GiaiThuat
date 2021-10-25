package com.khangnc2008110130.kiemtragiuki;

public class Apple {
    /*Apple (táo) (class Apple)
mã (id)
khối lượng
màu sắc: Vàng , xanh, Đỏ
constructor
(hàm in thông tin
hàm nhập)

1. Dùng Arraylist để cài đặt các chức năng
a) Tạo 1 Kho chứa táo (tùy cách cài đặt của mỗi sv)
b) Thêm táo vào kho (nhập từ bàn phím)
c) Tìm táo theo màu
d) In danh sách táo
e) Viết chương trình có hàm main()
để kiểm chứng vào chạy code cho các chức năng (class main())*/
    String id;
    String khoiLuong ;
    String color ;
    Apple(String cl){
        color =cl;    
    }
    public Apple(String i,String kl,String cl){
        id=i;
        kl=kl;
        color=cl;
    }
    Apple(){

    }
   void inThongTin(){
        System.out.println("mã apple là   :"+id);
        System.out.println(" khối lượng   :"+khoiLuong);
        System.out.println(" màu :"+color);
    }
    
      
}
