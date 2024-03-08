
public class TelevisorEFS 
{
	String marca;
	int tamaño;
	boolean encendido; 
	int volumen;
	int canal;
	String entrada;
	
	
	
	public boolean encender() 
	{
		return encendido;
	}
	
	
	public int VolumenMas() 
	{
		return volumen++;
	}
	
	
	public int VolumenMenos() 
	{
		return volumen--;
	}
	
	
	public int CanalMas() 
	{
		return canal++;
	}
	
	
	public int CanalMenos() 
	{
		return canal--;
	}	
	
}
