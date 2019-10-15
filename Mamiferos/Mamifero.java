public class Mamifero
{
    protected String nombre;
    protected Integer edad;
    protected Integer patas;
    public Mamifero()
    {
    
    }
    public Mamifero(String nombre,Integer edad,Integer patas)
    {
      this.nombre=nombre;
      this.edad=edad;
      this.patas=patas;
    }
    public void imprimirDatos()
    {
     System.out.println ("El nombre del mamifero es: "+getNombre() +"\n La edad del mamifero es: "+getEdad()+"\n El numero de patas es: "+getPatas());
    }
    public void mama()
    {
     System.out.println ("Los mamiferos maman");
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Integer getEdad(){
        return this.edad;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public Integer getPatas(){
        return this.patas;
    }
    public void setPatas(Integer patas){
        this.patas = patas;
    }
}