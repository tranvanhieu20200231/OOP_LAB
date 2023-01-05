//Họ và tên: Trần Văn Hiếu
//MSSV: 20200231
//Mã lớp TH: 721428

package hust.soict.dsai.aims.media.book;

import java.util.*;

import hust.soict.dsai.aims.media.Media;
	//Ke thua lop media
public class Book extends Media {

    private List<String> authors = new ArrayList<String>();

    public Book() {
    }
    //Khai bao id, tieu de, the loai, gia, tac gia
    public Book(int id, String title, String category, double cost, String... authors) {
        super(id, title, category, cost);
        Collections.addAll(this.authors, authors);
    }
    //Them ten tac gia
    public boolean addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            System.out.println("Author already exists!");	//Tac gia da ton tai
            return false;
        }
        authors.add(authorName);
        return true;
    }
    //Xoa ten tac gia
    public boolean removeAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            System.out.println("Author doesn't exist!");	//Tac gia khong ton tai
            return false;
        }
        authors.remove(authorName);
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %.2f$", title, category, cost);
    }
}