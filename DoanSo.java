package domanhcuong;

import java.util.Random;
import java.util.Scanner;

public class DoanSo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số thứ hai: ");
        int b = scanner.nextInt();

        // Kiểm tra để đảm bảo a < b
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        Random random = new Random();
        int soRandom = random.nextInt((b - a) + 1) + a;

        System.out.println("----- Chào mừng đến với trò chơi đoán số -----");
        System.out.println("Một số ngẫu nhiên đã được tạo giữa " + a + " và " + b + ".");

        int soLanDoan = 3;

        for (int i = 1; i <= soLanDoan; i++) {
            System.out.print("Nhập vào dự đoán của bạn: ");
            int duDoan = scanner.nextInt();

            if (duDoan == soRandom) {
                System.out.println("Chúc mừng! Bạn đã đoán trúng số " + soRandom + ". Bạn đã thắng!");
                break;
            } else {
                if (duDoan < soRandom) {
                    System.out.println("Tăng lên. Bạn còn " + (soLanDoan - i ) + " lần.");
                } else {
                    System.out.println("Giảm xuống. Bạn còn " + (soLanDoan- i) + " lần.");
                }
            }
        }

        System.out.println("Trò chơi kết thúc. Số đúng là " + soRandom + ". Chúc bạn may mắn lần sau!");

        scanner.close();
    }
}
