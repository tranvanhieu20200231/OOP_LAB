import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;   // Giỏ hàng chứa tối đa 20 DVD
	public static final int MIN_NUMBERS_ORDERED = 0;	// Giỏ hàng tối thiểu 0 DVD
	private float totalcost = 0;  // Tổng tiền
	ArrayList<DigitalVideoDisc> itemsOderedList = 
			// Lưu danh sách DVD trong giỏ hàng
			new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED); 
	public int qtyOrdered = 0;  // Số lượng DVD trong giỏ hàng
	
	// Xóa 1 DVD khỏi giỏ hàng
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		// Kiểm tra xem giỏ hàng có DVD không
		if(qtyOrdered > MIN_NUMBERS_ORDERED) {
		itemsOderedList.remove(disc); // Xóa DVD
		System.out.println("DVD " + disc.getTitle() + " da duoc xoa khoi gio hang.");
		qtyOrdered = itemsOderedList.size(); // Cập nhật giỏ hàng
		}
		else System.out.println("Gio hang khong co DVD."); // Giỏ hàng trống
	}
	
	// Thêm 1 DVD vào giỏ hàng
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		// Kiểm tra xem giỏ hàng đã đầy chưa
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOderedList.add(disc); // Thêm DVD
			System.out.println("DVD " + disc.getTitle() + " da duoc them vao gio hang.");
			qtyOrdered = itemsOderedList.size(); // Cập nhật giỏ hàng
		}
		else System.out.println("Gio hang da day."); //Giỏ hàng đã đầy
	}
	
	// Thanh toán
	public float totalCost() {
		for(int i = 0; i < itemsOderedList.size(); i++) {
			totalcost += itemsOderedList.get(i).getCost();
		}
		return totalcost;
	}
}