package book;

public class Book {
	private String author;
	private String title;
	private int pageQuantity;
	private int pageWidth;
	private int pageHeigth;
	
	public Book(String author, String title, int pageQuantity, int pageWidth, int pageHeigth) {
		this.author = author;
		this.title = title;
		this.pageQuantity = pageQuantity;
		this.pageWidth = pageWidth;
		this.pageHeigth = pageHeigth;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageQuantity() {
		return pageQuantity;
	}

	public void setPageQuantity(int pageQuantity) {
		this.pageQuantity = pageQuantity;
	}

	public int getPageWidth() {
		return pageWidth;
	}

	public void setPageWidth(int pageWidth) {
		this.pageWidth = pageWidth;
	}

	public int getPageHeigth() {
		return pageHeigth;
	}

	public void setPageHeigth(int pageHeigth) {
		this.pageHeigth = pageHeigth;
	}
	
	public String toString()
	{
		return "a " + this.pageQuantity + "-pages book called \"" + this.title + "\" by " + this.author +
				" released in a size of " + this.pageWidth + " x " + this.pageHeigth + " mm";
	}
}