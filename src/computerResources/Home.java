package computerResources;

public class Home {
 public static void main(String[] args) {
			Context context = new Context();
			ComputerResources resource= new ComputerResources();
			resource.checkStatus(context);
}
}