package computerResources;

public class ProcessorTypeIterator implements Iterator{
	
	Processor [] processorType;
	int count;
	
	public ProcessorTypeIterator(Processor [] processorType) {
		this.processorType= processorType;
	}

	@Override
	public boolean hasNext() {
		if(count > processorType.length || processorType[count] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Resources next() {
		Processor processorCount = (Processor) processorType[count];
		count = count +1;
		
		return processorCount;
	}

}
