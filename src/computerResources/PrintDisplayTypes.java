package computerResources;

public class PrintDisplayTypes implements PrintResourceType {
	
	Display display;
	DisplayType displayType;
	
	 public PrintDisplayTypes(DisplayType displayType ) {
		this.displayType=displayType;
	}

	@Override
	public void printType() {
		Iterator iterateDisplayType = displayType.createIterator();
		printType(iterateDisplayType);
	}
	
	private void printType(Iterator iterator) {
		System.out.println("\n\n\n\n-------------------Display Types-------------------\n\n");
		
		 
		while(iterator.hasNext()){
			  Display display = (Display) iterator.next();
			  
			  System.out.print(display.getResourceName() + "\t");
			  System.out.print(display.getResourceType()+"\t");
			  System.out.println(" $"+display.getCost()+"\n");
			
		}
}
}
