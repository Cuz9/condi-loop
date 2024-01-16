/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domanhcuong;

/**
 *
 * @author ACER
 */
public class Songuyento {
    public static boolean SoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int dem = 0;
        int soHienTai = 2;

        System.out.println("20 số nguyên tố đầu tiên là:");

        while (dem < 20) {
            if (SoNguyenTo(soHienTai)) {
                System.out.print(soHienTai + " ");
                dem++;
            }
            soHienTai++;
        }
    }
}
