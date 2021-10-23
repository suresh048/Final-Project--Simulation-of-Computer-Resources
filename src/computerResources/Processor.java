package computerResources;

public abstract class Processor extends Resources{
	
	String processorType;
	public void setResourceType() {
		this.resourceType="Processor";
	}
	public String getProcessorType() {
		return processorType;
	}
	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

}
