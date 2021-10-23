package computerResources;

import java.util.Scanner;

public class ResourceFactory {
	public void chooseResource() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n------------Select Resource Type----------------\n\n"+
		"\n"+
		"1) Display Resources\n"+
		"2) Processor Resources\n"+
		"3) Main Menu");
		
		
		int resourceChoice = input.nextInt();
		
		
		if(resourceChoice ==1) {
			DisplayType displayType = new DisplayType();
			PrintDisplayTypes printDisplayTypes = new PrintDisplayTypes(displayType);
			
			printDisplayTypes.printType();
		}
		else if (resourceChoice ==2) {
			ProcessorType processorType = new ProcessorType();
			PrintProcessorTypes printProcessorTypes=new PrintProcessorTypes(processorType);
			
			printProcessorTypes.printType();
		}else {
	
		Context context = new Context();
		ComputerResources resource = new ComputerResources();
		resource.checkStatus(context);
		
		}
		Context context = new Context();

		ResourceTypeStatus status = new ResourceTypeStatus();
		status.checkStatus(context);
		
	}

}


