// Ho va ten: TranVanHieu
// MSSV: 20200231
// 2.2.5
// Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.
// Example 5: Calculate.java
import javax.swing.JOptionPane;

public class Calculate {
	public static void main(String[] args) {
		   String strNum1, strNum2;		//Khai bao xau luu so thu nhat va so thu hai
		   String strNotification = "Ket qua cua phep toan la: \n";
		   //Xau thong bao yeu cau nguoi dung nhap so
		   strNum1 = JOptionPane.showInputDialog(null,
				   "Hay nhap so hang thu nhat: ","Nhap so hang thu nhat",
				   JOptionPane.INFORMATION_MESSAGE);
		   strNum2 = JOptionPane.showInputDialog(null,
				   "Hay nhap so hang thu hai: ","Nhap so hang thu hai",
				   JOptionPane.INFORMATION_MESSAGE);
		   //Thuc hien qua trinh tinh toan va chuyen doi so tu String dang Double
		   double sum = Double.parseDouble(strNum1) + Double.parseDouble(strNum2) ;
	       double difference = Double.parseDouble(strNum1) - Double.parseDouble(strNum2) ;
	       double product = Double.parseDouble(strNum1) * Double.parseDouble(strNum2) ;
	       double quotient = Double.parseDouble(strNum1) / Double.parseDouble(strNum2) ;
	       //Phep tinh va ket qua
		   strNotification += strNum1 + " + " + strNum2 + " = " + sum + "\n";
		   strNotification += strNum1 + " - " + strNum2 + " = " + difference + "\n";
		   strNotification += strNum1 + " * " + strNum2 + " = " + product + "\n";
		   strNotification += strNum1 + " / " + strNum2 + " = " + quotient + "\n";
		   //Hien thi ket qua
		   JOptionPane.showMessageDialog(null, strNotification,
				   "Hien thi ket qua ", JOptionPane.INFORMATION_MESSAGE);
		   System.exit(0);
	   }
}