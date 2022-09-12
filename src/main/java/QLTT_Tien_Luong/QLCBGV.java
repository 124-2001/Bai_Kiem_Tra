package QLTT_Tien_Luong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCBGV {
    List<CBGV> cbgvs = new ArrayList<>();

    public boolean CheckListNull(){
        if(cbgvs.size()==0){
            return false;
        }
        else {
            return true;
        }
    }
    public boolean CheckCodeTeacherIsExist(String code){
        boolean exist=true;
        for (CBGV cbgv : cbgvs) {
            if(cbgv.getCode()==code){
                exist= false;
            }
            else {
                exist= true;
            }
        }
        return exist;
    }
    public void ThemMoiGiaoVien(){
        CBGV cb = new CBGV();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten giao vien : ");
        String name = sc.nextLine();
        cb.setName(name);
        System.out.println("Nhap tuoi giao vien : ");
        int age = sc.nextInt();
        cb.setAge(age);
        System.out.println("Nhap ma giao vien : ");
        String code = sc.nextLine();
        sc.nextLine();
        while (!CheckCodeTeacherIsExist(code)){
            System.out.println("Ma giao vien ton tai . Nhap lai : ");
            code = sc.nextLine();
        }
        cb.setCode(code);
        System.out.println("Nhap luong cung");
        int luong_cung = sc.nextInt();
        cb.setLuong_cung(luong_cung);
        System.out.println("Nhap luong thuong");
        int luong_thuong = sc.nextInt();
        cb.setLuong_thuong(luong_thuong);
        System.out.println("Nhap tien phat");
        int tien_phat = sc.nextInt();
        cb.setTien_phat(tien_phat);
        cbgvs.add(cb);
        System.out.println("Them thanh cong");
    }
    public void XoaGiaoVien(String code){
        if(!CheckListNull()){
            System.out.println("Danh sach rong");
        }
        else {
            for (CBGV cbgv : cbgvs) {
                if(cbgv.getCode()==code){
                    cbgvs.remove(cbgv);
                    System.out.println("Xoa giao vien "+ cbgv.getCode()+ "thanh cong ");
                }
            }
        }
    }

    public void ShowLisstGiaoVien(){
        if(!CheckListNull()){
            System.out.println("Danh sach rong");
        }
        else {
            for (CBGV cbgv : cbgvs) {
                System.out.println("************************");
                System.out.println("Ten giao vien : "+cbgv.getName());
                System.out.println(cbgv.getAge()+" tuoi");
                System.out.println("Ma giao vien : "+cbgv.getCode());
                System.out.println("Que quan : "+cbgv.getAddress());
                System.out.println("************************");
            }
        }
    }

    public void ShowLuong(String code){
        if(!CheckListNull()){
            System.out.println("Danh sach rong");
        }
        else {
            for (CBGV cbgv : cbgvs) {
                System.out.println("************************");
                System.out.println("Ten giao vien : "+cbgv.getName());
                System.out.println("Ma giao vien : "+cbgv.getCode());
                System.out.println("Luong thuc linh : "+cbgv.getLuong_thuc_linh());
                System.out.println("************************");
            }
        }
    }

}
