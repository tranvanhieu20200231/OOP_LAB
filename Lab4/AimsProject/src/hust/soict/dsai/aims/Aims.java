//Họ và tên: Trần Văn Hiếu
//MSSV: 20200231
//Mã lớp TH: 721428

package hust.soict.dsai.aims;

import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.book.Book;
import hust.soict.dsai.aims.media.disc.CompactDisc;
import hust.soict.dsai.aims.media.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.disc.Disc;
import hust.soict.dsai.aims.store.Store;

public class Aims {

    private static final Scanner scanner = new Scanner(System.in);
    private Store store = new Store();
    private Cart cart = new Cart();

    public Aims() {
    }

    public Aims(Media... mediaList) {
        for (Media media : mediaList)
            store.addMedia(media);
    }

    class PrintMenuGetChoice {
    	// Menu AIMS
        public static int welcome() {
            System.out.println("\nAIMS - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. View store"); 		//Xem cua hang
            System.out.println("2. Update store");		//Cap nhat cua hang
            System.out.println("3. See current cart");	//Xem gio hang hien tai
            System.out.println("0. Exit");				//Thoat
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");	//Lua chon chuc nang
            return scanner.nextInt();
        }
        // Menu xem cua hang
        public static int viewStore() {
            System.out.println("\nView store - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media\'s details");	//Xem thong tin
            System.out.println("2. Add a media to cart");		//Them DVD
            System.out.println("3. Play a media");				//Choi meida
            System.out.println("4. See current cart");			//Xem gio hang hien tai
            System.out.println("0. Back");						//Thoat
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");	//Lua chon chuc nang
            return scanner.nextInt();
        }
        // Menu cap nhat cua hang
        public static int updateStore() {
            System.out.println("\nUpdate store - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a new item");	//Them item
            System.out.println("2. Remove an item");	//Xoa item
            System.out.println("0. Back");				//Thoat
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");	//Lua chon chuc nang
            return scanner.nextInt();
        }
        // Menu them item
        public static int addNewMedia() {
            System.out.println("\nAdd new media - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a new book");	//Them sach
            System.out.println("2. Add a new CD");		//Them CD
            System.out.println("3. Add a new DVD");		//Them DVD
            System.out.println("0. Back");				//Thoat
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");	//Lua chon chuc nang
            return scanner.nextInt();
        }
        // Menu xem gio hang
        public static int viewCart() {
            System.out.println("\nView cart - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");		//Loc item trong gio hang
            System.out.println("2. Sort medias in cart");		//Sap xep
            System.out.println("3. Remove media from cart");	//Xoa item ra khoi gio hang
            System.out.println("4. Play a media");				//Choi nhac
            System.out.println("5. Place order");				//Dat hang
            System.out.println("0. Back");						//Thoat
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");	//Lua chon chuc nang
            return scanner.nextInt();
        }
        //Menu chi tiet
        public static int mediaDetails() {
            System.out.println("\nMedia details - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");	//Them item vao gio hang
            System.out.println("2. Play");			//Choi nhac
            System.out.println("0. Back");			//Thoat
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");	//Lua chon chuc nang
            return scanner.nextInt();
        }
        //Menu tim kiem trong gio hang
        public static int filterCart() {
            System.out.println("\nFilter cart - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter by id");	//Tim theo id
            System.out.println("2. Filter by title");//Tim theo tieu de
            System.out.println("0. Back");			//Thoat
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");	//Lua chon chuc nang
            return scanner.nextInt();
        }
        //Menu sap xep gio hang
        public static int sortCart() {
            System.out.println("\nSort cart - Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Sort by title");	//Xep theo tieu de
            System.out.println("2. Sort by cost");	//Xep theo do dai
            System.out.println("0. Back");			//Thoat
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");	//Lua chon chuc nang
            return scanner.nextInt();
        }
    }
    //Lua chon
    public void start() {
        while (true) {
            int choice = PrintMenuGetChoice.welcome();
            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    viewCart();
                    break;
                case 0:
                    System.out.println("Goodbye!");	//Tam biet
                    return;
                default:
                    System.out.println("Invalid choice!");	//Khong hop le
                    break;
            }
        }
    }

    private void viewStore() {
        store.printDetail();
        while (true) {
            switch (PrintMenuGetChoice.viewStore()) {
                case 1: {
                    System.out.println("Enter the title of media you want to search: "); //Nhap tieu de muon tim kiem
                    scanner.nextLine();
                    Media foundMedia = store.searchMedia(scanner.nextLine());
                    if (foundMedia == null) {
                        System.out.println("Media not found!");	//Phuong tien khong ton tai
                    } else {
                        foundMedia.printDetail();
                        switch (PrintMenuGetChoice.mediaDetails()) {
                            case 1:
                                if (!cart.addMedia(foundMedia))
                                    System.out.println("The cart is full. Can't add more!"); //Gio hang day
                                else
                                    System.out.println("Added to cart successfully!");	//Da them item vao gio hang
                                break;
                            case 2:
                                if (foundMedia instanceof Disc) {
                                    Disc foundDisc = (Disc) foundMedia;
                                    foundDisc.play();
                                } else {
                                    System.out.println("Media is not CD or DVD. Can't play!");	//CD va DVD khong the chay
                                }
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Invalid choice!");	//Lua chon khong hop le
                                break;
                        }
                    }
                }
                    break;
                case 2: {
                    store.printDetail();
                    System.out.println("Enter the title of media you want to add to store: ");	//Nhap tieu de iteam muon them
                    scanner.nextLine();
                    Media foundMedia = store.searchMedia(scanner.nextLine());
                    if (foundMedia == null) {
                        System.out.println("Media not found!"); //Khong tim thay
                    } else {
                        if (cart.addMedia(foundMedia))
                            System.out.println("Added to cart successfully!"); //Them thanh cong
                        else
                            System.out.println("The media is already in the store. Can't add!"); //Da ton tai, khong the them
                    }
                }
                    break;
                case 3: {
                    System.out.println("Enter the title of media you want to play: ");	//Nhap item muon chay
                    scanner.nextLine();
                    Media foundMedia = store.searchMedia(scanner.nextLine());
                    if (foundMedia == null) {
                        System.out.println("Media not found!");	//Khong the chay
                    } else if (foundMedia instanceof Disc) {
                        Disc foundDisc = (Disc) foundMedia;
                        foundDisc.play();
                    } else {
                        System.out.println("Media is not CD or DVD. Can't play!");	//Item la CD hoac DVD khong the chay
                    }
                }
                    break;
                case 4:
                    cart.displayCart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");	//Lua chon khong hop le
                    break;
            }
        }
    }

    private void updateStore() {
        while (true) {
            switch (PrintMenuGetChoice.updateStore()) {
                case 1:
                    switch (PrintMenuGetChoice.addNewMedia()) {
                        case 1: {
                            System.out.println("Enter new book informations: ");	//Nhap thong tin sach moi
                            System.out.println("Id: "); 	//Nhap id
                            scanner.nextLine();
                            int id = scanner.nextInt();
                            System.out.println("Title: ");	//Nhap tieu de
                            scanner.nextLine();
                            String title = scanner.nextLine();
                            System.out.println("Category: ");	//Nhap the loai
                            String category = scanner.nextLine();
                            System.out.println("Cost: ");	//Nhap gia
                            double cost = scanner.nextDouble();
                            System.out.println("Author: ");	//Nhap tac gia
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            Book newBook = new Book(id, title, category, cost, author);
                            store.addMedia(newBook);
                        }
                            break;
                        case 2: {
                            System.out.println("Enter new CD informations: ");	//Nhap thong tin CD moi
                            System.out.println("Id: ");	//Nhap id
                            scanner.nextLine();
                            int id = scanner.nextInt();
                            System.out.println("Title: ");	//Nhap tieu de
                            scanner.nextLine();
                            String title = scanner.nextLine();
                            System.out.println("Category: ");	//Nhap the loai
                            String category = scanner.nextLine();
                            System.out.println("Cost: ");	//Nhap gia
                            double cost = scanner.nextDouble();
                            System.out.println("Director: ");	//Nhap ten nha san xuat
                            scanner.nextLine();
                            String director = scanner.nextLine();
                            System.out.println("Artist: ");		//Nhap nghe si
                            String artist = scanner.nextLine();
                            CompactDisc newCD = new CompactDisc(id, title, category, cost, director, artist);
                            store.addMedia(newCD);
                        }
                            break;
                        case 3: {
                            System.out.println("Enter new DVD informations: ");	//Nhap thong tin DVD moi
                            System.out.println("Title: ");	//Nhap tieu de
                            scanner.nextLine();
                            String title = scanner.nextLine();
                            System.out.println("Category: ");	//Nhap the loai
                            String category = scanner.nextLine();
                            System.out.println("Cost: ");	//Nhap gia
                            Double cost = scanner.nextDouble();
                            System.out.println("Director: ");	//Nhap ten nha san xuat
                            scanner.nextLine();
                            String director = scanner.nextLine();
                            System.out.println("Length: ");	//Nhap do dai
                            int length = scanner.nextInt();
                            DigitalVideoDisc newDVD = new DigitalVideoDisc(title, category, cost, director, length);
                            store.addMedia(newDVD);
                        }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");	//Khong hop le
                            break;
                    }
                    break;
                case 2:
                    store.printDetail();
                    System.out.println("Enter the title of media you want to delete: "); //Nhap tieu de item muon xoa
                    scanner.nextLine();
                    Media foundMedia = store.searchMedia(scanner.nextLine());
                    if (foundMedia == null)
                        System.out.println("Media not found!");	//Item khong ton tai
                    else {
                        store.removeMedia(foundMedia);
                        System.out.println("Deleted successfully!"); //Xoa thanh cong
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!"); //Khong hop le
                    break;
            }
        }
    }

    private void viewCart() {
        cart.displayCart();
        while (true) {
            switch (PrintMenuGetChoice.viewCart()) {
                case 1:
                    switch (PrintMenuGetChoice.filterCart()) {
                        case 1: {
                            System.out.println("Enter the id of media you want to filter: "); //Nhap id item can tim
                            scanner.nextLine();
                            Media mediaFound = cart.searchCart(scanner.nextInt());
                            if (mediaFound == null)
                                System.out.println("Media not found!"); //Item khong ton tai
                            else
                                System.out.println(mediaFound.toString());
                        }
                            break;
                        case 2: {
                            System.out.println("Enter the title of media you want to filter: ");	//Nhap tieu de item can tim
                            scanner.nextLine();
                            Media mediaFound = cart.searchCart(scanner.nextLine());
                            if (mediaFound == null)
                                System.out.println("Media not found!");	//Item khong ton tai
                            else
                                System.out.println(mediaFound.toString());
                        }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");	//Khong hop le
                            break;
                    }
                    break;
                case 2:
                    switch (PrintMenuGetChoice.sortCart()) {
                        case 1:
                            cart.sortCartByTitle();
                            cart.displayCart();
                            break;
                        case 2:
                            cart.sortCartByCost();
                            cart.displayCart();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid choice!");	//Khong hop le
                            break;
                    }
                    break;
                case 3: {
                    System.out.println("Enter the title of media you want to delete: ");	//Nhao tieu de item muon xoa
                    scanner.nextLine();
                    Media foundMedia = cart.searchCart(scanner.nextLine());
                    if (foundMedia == null)
                        System.out.println("Media not found!");	//Khong ton tai
                    else {
                        cart.removeMedia(foundMedia);
                        System.out.println("Deleted successfully!");	//Xoa thanh cong
                    }
                }
                    break;
                case 4:
                    System.out.println("Enter the title of media you want to play: ");	//Nhap tieu de item muon chay
                    scanner.nextLine();
                    Media foundMedia = cart.searchCart(scanner.nextLine());
                    if (foundMedia == null) {
                        System.out.println("Media not found!");	//Khong ton tai
                    } else if (foundMedia instanceof Disc) {
                        Disc foundDisc = (Disc) foundMedia;
                        foundDisc.play();
                    } else {
                        System.out.println("Media is not CD or DVD. Can't play!");	//Item laf CD hoac DVD khong the chay
                    }
                    break;
                case 5:
                    System.out.println("Order is created!");	//Khoi tao don hang
                    cart = new Cart();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");	//Khong hop le
                    break;
            }
        }
    }
}