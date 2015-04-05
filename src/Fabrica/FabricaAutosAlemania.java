package Fabrica;

public class FabricaAutosAlemania extends FabricaAutos
{

	@Override
	public Auto Factorymethod(int tipo)
	{
		Auto a = null;
		switch (tipo) {
		case 1:
			a = new SedanAlemania();
		case 2:
			a = new ConvertibleAlemania();
			
			break;
		case 3:
			a = new TodoterrenoAlemania();
			
			break;
		case 4:
			a = new FurgonetaAlemania();
			
			break;

		
		}
		return a;
	}

}
