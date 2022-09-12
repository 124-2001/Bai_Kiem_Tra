import QLTT_Tien_Luong.QLCBGV;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        QLCBGV ql = new QLCBGV();

        while (true){
            System.out.println("******___________________******");
            System.out.println("1)Them moi can bo");
            System.out.println("2)Xoa theo ho ten");
            System.out.println("3)Hien thi luong can bo");
            System.out.println("4)Quit");
            System.out.println("******___________________******");
            int n = sc.nextInt();
            while (n>5 || n<0){
                System.out.print("Nhap lai :");
                n = sc.nextInt();
            }
            switch (n){
                case 1:
                    ql.ThemMoiGiaoVien();
                    break;
                case 2:
                    System.out.println("Ma giao vien la : ");
                    String code1 = sc.nextLine();
                    sc.nextLine();
                    ql.XoaGiaoVien(code1);
                    break;
                case 3:
                    System.out.println("Ma giao vien la : ");
                    String code2 = sc.nextLine();
                    sc.nextLine();
                    ql.ShowLuong(code2);
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }
    }

}
