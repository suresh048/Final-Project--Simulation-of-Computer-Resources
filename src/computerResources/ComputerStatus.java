package computerResources;

public class ComputerStatus implements State {

	@Override
	public void checkStatus(Context context) {
		try {
			System.out.println("Installation is going on please dont turn of your computer...");
			Thread.sleep(1000);
			System.out.println(" Your Display or Processor installation might not compatible for this computer");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Context menu = new Context();
		ResourceTypeStatus state= new ResourceTypeStatus();
		state.checkStatus(menu);
		
	}	
}

