package computerResources;

public class ViewResourceTypeState implements State{
	public void checkStatus(Context context) {
		ResourceFactory resourceFactory = new ResourceFactory();
		resourceFactory.chooseResource();
	}

}
