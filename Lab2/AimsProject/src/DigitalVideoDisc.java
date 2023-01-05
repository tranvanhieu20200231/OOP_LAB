
public class DigitalVideoDisc {
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
	// Khởi tạo setters và getters cho các thuộc tính private
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
}