public class Entrenadores extends Seleccion{

    private String idFederacion;
    
    public Entrenadores(){
        super();
    }
    public Entrenadores(Integer id, String nombre, String apellidos, Integer edad, String idFederacion){
        super(id, nombre, apellidos, edad);
        this.idFederacion=idFederacion;
    }
    public String getIdFederacion(){
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion){
        this.idFederacion=idFederacion;
    }
}
