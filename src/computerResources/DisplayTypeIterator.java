package computerResources;

public class DisplayTypeIterator implements Iterator {
	
	Display[] displayType;
	int count;
	
	public DisplayTypeIterator(Display[] displayType) {
		this.displayType=displayType;
	}

	@Override
	public boolean hasNext() {
		if(count>displayType.length ||displayType[count]==null) {
			return false;
			
	}else {
		return true;
	}
	}
	@Override
	public Resources next() {
		Display displayCount = (Display) displayType[count];
		count = count +1;
		
		return displayCount;
	
	}

}
