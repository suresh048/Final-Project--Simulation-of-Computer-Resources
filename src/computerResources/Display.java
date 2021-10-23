package computerResources;

public abstract class Display extends Resources {
	String displayType;
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public void setResourceType() {
		this.resourceType="Display";
	}

}
