package com.khangnc2008110130.tuan03;

public class NhanVienTestDrive {
    public static void main(String[] args) {
        NhanVien nhanvien=new NhanVien("nguyễn công khang ", ("18k /giờ"), " 6 Nguyễn Trọng Tuyển  phường 9");
        System.out.println("tên nhân viên :"+nhanvien.name+"\n"+"lương\t:"+nhanvien.wage+"\n"+"địa chỉ:"+nhanvien.address+"\n");
        nhanvien.address=("198 Nguyễn Trọng Tuyển");
        nhanvien.ngaySinh=("10/05/2002");
        nhanvien.boPhanLamViec=(" phục vụ quán ăn nhà hàng padora");
        nhanvien.wage=("18k/giờ");
        nhanvien.inThongTinNhanVien();
    }
    
}
