package computerResources;

public class ProcessorType {
	
	int numOfItems=0;
	Processor[] processorType;
	
	public ProcessorType() {
		processorType=new Processor[4];
		
		processorType[0]=new M1();
		processorType[1]=new Amd();
		processorType[2]=new Intel();
		
		
	}
	public Iterator createIterator() {
		return new ProcessorTypeIterator
				(processorType);
	}

}
