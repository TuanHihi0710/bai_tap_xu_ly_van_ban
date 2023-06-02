import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyVanBan quanLyVanBan = new QuanLyVanBan();
        int nhap = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 3 để chọn Menu:");
                System.out.println("1: Nhap vao mot xau chuoi");
                System.out.println("2: Xây dựng phương thức đếm số từ của một xâu");
                System.out.println("3: Xây dựng phương thức đếm số ký tự H");
                System.out.println("4: Chuẩn hoá một xâu theo tiêu chuẩn");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 7) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap==1) {
                    System.out.println("Nhap vao mot xau chuoi");
                    Scanner scVanBan = new Scanner(System.in);
                    String vanBan = scVanBan.nextLine();
                    quanLyVanBan.NhapVaoMotXauChuoi(vanBan);
                } else if (nhap == 2) {
                    System.out.println("Xây dựng phương thức đếm số từ của một xâu");
                    System.out.println(quanLyVanBan.DemKyTuChuoi());
                } else if (nhap == 3) {
                    System.out.println("Xây dựng phương thức đếm số ký tự H");
                    System.out.println("So lan xuat hien ky ty H la: "+quanLyVanBan.DemKyTuHTrongXauChuoi());
                } else if (nhap == 4) {
                    System.out.println("Chuẩn hoá một xâu theo tiêu chuẩn");
                    System.out.println(quanLyVanBan.XoaKyTuDauCuoi());
                } else if (nhap==5) {
                    System.out.println("Replace");
                    System.out.println(quanLyVanBan.replaceAll());
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 7);
    }
}