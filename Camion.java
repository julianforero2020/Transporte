
public class Camion
{

  
    private String matricula;

   
    private int capacidad;

   
    private double consumo;

    
    private int cargaActual;

   
   
    public Camion( String pMatricula, int pCapacidad, double pConsumo )
    {
        matricula = pMatricula;
        capacidad = pCapacidad;
        consumo = pConsumo;
        cargaActual = 0;
    }

  
    
    public int darCapacidad( )
    {
        return capacidad;
    }

  
    public double darConsumo( )
    {
        return consumo;
    }

 
    public String darMatricula( )
    {
        return matricula;
    }

    public int darCargaActual( )
    {
        return cargaActual;
    }

   
    public boolean cargar( int pPesoCarga )
    {
        boolean cargo = false;
        if( pPesoCarga <= capacidad )
        {
            cargo = true;
            cargaActual = pPesoCarga;
        }
        return cargo;
    }


    public void descargar( )
    {
        cargaActual = 0;
    }

}