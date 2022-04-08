package Prototype;

public class ProgMain {

	public static void main(String[] args) {
		Bookshop carturesti=Bookshop.loadDataFromDB("carturesti");
		System.out.println(carturesti);
		Bookshop diverta=carturesti;
		diverta.getListBooks().remove(2);
		
		System.out.println("Shallow copy");
		

	}
}
