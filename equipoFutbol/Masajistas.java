public class Masajistas extends Seleccion{

    private String titulacion;

    private Integer anosExp;
    
    private Futbolistas f;
    
    public Masajistas(){
        super();
    }
    public Masajistas(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer anosExp){
        super(id, nombre, apellidos, edad);
        this.titulacion=titulacion;
        this.anosExp=anosExp;
    }
    public String getTitulacion(){
        return titulacion;
    }
    public void setTitulacion(String titulacion){
        this.titulacion=titulacion;
    }
    public Integer getAnosExp(){
        return anosExp;
    }
    public void setAnosExp(Integer anosExp){
        this.anosExp=anosExp;
    }
    public void darMasaje(){
        System.out.println("El masajista " + getNombre() + " le da un masaje al jugador "  + f.getNombre());
    }
}
