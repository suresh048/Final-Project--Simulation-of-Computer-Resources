package computerResources;

public class DisplayType {
	int numOfItems=0;
	Display[] displayType;
	
	public DisplayType() {
		displayType = new Display[6];
		displayType[0] = new Lcd();
		displayType[1] = new Led();
		displayType[2] = new Oled();
		displayType[3] = new CRT();
		displayType[4] = new Plasma();
	}
	
	public Iterator createIterator() {
		return new DisplayTypeIterator(displayType);
	}
}
