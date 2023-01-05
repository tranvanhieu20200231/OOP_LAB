//Họ và tên: Trần Văn Hiếu
//MSSV: 20200231
//Mã lớp TH: 721428

package hust.soict.dsai.aims.media.disc;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.playable.Playable;

public abstract class Disc extends Media implements Playable{

    protected int length;
    protected String director;

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public Disc() {
    }
    //Khai bao id, tieu de, the loai, gia, tac gia, san xuat
    public Disc(int id, String title, String category, double cost, String director) {
        super(id, title, category, cost);
        this.director = director;
    }
    //Khai bao id, tieu de, the loai, gia, tac gia, san xuat, do dai
    public Disc(int id, String title, String category, double cost, String director, int length) {
        this(id, title, category, cost, director);
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %d minutes(s): %.2f$", title, category, director, length, cost);
    }
}