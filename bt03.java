import java.util.Scanner;

public class bt03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính: ");
        double r = sc.nextDouble();

        double dienTich = Math.PI * r * r;

        System.out.println("Diện tích hình tròn là: " + dienTich);
    }
}


