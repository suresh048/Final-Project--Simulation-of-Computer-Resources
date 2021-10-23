package computerResources;

public class PrintProcessorTypes implements PrintResourceType{
	
	Processor processor;
	ProcessorType processorType;
	
	public PrintProcessorTypes(ProcessorType processorType) {
		this.processorType=processorType;
	}

	@Override
	public void printType() {
	
			Iterator iterateProcessorType = processorType.createIterator();
			printType(iterateProcessorType);
		}
	private void printType(Iterator iterator) {
		System.out.println("\n\n\n\n-------Processor Types--------\n\n");
		
		 
		while(iterator.hasNext()){
			  Processor processor = (Processor) iterator.next();
			  
			  System.out.print(processor.getResourceName() + "\t");
			  System.out.print(processor.getResourceType()+"\t");
			  System.out.println(" $"+processor.getCost()+"\n");
			
		}
		 
	}

}
