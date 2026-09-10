import java.util.Scanner;

public class bt06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Khai báo biến
        float width;
        float height;
        float area;
        float circumference;

        // Nhập dữ liệu
        System.out.print("Nhập chiều rộng: ");
        width = sc.nextFloat();

        System.out.print("Nhập chiều cao: ");
        height = sc.nextFloat();

        // Tính diện tích
        area = width * height;

        // Tính chu vi
        circumference = 2 * (width + height);

        // In kết quả
        System.out.println("Diện tích hình chữ nhật: " + area);
        System.out.println("Chu vi hình chữ nhật: " + circumference);
    }
}
