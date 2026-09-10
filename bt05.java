
import java.util.Scanner;

public class bt05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập phân số thứ nhất
        System.out.print("Nhập tử số phân số 1: ");
        int a = sc.nextInt();

        System.out.print("Nhập mẫu số phân số 1: ");
        int b = sc.nextInt();

        // Nhập phân số thứ hai
        System.out.print("Nhập tử số phân số 2: ");
        int c = sc.nextInt();

        System.out.print("Nhập mẫu số phân số 2: ");
        int d = sc.nextInt();

        // Tính tổng
        int tuSo = a * d + c * b;
        int mauSo = b * d;

        // In kết quả
        System.out.println("Tổng hai phân số là: " + tuSo + "/" + mauSo);
    }
}