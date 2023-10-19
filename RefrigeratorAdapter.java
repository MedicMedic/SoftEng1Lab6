package appliancePower;

public class RefrigeratorAdapter implements PowerOutletFunction
{
	private Refrigerator fridge;
	
	public RefrigeratorAdapter(Refrigerator fridge)
	{
		this.fridge = fridge;
	}
	
	public String plugIn()
	{
		return Refrigerator.startCooling();
	}
}
