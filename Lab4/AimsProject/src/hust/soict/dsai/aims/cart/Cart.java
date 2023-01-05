//Họ và tên: Trần Văn Hiếu
//MSSV: 20200231
//Mã lớp TH: 721428

package hust.soict.dsai.aims.cart;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	//Khai bao danh sach item
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<Media> itemsOrdered = new ArrayList<Media>();
    //Them item
    public boolean addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            return false;
        }
        itemsOrdered.add(media);
        return true;
    }
    //Them item vao gio hang
    public boolean addMedia(Media... medialist) {
        if (itemsOrdered.size() + medialist.length > MAX_NUMBERS_ORDERED) {
            System.out.println("Cart is too full after add items in list. Can't add!");	//Gio hang day
            return false;
        }
        Collections.addAll(itemsOrdered, medialist);	//Them nguyen danh sach vao gio hang
        return true;
    }
    //Xoa item khoi gio hang
    public boolean removeMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            System.out.println("The media is not in the cart. Can't remove!");	//Gio hang trong
            return false;
        }
        itemsOrdered.remove(media);
        return true;
    }
    //Tinh tien
    public double totalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    //Hoa don
    public void displayCart() {
        System.out.println("Cart: ");
        for (int i = 0; i < itemsOrdered.size(); i++)
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        System.out.format("Total cost: %.2f$\n", totalCost());
    }
    //Tìm kiem trong gio hang theo id
    public Media searchCart(int id) {
        return itemsOrdered.stream().filter(media -> media.getId() == id).findFirst().orElse(null);
    }
    //Tìm kiem trong gio hang theo tieu de
    public Media searchCart(String title) {
        return itemsOrdered.stream().filter(media -> media.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }
    //Sap xep trong gio hang theo tieu de
    public void sortCartByTitle(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }
    //Sao xep trong gio hang theo id
    public void sortCartByCost(){
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
}
