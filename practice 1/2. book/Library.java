package book;

public class Library {

	public static void main(String[] args) {
		Book b1 = new Book("James Barrie", "Peter Pan", 414, 130, 200);
		Book b2 = new Book("Charles Dickens", "David Copperfield", 0, 130, 200);
		Book b3 = new Book("Pavel Bazhov", "Tales", 182, 205, 260);
		b2.setPageQuantity(942);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
