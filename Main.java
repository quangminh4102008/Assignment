package asignment;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createMenu();
    }

    public static void createMenu() {
        Scanner scanner = new Scanner(System.in);
        PostController postController = new PostController();
        while (true) {
            System.out.println("XIn chao nguoi dung");
            System.out.println("================================");
            System.out.println("1.Them moi bai viet");
            System.out.println("2.Hien thi bai viet");
            System.out.println("3.tim kiem bai viet");
            System.out.println("4.xoa bai viet");
            System.out.println("0.thoat chuong trinh");
            System.out.println("Vui long chon tu (0-4)");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    postController.createPost();
                    break;
                case 2:
                    postController.showListPost();
                    break;
                case 3:
                    postController.findListPost();
                    break;
                case 4:
                    System.out.println("Chuong trinh dang phat trien");
                    break;
                case 0:
                    System.out.println("Tam biet nguoi dung");
                    break;
            }
            if(choice == 0){
                break;
            }
        }
    }
}
