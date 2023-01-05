//Họ và tên: Trần Văn Hiếu
//MSSV: 20200231
//Mã lớp TH: 721428

public class CartTest {
	public static void main(String[]  args){
		// Khởi tạo giỏ hàng mới
		Cart cart = new Cart();
		// Khởi tạo DVD và thêm vào giỏ hàng mới
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Gaoranger", "Super Sentai", "Jun Hikasa", 90, 26.04f, 123);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("OnePiece", "Anime", "Eiichiro Oda", 117, 18.66f, 231);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("God of war", "Playstation Control", 69.99f, 321);
		cart.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Naruto", "Anime", "Masashi Kishimoto", 106, 15.64f, 213);
		cart.addDigitalVideoDisc(dvd4);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Death Note", "Anime", "Tsugumi Ohba",94 , 22.56f, 132);
		cart.addDigitalVideoDisc(dvd5);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Doraemon", "Anime", "Fujio.F.Fujiko",116 , 13.65f, 312);
		cart.addDigitalVideoDisc(dvd6);
		// In thông tin giỏ hàng
		cart.printCart();
		// Nhập ID của DVD để kiểm tra
		cart.searchCartId();
		// Nhập tiêu đề DVD để kiểm tra
		cart.searchCartTitle();
	}
}
