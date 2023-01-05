//Họ và tên: Trần Văn Hiếu
//MSSV: 20200231
//Mã lớp TH: 721428

public class DigitalVideoDisc {
	private static int nbDigitalVideoDisc = 0;
	private int id;
	private String title;
	private String category;
	private String directory;
	private int lenght;
	private float cost;
	// Tạo đối tượng DVD theo tiêu đề
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	// Tạo đối tượng DVD theo tiêu đề, danh mục, chi phí
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	// Tạo đối tượng DVD theo tiêu đề, danh mục, chi phí, ID
	public DigitalVideoDisc(String title, String category, float cost, int id) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	// Tạo đối tượng DVD theo tiêu đề, danh mục, đạo diễn, chi phí
	public DigitalVideoDisc(String title, String category, String directory, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.cost = cost;
	}
	// Tạo đối tượng DVD theo tiêu đề, danh mục, đạo diễn, thời lượng, chi phí
	public DigitalVideoDisc(String title, String category, String directory, int lenght, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.lenght = lenght;
		this.cost = cost;
	}
	// Tạo đối tượng DVD theo tiêu đề, danh mục, đạo diễn, thời lượng, chi phí, ID
	public DigitalVideoDisc(String title, String category, String directory, int lenght, float cost, int id) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.lenght = lenght;
		this.cost = cost;
	// Khởi tạo setters và getters cho các thuộc tính private
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDirectory() {
		return directory;
	}
	public int getLenght() {
		return lenght;
	}
	public float getCost() {
		return cost;
	}	
	// In ra thông tin sản phẩm bao gồm: tiêu đề, danh mục, đạo diễn, thời lượng, chi phí
	@Override
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + directory + " - "
				+ lenght + ": " + cost + "$";
	}
	// Hàm kiểm tra xem tiêu đề nhập vào có trùng với tiêu đề trong giỏ hàng không
	public boolean isMatchTitle(String title1) {
		return this.getTitle().equals(title1);
	}
}