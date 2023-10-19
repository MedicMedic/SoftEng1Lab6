package appliancePower;

public class SmartphoneAdapter implements PowerOutletFunction
{
	private SmartphoneCharger phoneCharger;
	
	public SmartphoneAdapter(SmartphoneCharger phoneCharger)
	{
		this.phoneCharger = phoneCharger;
	}
	
	public String plugIn()
	{
		return SmartphoneCharger.chargePhone();
	}
}
