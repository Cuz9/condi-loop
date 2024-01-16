/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domanhcuong;

/**
 *
 * @author ACER
 */
public class helloworld {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("HelloWorld");
            } else if (i % 3 == 0) {
                System.out.println("Hello");
            } else if (i % 5 == 0) {
                System.out.println("Would");
            } else {
                System.out.println(i);
            }
        }
    }

}
