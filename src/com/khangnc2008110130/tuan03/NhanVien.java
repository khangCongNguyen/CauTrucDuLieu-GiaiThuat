package com.khangnc2008110130.tuan03;

public class NhanVien {
  /*  tên nhân viên
		lương
		địa chỉ
		bộ phận làm việt
		Ngày sinh (dùng chuỗi)*/
        String name;
        String wage;
        String address;
        String boPhanLamViec;
        String ngaySinh;
        NhanVien(String N,String L,String ad){// hàm tạo 3 tham số
            name    = N;
            wage    = L;
            address = ad;
        }
        void inThongTinNhanVien(){
            System.out.println("tên nhân viên   :"+name);
            System.out.println("lương           :"+wage);
            System.out.println("địa chỉ         :"+address);
            System.out.println("Bộ Phận Làm việc:"+boPhanLamViec);
            System.out.println("ngày sinh       :"+ngaySinh);
        }
    
}
