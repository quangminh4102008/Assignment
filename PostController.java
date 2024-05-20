package asignment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
    ArrayList<Post> posts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void createPost() {
        System.out.println("Thon tin moi khac hang");
        System.out.println("===========================================");
        System.out.println("Vui lòng nhập thông tin bài viết");
        System.out.println("Nhập mã bài viết: ");
        double id = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập tieu de bai viet: ");
        String title = scanner.nextLine();
        System.out.println("Nhập mô tả bài viết: ");
        String describe = scanner.nextLine();
        System.out.println("Nhập nội dung chính: ");
        String content = scanner.nextLine();
        System.out.println("Nhập tên tác giả: ");
        String author = scanner.nextLine();
        System.out.println("Ảnh đại diện: https://phunuvietnam.mediacdn.vn/media/news/33abffcedac43a654ac7f501856bf700/anh-profile-tiet-lo-g-ve-ban-1.jpg");
        // Nhập thời gian.
        LocalDate today = LocalDate.now();
        System.out.println("Ngày viết: " + today);
        Post post = new Post();
        post.setId(id);
        post.setTitle(title);
        post.setDescribe(describe);
        post.setContent(content);
        post.setAuthor(author);
        posts.add(post);
    }

    public void showListPost() {
        System.out.println("Hiển thị danh sách bài viết");
        System.out.println("===========================================");
        System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s || %s ", "Mã bài viết", "Tiêu đề", "mô tả", "nội dung chính", "tên tiêu đề", "Ngày viết");
        System.out.println("\n======================================================================================================================================================================================================================================================================");
        for (int i = 0; i < posts.size(); i++) {
            Post p = posts.get(i);
            System.out.printf("%-10s || %-30s || %-30s || %-30s || %-30s ", p.getId(), p.getTitle(), p.getDescribe(), p.getContent(), p.getAuthor());
        }
        System.out.println("\nNhấn Enter để tiếp tục");
        scanner.nextLine();
    }

    public void findListPost() {
        System.out.println("Tìm kiếm bài viết bạn muốn nhập");
        System.out.println("============================================");
        System.out.println("Vui lòng nhập mã sản phẩm bạn muốn tìm");
        double searchKey=scanner.nextDouble();
        for (int i = 0; i < posts.size(); i++) {
            Post p = posts.get(i);
            if(p.getId() == searchKey){
                System.out.println("Bai viet ban muon tim la: "+p.getTitle());
            }else{
                System.out.println("Khong tim thay bai viet nao: ");
            }
        }
        System.out.println("\nNhấn Enter để tiếp tục");
        scanner.nextLine();
        scanner.nextLine();
    }
}