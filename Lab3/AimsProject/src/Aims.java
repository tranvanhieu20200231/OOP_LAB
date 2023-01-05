//Họ và tên: Trần Văn Hiếu
//MSSV: 20200231
//Mã lớp TH: 721428

import java.util.Scanner;
public class Aims {
	public static void main(String [] args) {
		// Khởi tạo 1 giỏ hàng
		Cart anOrderCart = new Cart();
		// Khởi tạo DVD và thông tin DVD trong danh sách của cửa hàng
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Gaoranger", "Super Sentai", "Jun Hikasa", 90, 26.04f, 123);
		anOrderCart.addDigitalVideoDisc(dvd1); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd1); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("OnePiece", "Anime", "Eiichiro Oda", 117, 18.66f, 231);
		anOrderCart.addDigitalVideoDisc(dvd2); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd2); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd2); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd2); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("God of war", "Playstation Control", 69.99f, 321);
		anOrderCart.addDigitalVideoDisc(dvd3); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Naruto", "Anime", "Masashi Kishimoto", 106, 15.64f, 213);
		anOrderCart.addDigitalVideoDisc(dvd4); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd4); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Death Note", "Anime", "Tsugumi Ohba",94 , 22.56f, 132);
		anOrderCart.addDigitalVideoDisc(dvd5); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd5); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd5); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Doraemon", "Anime", "Fujio.F.Fujiko",116 , 13.65f, 312);
		anOrderCart.addDigitalVideoDisc(dvd6); // Thêm DVD vào giỏ hàng
		// Thêm toàn bộ danh sách vào giỏ hàng
		// DigitalVideoDisc[] dvdList = {dvd1,dvd2,dvd3,dvd4,dvd5,dvd6};
		// anOrderCart.addDigitalVideoDisc(dvdList);
		// In tổng tiền DVD trong giỏ hàng
		System.out.print("Tong tien: ");
		System.out.println(anOrderCart.totalCost());
		// In số lượng DVD trong giỏ hàng
		System.out.print("So luong DVD trong gio hang: ");
		System.out.println(anOrderCart.qtyOrdered);
		// In ra danh sách giỏ hàng
		anOrderCart.printCart();
	}
}