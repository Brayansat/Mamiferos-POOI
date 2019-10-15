import java.util.*;
public class Perro extends Mamifero
{
    private String amo;
    public Perro()
    {
      super();
    }
    public Perro(String nombre,Integer edad,Integer patas,String amo)
    { 
        super(nombre,edad,patas);
        this.amo=amo;
    }
    @Override
    
     public void imprimirDatos()
    {
        super.imprimirDatos();
        System.out.println(" El perro: "+getNombre()+"tiene un amo y se llama: "+getAmo());
    }
    public void ladrar()
    {
       System.out.println("El perro:"+getNombre()+"ladra: Guau Guau");
    }
    public void cuidarAmo()
    {
       System.out.println("Soy el mejor amigo del hombre y mi funcion es cuidar a: "+getAmo());
    }
    public String getAmo(){
        return this.amo;
    }
    public void setAmo(String amo){
        this.amo = amo;
    }
}