

public class Empresa
{
 
    private Camion camion1;

   
    private Camion camion2;

   
    private Camion camion3;

  
    private Camion camion4;

 
   
    public Empresa( )
    {
        camion1 = new Camion( "JHJIC3", 111, 76 );
        camion2 = new Camion( "HGODF", 110, 45 );
        camion3 = new Camion( "GFGFG", 210, 90 );
        camion4 = new Camion( "FGFGG", 200, 180 );

    }

   


    public Camion darCamion1( )
    {
        return camion1;
    }

    public Camion darCamion2( )
    {
        return camion2;
    }

   
    public Camion darCamion3( )
    {
        return camion3;
    }

  
    public Camion darCamion4( )
    {
        return camion4;
    }


    public boolean cargarCamion( String pMatricula, int pPesoCarga )
    {
        boolean cargo = false;
        if( camion1.darMatricula( ).equals( pMatricula ) )
        {
            cargo = camion1.cargar( pPesoCarga );
        }
        else if( camion2.darMatricula( ).equals( pMatricula ) )
        {
            cargo = camion2.cargar( pPesoCarga );
        }
        else if( camion3.darMatricula( ).equals( pMatricula ) )
        {
            cargo = camion3.cargar( pPesoCarga );
        }
        else if( camion4.darMatricula( ).equals( pMatricula ) )
        {
            cargo = camion4.cargar( pPesoCarga );
        }
        return cargo;
    }

    public void descargarCamion( String pMatricula )
    {
        if( camion1.darMatricula( ).equals( pMatricula ) )
        {
            camion1.descargar( );
        }
        else if( camion2.darMatricula( ).equals( pMatricula ) )
        {
            camion2.descargar( );
        }
        else if( camion3.darMatricula( ).equals( pMatricula ) )
        {
            camion3.descargar( );
        }
        else if( camion4.darMatricula( ).equals( pMatricula ) )
        {
            camion4.descargar( );
        }
    }


    public int darCapacidadTotal( )
    {
        return camion1.darCapacidad( ) + camion2.darCapacidad( ) + camion3.darCapacidad( ) + camion4.darCapacidad( );
    }


    public int darCargaTotal( )
    {
        return camion1.darCargaActual( ) + camion2.darCargaActual( ) + camion3.darCargaActual( ) + camion4.darCargaActual( );
    }

  
    public double calcularCargaPromedio( )
    {
        double promedio = ( double ) ( darCargaTotal( ) / 4 );
        return promedio;
    }

   
    public Camion darMejorCamion( int pPesoCarga )
    {
        Camion mejor = null;
        if( camion1.darCapacidad( ) >= pPesoCarga )
        {
            mejor = camion1;
        }
        if( camion2.darCapacidad( ) >= pPesoCarga && camion2.darConsumo( ) < mejor.darConsumo( ) )
        {
            mejor = camion2;
        }
        if( camion3.darCapacidad( ) >= pPesoCarga && camion3.darConsumo( ) < mejor.darConsumo( ) )
        {
            mejor = camion3;
        }
        if( camion4.darCapacidad( ) >= pPesoCarga && camion4.darConsumo( ) < mejor.darConsumo( ) )
        {
            mejor = camion4;
        }
        return mejor;
    }



 
    public String metodo1( )
    {
        return "Respuesta 1.";
    }

    public String metodo2( )
    {
        return "Respuesta 2.";
    }

}