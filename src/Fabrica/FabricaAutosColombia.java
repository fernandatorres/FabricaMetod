package Fabrica;



public class FabricaAutosColombia extends FabricaAutos
{

	@Override
	public Auto Factorymethod(int tipo) 
	{
		Auto a = null;
		switch (tipo) {
		case 1:
			a = new SedanColombia();
			break;
		case 2:
			a = new ConvertibleColombia();
			
			break;
		case 3:
			a = new TodoTerenoColombia();
			
			break;
		case 4:
			a = new FurgonetaColombia();
			
			break;

		
		}
		
		return a;
		
	}

}
