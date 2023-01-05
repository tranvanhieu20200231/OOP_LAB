// Ho va ten: TranVanHieu
// MSSV: 20200231
// 2.2.6 Write a program to solve:
// For simplicity, we only consider the real roots of the equations in this task.
// The system of first-degree equations (linear system) with two variables
// Example 6: Equation.java
import java.util.Scanner;
public class Equations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Khai bao va nhap du lieu tu ban phím
        //He phuong trinh co dang
        //a1x + b1y = c1
        //a2x + b2y = c2
        double a1,b1,c1,a2,b2,c2;
        double x,y;
        double D, Dx, Dy;
        System.out.print("Nhap a1 = ");
        a1 = sc.nextDouble();
        System.out.print("Nhap b1 = ");
        b1 = sc.nextDouble();
        System.out.print("Nhap c1 = ");
        c1 = sc.nextDouble();
        System.out.print("Nhap a2 = ");
        a2 = sc.nextDouble();
        System.out.print("Nhap b2 = ");
        b2 = sc.nextDouble();
        System.out.print("Nhap c2 = ");
        c2 = sc.nextDouble();
        //Tinh toan va xet cac truong hop xay ra
        D  = a1*b2-a2*b1;
        Dx = c1*b2-c2*b1;
        Dy = a1*c2-a2*c1;
        if(D == 0){
            if(Dx == 0 && Dy == 0){	//He vo so nghiem
                System.out.print("He vo so nghiem!");
            }else{					//He vo nghiem
                System.out.print("He vo nghiem!");
            }
        }else{						//He co 2 nghiem x va y
            x = Dx/D;
            y = Dy/D;
            System.out.print("x = " + x + ", y = " + y);
        }
        sc.close();
    }
}
