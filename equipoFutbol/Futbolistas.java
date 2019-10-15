public class Futbolistas extends Seleccion{

    private Integer dorsal;

    private String demarcacion;
    
    public Futbolistas(){
        super();
    }
    public Futbolistas(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer anosExp){
        super(id, nombre, apellidos, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }
    public String getDemarcacion(){
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion){
        this.demarcacion=demarcacion;
    }
    public Integer getDorsal(){
        return dorsal;
    }
    public void setDorsal(Integer dorsal){
        this.dorsal=dorsal;
    }
    public void jugarPartido(){
        System.out.println("El jugador " + getNombre() + " que tiene el dorsal " + getDorsal() + " y la demarcacion " + getDemarcacion() + " juega en el partido");
    }
    public void entrenar(){
        System.out.println("El jugador " + getNombre() + " Entrena el diariamente");
    }
}