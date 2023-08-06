package arraylist;

public class ListApp {

	public static void main(String[] args) {
		  ArrayList<String> list = new ArrayList<>();
	        System.out.println("List: " + list);

	        // Add some items to the list
	        list.addItem("apple");
	        list.addItem("banana");
	        list.addItem("cherry");
	        System.out.println("List: " + list);

	        // Try to add an item to a full list
	        boolean result = list.addItem("date");
	        System.out.println("Add result: " + result);
	        System.out.println("List: " + list);

	        ArrayList<String> stringList = new ArrayList<>();
	        stringList.addItem("apple");
	        stringList.addItem("banana");
	        stringList.addItem("cherry");
	        System.out.println("String list: " + stringList);

	        // Create a list of Squares
	        ArrayList<Square> squareList = new ArrayList<>();
	        squareList.addItem(new Square(18.0));
	        squareList.addItem(new Square(24.0));
	        squareList.addItem(new Square(38.0));
	        System.out.println("Square list: " + squareList);

	        // Create a list of Points
	        ArrayList<PointThreeD> pointList = new ArrayList<>();
	        pointList.addItem(new PointThreeD(1, 2, 3));
	        pointList.addItem(new PointThreeD(4, 5, 6));
	        pointList.addItem(new PointThreeD(7, 8, 9));
	        System.out.println("Point list: " + pointList);
	        
	}

}
