package appliancePower;

public class LaptopAdapter implements PowerOutletFunction
{
	private Laptop laptop;
	
	public LaptopAdapter(Laptop laptop)
	{
		this.laptop = laptop;
	}
	
	public String plugIn()
	{
		return Laptop.charge();
	}
}
