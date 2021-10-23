package computerResources;

import java.util.Scanner;

public class ResourceTypeStatus implements State {

	@Override
	public void checkStatus(Context context) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Continue your installation....-----\n" + 
		"1) Resource Selections \n" + "2) Status of Computer\n"+"3) End");
		
		System.out.print("");

		int input = sc.nextInt();
		
		if(input ==1) {
			ViewResourceTypeState viewResources = new ViewResourceTypeState();
			viewResources.checkStatus(context);
		}else if(input==2) {
			ComputerStatus status= new ComputerStatus();
			status.checkStatus(context);
		}
		
		else {
			System.exit(0);
		}
	context.setState(this);
	}

}


