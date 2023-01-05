// Ho va ten: TranVanHieu
// MSSV: 20200231
// 2.2.6 Write a program to solve:
// For simplicity, we only consider the real roots of the equations in this task.
// Example 6: Equation.java
import java.util.Scanner;
 
public class Equation {
    private static Scanner scanner = new Scanner(System.in);
    //Yeu cau nguoi dung nhap he so cua phuong trinh bac 2 co dang
    //ax^2 + bx + c = 0
    //a la he so bac 2
    //b la he so bac 1
    //c la hang so tu do
    public static void main(String[] args) {
        System.out.print("Nhap he so bac 2, a = ");		//Hien thi thong bao va nhap he so a
        float a = Equation.scanner.nextFloat();
        System.out.print("Nhap he so bac 1, b = ");		//Hien thi thong bao va nhap he so b
        float b = Equation.scanner.nextFloat();
        System.out.print("Nhap hang so tu do, c = ");	//Hien thi thong bao va nhap he so c
        float c = scanner.nextFloat();
        Equation.PTBac2(a, b, c);
    }
    //Xu ly cac truong hop xay ra
    public static void PTBac2(float a, float b, float c) {
        //Kiem tra he so nhap vao
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");	//Phuong trinh khong co nghiem
            } else {
                System.out.println("Phuong trinh co mot nghiem: "
                        + "x = " + (-c / b));					//Phuong trinh co nghiem duy nhat
            }
            return;
        }
        //Khai bao nghiem va tinh delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        //Xet truong hop va tinh nghiem, in ket qua ra man hinh
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co 2 nghiem phan biet la: "
                    + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiep kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}
