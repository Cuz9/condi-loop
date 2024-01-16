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
public class So0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Positive");

        } else if (a < 0) {
            System.out.println("Negative");

        } else {
            System.out.println(a);
        }
    }
}
