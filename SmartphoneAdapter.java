package appliancePower;

public class SmartphoneAdapter implements PowerOutlet
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
