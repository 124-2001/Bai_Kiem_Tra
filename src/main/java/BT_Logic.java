import java.util.Scanner;

public class BT_Logic {
    public Boolean Bai1(){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public void Bai1A(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang ");
        int n = sc.nextInt();
        int[]arrInt = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+i+1 +" :");
            arrInt[i]=sc.nextInt();
        }
        System.out.print("Mang da nhap la :");
        for (int i : arrInt) {
            System.out.print(i+" ");
        }
        System.out.print("So trung binh la : ");
        int tbc=0;
        for (int i : arrInt) {
            tbc+=i;
        }
        System.out.println(tbc);
        System.out.println("Cac so lon hon so trung binh : ");
        for (int i : arrInt) {
            if(i>tbc){
                System.out.print(i+" ");
            }
        }
    }
    public void Bai2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra : ");
        String str = sc.nextLine();
        char[] arrString = new char[]{'u','e','o','a','i'};
        boolean exist=true;
        char[] arrChar = str.toCharArray();
        int count =0;
        for (char s : arrString) {
            for (char c1 : arrChar) {
                if(c1==s){
                    count++;
                    break;
                }
            }
        }
        if(count==arrChar.length){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public void Bai2a(){
        Scanner sc = new Scanner(System.in);
        System.out.println("So nguyen cho truoc la : ");
        int n = sc.nextInt();
        System.out.println("Nhap so luong phan tu cua mang la : ");
        int k = sc.nextInt();
        int[] arrInt = new int[k];
        for (int i =0;i<k;i++){
            System.out.println("Nhap phan tu thu "+i+1+" :");
            arrInt[i]=sc.nextInt();
        }
        for (int i=0;i<k-1;i++){
            if(arrInt[i]+arrInt[i+1]==n){
                System.out.println("Mang con la :"+ "["+arrInt[i]+","+arrInt[i+1]+"]");
            }
        }
    }
    public void Bai3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra");
        String number = sc.nextLine();
        if(number.charAt(0)!=0){
            System.out.println("Phai co so 0 o dau ");
        }
        if(number.length()!=10){
            System.out.println("Day so phai co 10 so");
        }
        if(number.charAt(0)==0&&number.length()==10){
            System.out.println("Chap nhan ");
        }
    }
    public void Bai4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang la : ");
        int k = sc.nextInt();
        boolean exist=false;
        int[] arrInt = new int[k];
        for (int i =0;i<k;i++){
            System.out.println("Nhap phan tu thu "+i+1+" :");
            arrInt[i]=sc.nextInt();
        }
        if(arrInt[0]<0){

        }
        else {
            for (int i=0;i<k;i+=2){
                if(arrInt[i]>0){
                    if (arrInt[i+1]>0){
                        exist= false;
                        break;
                    }
                    else {
                        exist=true;
                    }
                }
            }
        }
        System.out.println(exist);
    }
}
