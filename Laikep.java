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
public class Laikep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền: ");
        int a = scanner.nextInt();
        System.out.print("Nhập lãi: ");
        double b = scanner.nextDouble() / 100;
        System.out.print("Nhập số tháng: ");
        int c = scanner.nextInt();
        double lai = 0;
        for (int i = 0; i < c; i++) {
            lai = a * b;
            a += lai;
        }
        System.out.println("Số tiền nhận được sau " + c + " tháng là: " + a);
    }
}
