package appliancePower;

import java.util.Scanner;

public class PowerOutlet 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Laptop laptop = new Laptop();
		PowerOutletFunction ltPo = new LaptopAdapter(laptop);
		
		Refrigerator refrigerator = new Refrigerator();
		PowerOutletFunction refPo = new RefrigeratorAdapter(refrigerator);
		
		SmartphoneCharger charger = new SmartphoneCharger();
		PowerOutletFunction spcPo = new SmartphoneAdapter(charger);
		
		int loop = 0;
		
		while (loop == 0)
		{
			System.out.print("\nChoose a device to plug in:\n\t1. Laptop\n\t2. Refrigerator\n\t3. SmartphoneCharger\n\t4. Leave\nInput here: ");
			
			int choice = input.nextInt();
			
			switch (choice)
			{
				case 1: System.out.println(ltPo.plugIn());
						break;
				case 2: System.out.println(refPo.plugIn());
						break;
				case 3: System.out.println(spcPo.plugIn());
						break;
				case 4: loop++;
						break;
			}
		}
	}
}
