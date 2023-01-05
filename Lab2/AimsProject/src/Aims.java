import java.util.Scanner;

public class Aims {
	public static void main(String [] args) {

		// Khởi tạo 1 giỏ hàng
		Cart anOrderCart = new Cart();

		// Khởi tạo DVD và thông tin DVD trong danh sách của cửa hàng
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Gaoranger", "Super Sentai", "Jun Hikasa", 90, 26.04f);
		anOrderCart.addDigitalVideoDisc(dvd1); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd1); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("OnePiece", "Anime", "Eiichiro Oda", 117, 18.66f);
		anOrderCart.addDigitalVideoDisc(dvd2); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd2); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd2); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd2); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("God of war", "Playstation Control", 69.99f);
		anOrderCart.addDigitalVideoDisc(dvd3); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Naruto", "Anime", "Masashi Kishimoto", 106, 15.64f);
		anOrderCart.addDigitalVideoDisc(dvd4); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd4); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Death Note", "Anime", "Tsugumi Ohba",94 , 22.56f);
		anOrderCart.addDigitalVideoDisc(dvd5); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd5); // Thêm DVD vào giỏ hàng
		anOrderCart.addDigitalVideoDisc(dvd5); // Thêm DVD vào giỏ hàng
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Doraemon", "Anime", "Fujio.F.Fujiko",116 , 13.65f);
		anOrderCart.addDigitalVideoDisc(dvd6); // Thêm DVD vào giỏ hàng
		// In tổng tiền DVD trong giỏ hàng
		System.out.print("Tong tien: ");
		System.out.println(anOrderCart.totalCost());
		// In số lượng DVD trong giỏ hàng
		System.out.print("So luong DVD trong gio hang: ");
		System.out.println(anOrderCart.qtyOrdered);
	}
}