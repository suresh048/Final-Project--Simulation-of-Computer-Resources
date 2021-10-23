package computerResources;

public class IteratorUnitTest {

	public static void main(String[] args) {
		DisplayType types = new DisplayType();
		Iterator iterator = types.createIterator();
		if(iterator.hasNext()) {
			System.out.println("This method has next display types");
		}
		else {
			System.err.println("Invalid Call to iterator hasNext");
		}
	}

}
