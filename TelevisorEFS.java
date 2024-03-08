
public class TelevisorEFS 
{
	String marca;
	int tamaño;
	boolean encendido; 
	int volumen;
	int canal;
	String[] entrada;

	
	public TelevisorEFS() 
	{
		this.volumen = 0;
		this.canal = 0;
		this.encendido = false;
	}

	
	public void encender() 
	{
		this.encendido= true;
	}
	
	
	public void apagar() 
	{
		this.encendido= false;
	}
	
	
	
	public void VolumenMas() 
	{
		if (encendido && volumen < 100)
		{
		 volumen++;
		}
	}
		
	
	
	public void VolumenMenos() 
	{
		if(encendido && volumen >0) 
		{
		 volumen--;
		}
	}
	
	
	public void CanalMas() 
	{
		if(encendido) 
		{
		canal++;
		}
	}
	
	
	public void CanalMenos() 
	{
		if(encendido && canal>1) 
		{
		canal--;
		}
	}




	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	public int getTamaño() 
	{
		return tamaño;
	}

	public void setTamaño(int tamaño) 
	{
		this.tamaño = tamaño;
	}

	public boolean isEncendido() 
	{
		return encendido;
	}

	public void setEncendido(boolean encendido) 
	{
		this.encendido = encendido;
	}

	public int getVolumen() 
	{
		return volumen;
	}

	public void setVolumen(int volumen) 
	{
		this.volumen = volumen;
	}

	public int getCanal()
	{
		return canal;
	}

	public void setCanal(int canal) 
	{
		this.canal = canal;
	}

	public String[] getEntrada() 
	{
		return entrada;
	}
	
	public void setEntrada(String[] entrada) 
	{
		this.entrada = entrada;
	}	
	
	
}
