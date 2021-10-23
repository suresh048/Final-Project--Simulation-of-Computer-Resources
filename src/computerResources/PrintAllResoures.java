package computerResources;

public class PrintAllResoures {
	
	public PrintAllResoures() {
		DisplayType displayType=new DisplayType();
		PrintDisplayTypes printDisplayTypes= new PrintDisplayTypes(displayType);
		ProcessorType processorType= new ProcessorType();
		PrintProcessorTypes printProcessorTypes=new PrintProcessorTypes(processorType);
		
	
	}

	public void PrintDisplayType() {
		DisplayType displayType=new DisplayType();
		PrintDisplayTypes printDisplayTypes= new PrintDisplayTypes(displayType);
		printDisplayTypes.printType();
	}
	public void PrintProcessorType() {
		ProcessorType processorType=new ProcessorType();
		PrintProcessorTypes printProcessorTypes=new PrintProcessorTypes(processorType);
		printProcessorTypes.printType();
	}
}
