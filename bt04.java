
public class bt04 {
    public static void main(String[] args) {

        // Khai báo và khởi tạo 2 số nguyên
        int a = 10;
        int b = 3;

        // Thực hiện các phép tính
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int phanDu = a % b;

        // In kết quả
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        System.out.println("Thương = " + thuong);
        System.out.println("Phần dư = " + phanDu);
    }
}

