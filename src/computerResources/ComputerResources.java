package computerResources;

import java.util.Scanner;


public class ComputerResources implements State{

	@Override
	public void checkStatus(Context context) {
		
			Scanner usrInpt = new Scanner(System.in);
			
			System.out.println("-------- Simulation of Computer Resources--------\n"); 
			System.out.println("First Select the Display and Processor you want to install... ");
			System.out.println(" ==============Resource Selection=========\n"+
			"1) Resource Selections \n"+ 
			
			"2)Status of Computer\n"+
			"3)Lobby");

			int choice=usrInpt.nextInt();
			if(choice==1) {
				ViewResourceTypeState state = new ViewResourceTypeState();
				state.checkStatus(context);
			}else if(choice==2) {
				ComputerStatus status= new ComputerStatus();
				status.checkStatus(context);
			}
			else {
			System.exit(0);
		}
		context.setState(this);
	}	
		
}
