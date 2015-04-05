package Fabrica;



public class Cliente 
{
	
	public static void main(String...args)
	{
		
		crearAuto(3);
	}
	
	public static void crearAuto(int tipo)
	{
		FabricaAutos fa = new FabricaAutosAlemania();
		Auto ma = fa.Factorymethod(tipo);
		System.out.println(tipo +": "+ ma.darNombre());
		
			
			
		
	}

}
