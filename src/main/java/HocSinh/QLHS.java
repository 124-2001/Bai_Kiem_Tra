package HocSinh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLHS {
    List<HocSinh> arrHS = new ArrayList<>();

    public boolean CheckNullList(){
        if(arrHS.size()==0){
           return false;
        }
        else {
            return true;
        }
    }
    public void AddStudent(){
        Scanner sc = new Scanner(System.in);
        HocSinh hs = new HocSinh();
        System.out.println("Ten sinh vien :");
        String name = sc.nextLine();
        hs.setTen(name);
        System.out.println("Tuoi sinh vien :");
        int age = sc.nextInt();
        hs.setTuoi(age);
        System.out.println("Nhap que quan sinh vien : ");
        String address= sc.nextLine();
        hs.setQuequan(address);
        arrHS.add(hs);
        System.out.println("Them thanh cong ");
    }
    public void ShowList(){
        if(!CheckNullList()){
            System.out.println("Danh sach rong");
        }
        for (HocSinh hs : arrHS) {
            System.out.println("***************************");
            System.out.println("Ten sinh vien : "+hs.getTen());
            System.out.println(hs.getTuoi()+" tuoi");
            System.out.println("Que quan : "+hs.getQuequan());
            System.out.println("***************************");
        }
    }
    public void CheckAgeStudent(int age){
        if(!CheckNullList()){
            System.out.println("Danh sach rong");
        }
        for (HocSinh hs : arrHS) {
           if(hs.getTuoi()==age){
               System.out.println("***************************");
               System.out.println("Ten sinh vien : "+hs.getTen());
               System.out.println(hs.getTuoi()+" tuoi");
               System.out.println("Que quan : "+hs.getQuequan());
               System.out.println("***************************");
           }
        }

    }
    public int ShowSizeStudent(){
        int count =0;
        if(!CheckNullList()){
            System.out.println("Danh sach rong");
            count=-1;
        }
        else {
            for (HocSinh hs : arrHS) {
                if(hs.getTuoi()==23&&hs.getQuequan()=="DN"){
                    count++;
                }
            }
        }
        return count;
    }

}
