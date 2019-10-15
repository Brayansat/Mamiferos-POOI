public class Cajero{
    double cupo;
    boolean estado;
    String ubicacion;
    int retiro_Max;

    public Cajero(){

    }

    public Cajero(double cupo, boolean estado,String ubicacion, int retiro_Max){
        this.cupo=cupo;
        this.estado=estado;
        this.ubicacion=ubicacion; 
        this.retiro_Max=retiro_Max;

    }

    public double getCupo(){
        return cupo;
    }
    
    public boolean getEstado(){
        return estado;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public int getRetiro_Max(){
        return retiro_Max;
    }
        
}