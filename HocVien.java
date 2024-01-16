/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domanhcuong;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class HocVien {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm của học viên: ");
        int a = scanner.nextInt();
        if (a >= 0 && a <= 10) {
            if (a >= 8) {
                System.out.println("Giỏi");
            } else if (a >= 6.5) {
                System.out.println("Khá");
            } else if (a >= 5) {
                System.out.println("Trung Bình");
            } else {
                System.out.println("Yếu");
            }
        }else{
            System.out.println("Nhap sai diem!");
        }
    }

}
