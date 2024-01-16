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
public class Giaithua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int a = scanner.nextInt();
        int s = 1;
        if (a == 0) {
            System.out.println("Giai thua cua " + a + " la: " + s);
        } else {
            for (int i = 1; i <= a; i++) {
                s *= i;
            }
            System.out.println("Giai thua cua " + a + " la: " + s);
        }
    }
}
