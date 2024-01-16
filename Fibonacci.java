/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domanhcuong;

/**
 *
 * @author ACER
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("20 số đầu tiên của dãy Fibonacci là:");

        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
