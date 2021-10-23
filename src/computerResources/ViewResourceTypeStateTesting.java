package computerResources;
// Testing state pattern for one state
public class ViewResourceTypeStateTesting {
	public static void main(String[] args) {
		Context context = new Context();
		ViewResourceTypeState state= new ViewResourceTypeState();
		state.checkStatus(context);
	}

}
