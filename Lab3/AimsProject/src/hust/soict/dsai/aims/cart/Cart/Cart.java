//Họ và tên: Trần Văn Hiếu
//MSSV: 20200231
//Mã lớp TH: 721428
import java.util.ArrayList;
import java.util.Scanner;

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
			
			System.out.println("ID: " + disc.id) ;
		}
		else System.out.println("Gio hang da day."); //Giỏ hàng đã đầy
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		for(int i = 0; i < dvdList.length; i++) {
			// Nếu số lượng chưa max thì có thể thêm
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOderedList.add(dvdList[i]);
				System.out.println("DVD " + dvdList[i].getTitle() + " da duoc them vao gio hang.");
				qtyOrdered = itemsOderedList.size();
			}
			// Nếu số lg max rồi thì ko thêm đc nx
			else System.out.println("Gio hang da day.");
		}
	}
	/**
	 * Adds the digital video disc.
	 */
	public void addDigitalVideoDisc() {
		
	}
	// Thanh toán
	public float totalCost() {
		for(int i = 0; i < itemsOderedList.size(); i++) {
			totalcost += itemsOderedList.get(i).getCost();
		}
		return totalcost;
	}
	
	/**
     * Prints the cart.
     */
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        System.out.println("1. " +itemsOderedList.get(0).toString());
        for(int i = 1; i < itemsOderedList.size(); i++) {
        	int j = i+1;
        	System.out.println(j + ". " +itemsOderedList.get(i).toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
        
    }

    
    /**
     * Search cart id.
     *
     * @param id the id
     */
    public void searchCartId() {
    	int id, dem = 0;
    	Scanner keyboard =  new Scanner(System.in);
    	System.out.println("Input ID: ");
    	id = keyboard.nextInt(); 
    	for(int i = 0; i < itemsOderedList.size(); i++) {
    		if(id == itemsOderedList.get(i).id) {
    			System.out.println(itemsOderedList.get(i).toString());
    			dem ++;
    			break;
    		}
    	}
    		
    		
    	if(dem == 0) {
    		System.out.println("Don't found this title in your cart!");
    	}

    	
    }
    
    
    /**
     * Search cart by title.
     *
     * @param title the title
     */
    public void searchCartTitle() {
    		String title1;
    		int dem = 0;
    		Scanner keyboard = new Scanner(System.in);
    		String checkString = "1";
    		System.out.println("Input title: ");
    		title1 = keyboard.nextLine();
    		for(int i = 0; i < itemsOderedList.size(); i++) {
    			if(itemsOderedList.get(i).isMatchTitle(title1) == true) {
    				System.out.println(itemsOderedList.get(i).toString());
    				dem ++;
    				break;
    			}
    		}
    		if(dem == 0) {
    			System.out.println("Don't found this title in your cart!");
    		}
    }
}